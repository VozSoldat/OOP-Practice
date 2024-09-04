public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//      deklarasi variabel
        int x = 0;
        int y = 1;
        float a = 1f;
        double b = 2.f;

        int z = x;

        String nama1 = "Erril";
//            pemendekan deklarasi string yaitu "Syntatic Sugar"
        String nama2 = new String("Erril");
//            karena String adalah data type reference, di atas adalah versi asli deklarasi/instansiasi variabel String
        System.out.println("Nama 1: " + nama1);
        String nama3 = nama1;
        nama1 = "Jono";
        System.out.println("Nama 1 setelah diganti : " + nama1);
        System.out.println("Nama 3: " + nama3);

//        kalau static
        int hasil = Tambah(1,2);
        System.out.println("Hasil: "+hasil);

//        kalau tidak static
//        Main m = new Main();
//        m.Tambah(1,2);

        System.out.println("Is Ganjil?"+IsGanjil(2));

        System.out.println("TambahDaftarBilangan= "+TambahDaftarAngka(2,3,4));

        int[] angkaArgumen = new int[10];
        for (int i = 0; i < args.length; i++) {
            String angkaStr= args[i];
            int angka = Integer.parseInt(angkaStr);
            angkaArgumen[i]=angka;
        }
        int hasilTambahArgumen = TambahDaftarAngka(angkaArgumen);
        System.out.println("Hasil penjumlahan argumen: "+hasilTambahArgumen);

        Gajah gajah1 = new Gajah("Bobby");
        gajah1.makan();
    }
    static int Tambah(int satu, int dua){
        int hasil;
        hasil = satu + dua;
        return hasil;
    }

    static boolean IsGanjil(int bilangan){
        if (bilangan %2==0){
            return false;
        }else{
            return true;
        }
    }

    static int TambahDaftarAngka(int ...daftarAngka){
        int hasil = 0;
        for (int i = 0; i < daftarAngka.length; i++) {
            hasil+=daftarAngka[i];
        }
        return hasil;
    }
}