import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        // deklarasi variabel
        int tahun, bulan, tanggal, n, hari = 0, tanggalN, besok, tahunBaru, bulanN;
        String namaBulan = "";

        // membuat scanner input
        Scanner input = new Scanner(System.in);

        // input tahun dari User
        System.out.print("Tahun : ");
        tahun = input.nextInt();

        // input tahun dari User
        System.out.print("Bulan : ");
        bulan = input.nextInt();

        // input tahun dari User
        System.out.print("Tanggal : ");
        tanggal = input.nextInt();
    
        // input tahun dari User
        System.out.print("N hari kedepan : ");
        n = input.nextInt();

        // ###########################################################################
        // 
        // Percabangan
        // Bulan
        // 
        // ###########################################################################

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
        System.out.println(namaBulan + " memiliki hari sebanyak " + hari);
        System.out.println("Hari ini tanggal : " + tanggal + " " + namaBulan + " " + tahun);

        // ##########################################################################
        // 
        // Aritmatika Tanggal Besok
        // 
        // ###########################################################################

        if (bulan == 1) {
            hari = 31;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "Februari";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 2) {
            if (tahun % 4 == 0) {
                hari = 29;
                if (tanggal + 1 <= hari) {
                    besok = tanggal + 1;
                    System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
                } else {
                    besok = 1;
                    namaBulan = "Maret";
                    System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
                }
            } else {
                hari = 28;
                if (tanggal + 1 <= hari) {
                    besok = tanggal + 1;
                    System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
                } else {
                    besok = 1;
                    namaBulan = "Maret";
                    System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
                }
            }
        } else if (bulan == 3) {
            hari = 31;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "April";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 4) {
            hari = 30;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "Mei";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 5) {
            hari = 31;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "Juni";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 6) {
            hari = 30;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "Juli";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 7) {
            hari = 31;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "Agustus";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 8) {
            hari = 31;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "September";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 9) {
            hari = 30;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "Oktober";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 10) {
            hari = 31;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "November";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 11) {
            hari = 30;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "Desember";
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun);
            }
        } else if (bulan == 12) {
            hari = 31;
            if (tanggal + 1 <= hari) {
                besok = tanggal + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahun );
            } else {
                besok = 1;
                namaBulan = "Januari";
                tahunBaru = tahun + 1;
                System.out.println("Besok tanggal : " + besok + " " + namaBulan + " " + tahunBaru);
            }
        }

        // ###########################################################################
        // 
        // Aritmatika Tanggal ke N
        // 
        // ###########################################################################

        if (tanggal + n <= hari) {
            tanggalN = tanggal + n;
            System.out.println(n + " hari lagi tanggal : " + tanggalN + " " + namaBulan + " " + tahun );
        } else if (bulan == 12) {
            tanggalN = (tanggal + n) % hari;
            bulanN = bulan + (tanggal + n)/hari;
            tahunBaru = tahun + 1;
            namaBulan = "Januari";
            System.out.println(n + " hari lagi tanggal : " + tanggalN + " " + namaBulan + " " + tahunBaru );
        } else {
            tanggalN = (tanggal + n) % hari;
            bulanN = bulan + (tanggal + n)/hari;
            // percabangan
            // bulan
            if (bulanN == 1) {
                namaBulan = "Januari";
            } else if (bulanN == 2) {
                namaBulan = "Februari";
            } else if (bulanN == 3) {
                namaBulan = "Maret";
            } else if (bulanN == 4) {
                namaBulan = "April";
            } else if (bulanN == 5) {
                namaBulan = "Mei";
            } else if (bulanN == 6) {
                namaBulan = "Juni";
            } else if (bulanN == 7) {
                namaBulan = "Juli";
            } else if (bulanN == 8) {
                namaBulan = "Agustus";
            } else if (bulanN == 9) {
                namaBulan = "September";
            } else if (bulanN == 10) {
                namaBulan = "Oktober";
            } else if (bulanN == 11) {
                namaBulan = "November";
            } else if (bulanN == 12) {
                namaBulan = "Desember";
            }
            System.out.println(n + " hari lagi tanggal : " + tanggalN + " " + namaBulan + " " + tahun );
        }
    }
}
