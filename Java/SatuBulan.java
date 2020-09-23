import java.util.Scanner;

public class SatuBulan {
    public static void main(String[] args) {
        // deklarasi variabel
        int bulan, tahun, hari = 0;
        String namaBulan = "";

        // buat input pakai Scanner
        Scanner input = new Scanner(System.in);

        // input  bulan dari user
        System.out.print("Bulan : ");
        bulan = input.nextInt();

        // input tahun dari user
        System.out.print("Tahun : ");
        tahun = input.nextInt();

        // percabangan
        // bulan
        if (bulan == 1) {
            namaBulan = "Januari";
        } else if (bulan == 2) {
            namaBulan = "Februari";
        } else if (bulan == 3) {
            namaBulan = "Maret";
        } else if (bulan == 4) {
            namaBulan = "April";
        } else if (bulan == 5) {
            namaBulan = "Mei";
        } else if (bulan == 6) {
            namaBulan = "Juni";
        } else if (bulan == 7) {
            namaBulan = "Juli";
        } else if (bulan == 8) {
            namaBulan = "Agustus";
        } else if (bulan == 9) {
            namaBulan = "September";
        } else if (bulan == 10) {
            namaBulan = "Oktober";
        } else if (bulan == 11) {
            namaBulan = "November";
        } else if (bulan == 12) {
            namaBulan = "Desember";
        }

        // bulan 31,30,29 dan 28 hari
        if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12) {
            hari = 31;
        } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            hari = 30;
        } else if (bulan == 2) {
            if (tahun % 4 == 0) {
                hari = 29;
            } else {
                hari = 28;
            }
        }
        // output
        System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
    }
}
