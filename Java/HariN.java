import java.util.Scanner;

public class HariN {
    public static void main(String[] args) {
        // deklarasi variabel
        int hari, n, besok, hariN;
        String namaHari = "";
        Scanner input;

        // buat inputan pake scanner
        input = new Scanner(System.in);

        // input hari dari user
        System.out.print("Sekarang hari : ");
        hari = input.nextInt();

        // input hari ke N dari user
        System.out.print("N hari kedepan : ");
        n = input.nextInt();

        // percabangan nama hari
        if (hari == 1) {
            namaHari = "Senin";
        } else if (hari == 2) {
            namaHari = "Selasa";
        } else if (hari == 3) {
            namaHari = "Rabu";
        } else if (hari == 4) {
            namaHari = "Kamis";
        } else if (hari == 5) {
            namaHari = "Jumat";
        } else if (hari == 6) {
            namaHari = "Sabtu";
        } else if (hari == 0) {
            namaHari = "Minggu";
        }

        // cetak hari sekarang
        System.out.println("Sekarang hari " + namaHari);

        // aritmatka hari besok
        if (hari + 1 <= 7) {
            besok = hari + 1;
            // percabangan nama hari
            if (besok == 1) {
                namaHari = "Senin";
            } else if (besok == 2) {
                namaHari = "Selasa";
            } else if (besok == 3) {
                namaHari = "Rabu";
            } else if (besok == 4) {
                namaHari = "Kamis";
            } else if (besok == 5) {
                namaHari = "Jumat";
            } else if (besok == 6) {
                namaHari = "Sabtu";
            } else if (besok == 7) {
                namaHari = "Minggu";
            }
            // cetak
            System.out.println("Besok adalah hari " + namaHari);
        } else if (hari + 1 > 7) {
            namaHari = "Senin";
            // cetak
            System.out.println("Besok adalah hari " + namaHari);          
        }

        // aritmatika hari ke N
        if (hari % 7 == 0) {
            hariN = hari;
            //  percabangan nama hari
            if (hariN == 1) {
                namaHari = "Senin";
            } else if (hariN == 2) {
                namaHari = "Selasa";
            } else if (hariN == 3) {
                namaHari = "Rabu";
            } else if (hariN == 4) {
                namaHari = "Kamis";
            } else if (hariN == 5) {
                namaHari = "Jumat";
            } else if (hariN == 6) {
                namaHari = "Sabtu";
            } else if (hariN == 7) {
                namaHari = "Minggu";
            }
            // cetak
            System.out.println(n + " hari kedepan adalah hari " + namaHari);
        }else{
            if (hari + n <= 7) {
            hariN = hari + n;
            //  percabangan nama hari
            if (hariN == 1) {
                namaHari = "Senin";
            } else if (hariN == 2) {
                namaHari = "Selasa";
            } else if (hariN == 3) {
                namaHari = "Rabu";
            } else if (hariN == 4) {
                namaHari = "Kamis";
            } else if (hariN == 5) {
                namaHari = "Jumat";
            } else if (hariN == 6) {
                namaHari = "Sabtu";
            } else if (hariN == 7) {
                namaHari = "Minggu";
            }
            // cetak
            System.out.println(n + " hari kedepan adalah hari " + namaHari);
            } else if (hari + n > 7) {
                hariN = (hari + n) % 7;
                // percabangan nama hari
                if (hariN == 1) {
                    namaHari = "Senin";
                } else if (hariN == 2) {
                    namaHari = "Selasa";
                } else if (hariN == 3) {
                    namaHari = "Rabu";
                } else if (hariN == 4) {
                    namaHari = "Kamis";
                } else if (hariN == 5) {
                    namaHari = "Jumat";
                } else if (hariN == 6) {
                    namaHari = "Sabtu";
                } else if (hariN == 7) {
                    namaHari = "Minggu";
                }
                // cetak
                System.out.println(n + " hari kedepan adalah hari " + namaHari);
            }
        }
    }
}
