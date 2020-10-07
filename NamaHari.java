import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        // deklarasi variabel
        int angka;
        String hari = "";
        Scanner input = new Scanner(System.in);

        // inputan dari user
        System.out.print("input: ");
        angka = input.nextInt();

        // percabangan switch
        switch (angka) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = "Inputan salah";
                break;
        }
        System.out.println(hari);
    }
}
