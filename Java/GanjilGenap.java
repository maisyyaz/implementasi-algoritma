import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        // deklarasi variabel
        int angka;

        // membuat scanner input
        Scanner input = new Scanner(System.in);

        // input dari User
        System.out.print("Input : ");
        angka = input.nextInt();

        // percabangan
        System.out.print("Output : ");
        if (angka % 2 == 0) {
            System.out.println("Genap");
        } 
        if (angka % 2 == 1) {
            System.out.println("Ganjil");
        }
    }
}