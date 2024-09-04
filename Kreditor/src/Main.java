public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        double hutang=0;
        float bunga=0;
        int jumlahCicilan=0;

        for (int i = 0; i < args.length; i++) {
            String[] split = args[i].split("=");
            String param = split[0];
            String value = split[1];
            switch (param){
                case "-h":
                    hutang = hutang + Double.parseDouble(value);
                    break;
                case "-b":
                    bunga = bunga + Integer.parseInt(value);
                    break;
                case "-jc":
                    jumlahCicilan += Integer.parseInt(value);
                    break;
            }
        }

//        Membaca input baru
//        3 parameter: hutang, bunga, jumlah cicilan

//        hutang = Double.parseDouble(args[0]);
//        bunga = Float.parseFloat(args[1]);
//        jumlahCicilan = Integer.parseInt(args[2]);

        System.out.println("Hutang: "+hutang);
        System.out.println("Bunga: "+bunga);
        System.out.println("Jumlah Cicilan: "+jumlahCicilan);

//        hitung jumlah total hitung yang harus dibayar
        double totalBayarAwal = hutang +(hutang*bunga/100);
        double totalBayarAkhir = totalBayarAwal;
        System.out.println("------------------------");
        System.out.println(totalBayarAwal);
        System.out.println("---------------\n");

        double bayarPerAngsuran = totalBayarAwal/jumlahCicilan;
        System.out.println("bayar"+bayarPerAngsuran);

//        tabel
//        header
        System.out.println("+------------+------------+------------+");
        System.out.printf("| %-10s | %-10s | %-10s |\n", "Iterasi", "Angsuran", "Sisa");
        System.out.println("+------------+------------+------------+");

//        content
        for (int i = 0; i < jumlahCicilan; i++) {
//            totalBayarAkhir -= bayarPerAngsuran;
            System.out.printf("| %-10s | %-10s | %-10s |\n", (i+1), bayarPerAngsuran, totalBayarAkhir);
        }
        System.out.println("+------------+------------+------------+");


//        cara panjang
        String borderTop = "+------------+------------+------------+";
        System.out.println(borderTop);
        for (int i = 0; i < jumlahCicilan; i++) {
            short lebarKolom = 10;
            totalBayarAkhir -= bayarPerAngsuran;


            System.out.print("| ");
            System.out.print(i);
            for (int j = 0; j < (lebarKolom-Integer.toString(i).length()); j++) {
                System.out.print(" ");
            }

            System.out.print(" | ");
            System.out.print(bayarPerAngsuran);
            for (int j = 0; j < (lebarKolom-Double.toString(bayarPerAngsuran).length()); j++) {
                System.out.print(" ");
            }

            System.out.print(" | ");
            System.out.print(totalBayarAkhir);
            for (int j = 0; j < (lebarKolom-Double.toString(totalBayarAkhir).length()); j++) {
                System.out.print(" ");
            }
            System.out.print(" | \n");
        }
        System.out.println(borderTop);
    }
}