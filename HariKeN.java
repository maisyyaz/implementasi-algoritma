import java.util.Scanner;

public class HariKeN {
    public static void main(String[] args) {
        // deklarasi variabel
        int n, hariN, angka = 0;
        String hari, namaHari = "";
        Scanner input;

        // inputan dari user
        input = new Scanner(System.in);

        System.out.print("Masukan hari: ");
        hari = input.next();

        System.out.print("Masukan hari ke N: ");
        n = input.nextInt();

        // percabangan switch
        switch (hari) {
            case "Senin":
            case "senin":
                angka = 1;
                break;
            case "Selasa":
            case "selasa":
                angka = 2;
                break;
            case "Rabu":
            case "rabu":
                angka = 3;
                break;
            case "Kamis":
            case "kamis":
                angka = 4;
                break;
            case "Jumat":
            case "jumat":
                angka = 5;
                break;
            case "Sabtu":
            case "sabtu":
                angka = 6;
                break;
            case "Minggu":
            case "minggu":
                angka = 7;
                break;
            default:
                System.out.println("hari tidak ada");
                break;
        }

        // rumus hari ke n
        hariN = (angka + n) % 7;

        switch (hariN) {
            case 0:
                namaHari = "Minggu";
                break;
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
        }

        System.out.println(n + " hari lagi hari " + namaHari);
    }
}