package project_akhir;
import java.util.Scanner;

public class Mesin_ATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu1 = 0;
        String[][] data = {{"Username"}, {"PIN"}, {"Bank"}, {"No. Rekening"}, {"Saldo"}};
        String[][] user1 = {{"Okza", "123456", "ABC", "00000000", "500.000"}};
        String[][] user2 = {{"Farhan", "234567", "ABC", "00000001", "2.000.000"}};
        String[][] user3 = {{"Syarief", "345678", "Diriman", "11111110", "1.500.000"}};
        String[][] user4 = {{"Titus", "456789", "IBN", "22222202", "700.000"}};
        String[][] user5 = {{"Darell", "567890", "IRB", "33333033", "100.000.000"}};
        String user,pass;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t Bank IBN");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Silahkan Pilih Layanan Kami");
        System.out.println("1. Daftar Rekening");
        System.out.println("2. Masuk");
//        System.out.println("Untuk Membatalkan Silahkan Pilih 0");
        System.out.print("Pilihan Anda :");
        menu1 = input.nextInt();
        if (menu1 == 1) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tDaftar Rekening");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 1; j++) {
                    if (i != 1 && i != 4) {
                        System.out.printf("%-12s", data[i][j]);
                    }
                }
            }
            System.out.println("");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j != 1 && j != 4) {
                        System.out.printf("%-12s", user1[i][j]);
                    }
                }
            }
            System.out.println("");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j != 1 && j != 4) {
                        System.out.printf("%-12s", user2[i][j]);
                    }
                }
            }
            System.out.println("");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j != 1 && j != 4) {
                        System.out.printf("%-12s", user3[i][j]);
                    }
                }
            }
            System.out.println("");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j != 1 && j != 4) {
                        System.out.printf("%-12s", user4[i][j]);
                    }
                }
            }
            System.out.println("");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j != 1 && j != 4) {
                        System.out.printf("%-12s", user5[i][j]);
                    }
                }
            }
            System.out.println("");
        }
        if (menu1 == 2) {
            System.out.print("Masukkan Username :");
            user = input.next();
            System.out.print("Masukkan Pin      :");
            pass = input.next();
            
            if ((user.equals(user1[0][0]) && pass.equals(user1[0][1]))
                    || (user.equals(user2[0][0]) && pass.equals(user2[0][1]))
                    || (user.equals(user3[0][0]) && pass.equals(user3[0][1]))
                    || (user.equals(user4[0][0]) && pass.equals(user3[0][1]))
                    || (user.equals(user5[0][0]) && pass.equals(user5[0][1]))) {
                System.out.println("1. Informasi Saldo");
                System.out.println("2. Penarikan Tunai");
                System.out.println("3. Transfer");
                System.out.println("4. Ganti Pin");
                System.out.println("5. Keluar");
                int menu2 = input.nextInt();
                switch (menu2) {
                    case 1 :
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 5; j++) {
//                                System.out.printf("%-1s",user[i][j]);
                            }
                        }
                }
            }
        }
    }
}
