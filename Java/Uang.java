import java.util.Scanner;

public class Uang {
    public static void main (String[] args) {
        // deklarasi variabel
        int nilai, _100rb, _50rb, _20rb, _10rb, _5rb, _2rb, _1rb, _500, _200, _100, _50, _1, sisa;

        // membuat scanner input
        Scanner input = new Scanner(System.in);

        // input dari User
        System.out.print("Nilai : ");
        nilai = input.nextInt();

        // perhitungan aritmatika
        // seratus ribu ribu
        _100rb = nilai/100000;
        sisa = nilai - (_100rb * 100000);
        // lima puluh ribu
        _50rb = sisa/50000;
        sisa = sisa - (_50rb * 50000);
        // dua puluh ribu
        _20rb = sisa/20000;
        sisa = sisa - (_20rb * 20000);
        // sepuluh ribu
        _10rb = sisa/10000;
        sisa = sisa - (_10rb * 10000);
        // lima ribu
        _5rb = sisa/5000;
        sisa = sisa - (_5rb * 5000);
        // dua ribu
        _2rb = sisa/2000;
        sisa = sisa - (_2rb * 2000);
        // seribu
        _1rb = sisa/1000;
        sisa = sisa - (_1rb * 1000);
        // lima ratus
        _500 = sisa/500;
        sisa = sisa - (_500 * 500);
        // dua ratus
        _200 = sisa/200;
        sisa = sisa - (_200 * 200);
        // seratus
        _100 = sisa/100;
        sisa = sisa - (_100 * 100);
        // lima puluh
        _50 = sisa/50;
        sisa = sisa - (_50 * 50);
        // satu
        _1 = sisa/1;
        sisa = sisa - (_1 * 1);

        // cetak
        System.out.println(_100rb +" lembar pecahan Rp100.000,-");
        System.out.println(_50rb + " lembar pecahan Rp50.000,-");
        System.out.println(_20rb + " lembar pecahan Rp20.000,-");
        System.out.println(_10rb + " lembar pecahan Rp10.000,-");
        System.out.println(_5rb + " lembar pecahan Rp5.000,-");
        System.out.println(_2rb + " lembar pecahan Rp2.000,-");
        System.out.println(_1rb + " lembar pecahan Rp1.000,-");
        System.out.println(_500 + " keping pecahan Rp500,-");
        System.out.println(_200 + " keping pecahan Rp200,-");
        System.out.println(_100 + " keping pecahan Rp100,-");
        System.out.println(_50 + " keping pecahan Rp50,-");
        System.out.println(_1 + " keping pecahan Rp1,-");
    }
}
