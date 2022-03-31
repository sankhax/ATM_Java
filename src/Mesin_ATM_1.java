
import java.util.Scanner;

public class Mesin_ATM_1 {

    static String[][] akun = {
        {"Username", "PIN", "Bank", "No.Rekening", "Saldo"},
        {"Okza", "123456", "ABC", "00000000", "500000"},
        {"Farhan", "234567", "ABC", "00000001", "2000000"},
        {"Syarief", "345678", "Diriman", "11111110", "1500000"},
        {"Titus", "456789", "IBN", "22222202", "700000"},
        {"Darell", "567890", "IRB", "33333033", "100000000"}
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("\tSelamat Datang di Mesin ATM CPPA");
        System.out.println("=============================================");
        int pilihan;
        do {
            System.out.println("\t    > Pilih Transaksi <");
            System.out.println("1. Daftar Rekening");
            System.out.println("2. Masuk");
            System.out.println("3. Batal");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println("=============================================");
            switch (pilihan) {
                case 1:
                    daftar_rekening();//static daftar_rekening
                    break;
                case 2:
                    masuk();//static masuk
                    break;
                case 3:
                    System.exit(0);//keluar dari program
                    break;
                default:
                    System.out.println("Masukkan Pilihan Dengan Benar");
            }
        } while (pilihan != 3);
        {
            System.out.println("Terima Kasih");
        }
    }

    static void daftar_rekening() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                {
                    System.out.printf("%-13s", akun[i][j]);//mencetak akun[i][j] dengan 13 spasi dari kiri 
                }
            }
            System.out.println("");
        }
        System.out.println("=============================================");
    }

    static void masuk() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan username : ");
        String uname = input.nextLine();
        System.out.println("Masukkan Password : ");
        String passw = input.nextLine();
        System.out.println("=============================================");
        System.out.println();
        int pilihan;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (uname.equals(akun[i][j]) && passw.equals(akun[i][1])) {//jika username dan password benar maka berhasil masuk
                    System.out.println("\t     Anda Berhasil Masuk");

                    do {
                        System.out.println("=============================================");
                        System.out.println("\t    - Pilih Transaksi -");
                        System.out.println("Menu : ");
                        System.out.println("1. Informasi Saldo");
                        System.out.println("2. Penarikan Tunai");
                        System.out.println("3. Transfer");
                        System.out.println("4. Ganti PIN");
                        System.out.println("5. Keluar");
                        System.out.print("Masukkan Pilihan : ");
                        pilihan = input.nextInt();
                        System.out.println("=============================================");
                        switch (pilihan) {
                            case 1://Informasi Saldo
                                System.out.println("Sisa Saldo anda :Rp. " + akun[i][4]);//mencetak sisa saldo dengan akun[i][4]
                                break;
                            case 2://Penarikan tunai
                                int tarik;
                                System.out.println("Tabungan Anda : Rp. " + akun[i][4]);//mencetak tabungan anda dengan akun[i][4]
                                System.out.print("Berapa Banyak Yang Anda ingin tarik : Rp. ");
                                tarik = input.nextInt();
                                int saldomin = Integer.parseInt(akun[i][4]) - tarik;//mengubah sintaks dari String ke Integer 
                                if (saldomin >= 50000) {
                                    System.out.println("Transaksi Berhasil");
                                    String sisa = Integer.toString(saldomin);//mengubah sintaks dari Integer ke String
                                    System.out.println("Sisa Saldo Anda :Rp. " + sisa);
                                    akun[i][4] = sisa;
                                } else {
                                    System.out.println("Maaf Transaksi Anda Gagal,Saldo Minimal Anda Kurang");
                                }
                                System.out.println();
                                break;
                            case 3://Transfer
                                Sisa = Integer.parseInt(akun[i][4]);
                                transfer();
                                int saldoawal = Integer.parseInt(akun[i][4]);
                                int saldoakhir = saldoawal - jumlahtf;
                                if (saldoakhir >= 50000) {
                                    String sisasaldo = Integer.toString(saldoakhir);
                                    akun[i][4] = sisasaldo;
                                    System.out.println("Transaksi Berhasil");
                                    System.out.println("Sisa Saldo Anda : " + saldoakhir);
                                } else {
                                    System.out.println("Maaf, Transaksi Gagal Saldo Minimal Anda Kurang");
                                }

                                break;
                            case 4://Ganti PIN
                                System.out.print("Masukkan PIN Lama Anda : ");
                                String pin = input.next();
                                if (pin.equals(akun[i][1])) {
                                    System.out.print("Masukkan PIN Baru Anda : ");
                                    String pinbaru = input.next();
                                    System.out.print("Konfirmasi PIN Baru Anda : ");
                                    String pinbaru2 = input.next();
                                    if (pinbaru.equals(pinbaru2)) {
                                        System.out.println("PIN Berhasil Diganti");
                                        akun[i][1] = pinbaru;
                                    } else {
                                        System.out.println("Maaf, PIN yang anda masukkan tidak sesuai");

                                    }
                                } else {
                                    System.out.println("PIN YANG ANDA MASUKKAN SALAH");
                                }
                                break;
                            case 5://Keluar
//                                keluar();
                                int pilihan3;
                                System.out.println("-------------------------------------------------");
                                System.out.println("Apakah anda ingin kembali ke menu? 1.ya .2.tidak ");
                                System.out.println("-------------------------------------------------");
                                pilihan3 = input.nextInt();
                                switch (pilihan3) {
                                    case 1:
                                        masuk();
                                        break;
                                    case 2:
                                        System.out.println("Terima Kasih Telah Menggunakan Bank CPPA");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Masukkan pilihan dengan benar");
                                }
                                break;
                            default:
                                System.out.println("Maaf Inputan Yang Anda Masukkan Salah");
                        }
                    } while (pilihan != 5);
                }

            }
        }
    }
    private static int Sisa;
    private static int jumlahtf;
    private static String saldopnrm;
    private static String saldopnrma;

    static void transfer() {
        Scanner input = new Scanner(System.in);
        int pilihan, saldopenerima;
        String norek, norek2;
        System.out.println("1. Sesama Bank IBN");
        System.out.println("2. Selain Bank IBN");
        System.out.println("3. Kembali");
        System.out.println("Masukkan pilihan anda : ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukkan No.Rekening : ");
                norek = input.next();
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (norek.equals(akun[4][3])) {
                            System.out.println("Nama : " + akun[4][0]);
                            System.out.println("Bank : " + akun[4][2]);
                            System.out.println("Jumlah yang di transfer : ");
                            jumlahtf = input.nextInt();
                            System.out.println("Apakah Anda Ingin Melakukan Transaksi Ini? 1. ya 2. tidak");
                            pilihan = input.nextInt();
                            if (pilihan == 1) {
                                int sldo = Sisa - jumlahtf;
                                if (sldo >= 50000) {
                                    saldopenerima = Integer.parseInt(akun[4][4]) + jumlahtf;
                                    String saldopnrma1 = Integer.toString(saldopenerima);
                                    akun [4][4] = saldopnrma1;
                                }

                            }

                        }
                        break;
                    }
                    break;
                }

                break;
            case 2:
                int beban = 6500;
                System.out.println("Masukkan No.Rekening : ");
                norek2 = input.next();
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (norek2.equals(akun[i][3])) {
                            System.out.println("Nama : " + akun[i][0]);
                            System.out.println("Bank : " + akun[i][2]);
                            System.out.println("Jumlah yang di transfer : ");
                            int jumlahtf2 = input.nextInt();
                            System.out.println("Apakah Anda Ingin Melakukan Transaksi Ini? 1.ya 2. tidak");
                            System.out.println("Biaya beban 6500");
                            pilihan = input.nextInt();
                            int totaltf = jumlahtf2 + beban;
                            if (pilihan == 1) {
                                saldopenerima = Integer.parseInt(akun[i][4]) + jumlahtf2;
                                jumlahtf = totaltf;
                                String saldopnrma = Integer.toString(saldopenerima);
                                akun[i][4] = saldopnrma;
                            }
                        }
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("");
                break;

        }
//        }while(pilihan!=3);

    }

    public int getjumlahtf() {
        return Mesin_ATM_1.jumlahtf;
    }

}
