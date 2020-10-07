import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        // deklarasi variabel
        int angka1, angka2, hasil;
        char operator;
        Scanner input;

        // inputan user
        input = new Scanner(System.in);

        // angka 1
        angka1 = input.nextInt();

        // operasi
        operator = input.next().charAt(0);

        // angka 2
        angka2 = input.nextInt();

        // percabangan switch
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(hasil);
                break;
            default:
                System.out.println("operator tidak ditemukan");
                break;
        }
    }
}
