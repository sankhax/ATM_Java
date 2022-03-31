package project_akhir;

import java.util.Scanner;

public class baru {

    private static String login;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\tATM BANK IBN");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        do {
            System.out.println("Silahkan Pilih Layanan Kami");
            System.out.println("1. Daftar Rekening");
            System.out.println("2. Masuk");
            System.out.println("3. Batal");
            System.out.print("Silahkan Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (pilihan) {
                case 1:
                    daftar_rekening();
                    break;
                case 2:
                    masuk01();
                    if (login == null) {
                        System.out.println("Username/PIN anda Salah");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Inputan anda salah");
            }
        } while (pilihan != 3);
        {
            System.out.println("Terima Kasih telah menggunakan ATM kami");
        }

    }

    public static String[][] data = {{"Username", "PIN", "Bank", "No. Rekening", "Saldo"},
    {"Okza", "123456", "ABC", "00000000", "500000"},
    {"Farhan", "234567", "ABC", "00000001", "2000000"},
    {"Syarief", "345678", "Diriman", "11111110", "1500000"},
    {"Titus", "456789", "IBN", "22222202", "700000"},
    {"Darell", "567890", "IRB", "33333033", "100000000"}};

    static void daftar_rekening() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (j != 1 && j != 4) {
                    System.out.printf("%-14s", data[i][j]);
                }
            }
            System.out.println("");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    static void masuk01() {
        Scanner in = new Scanner(System.in);
        int pil, keluar = 0;
        System.out.print("Username : ");
        String uname = in.nextLine();
        System.out.print("PIN      : ");
        String upass = in.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (uname.equals(data[i][j]) && upass.equals(data[i][1])) {
                    login = data[i][j];
                    System.out.println("Anda Berhasil Masuk...");
                    do {
                        System.out.println("Menu :");
                        System.out.println("1. Informasi Saldo");
                        System.out.println("2. Tarik Tunai");
                        System.out.println("3. Transfer");
                        System.out.println("4. Ganti Pin");
                        System.out.println("5. Keluar");
                        System.out.print("Pilihan Anda : ");
                        pil = in.nextInt();
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        switch (pil) {
                            case 1:
                                System.out.println("Sisa Saldo Anda : " + data[i][4]);
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                break;
                            case 2:
                                int nml;
                                System.out.print("Masukkan Nominal : ");
                                nml = in.nextInt();
                                int saldo = Integer.parseInt(data[i][4]);
                                int ss = saldo - nml;
                                if (ss >= 50000) {
                                    System.out.println("Transaksi Berhasil");
                                    String sisa = Integer.toString(ss);
                                    System.out.println("Sisa Saldo Anda : " + sisa);
                                    data[i][4] = sisa;
                                } else {
                                    System.out.println("Maaf, Transaksi Gagal Saldo Minimal Anda Kurang");
                                }
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                break;
                            case 3:
                                Saldo = Integer.parseInt(data[i][4]);
                                transfer();
                                if (nama == null && bank == null) {
                                    System.out.println("Maaf, Rekening yang Anda Masukkan Salah");
                                } else {
                                    int saldoakhir = Saldo - transfer;
                                    String sisasaldo = Integer.toString(saldoakhir);
                                    if (saldoakhir >= 50000) {
                                        System.out.println("Transaksi Berhasil");
                                        data[i][4] = sisasaldo;
                                    } else {
                                        System.out.println("Maaf, Transaksi Gagal Saldo Minimal Anda Kurang");
                                    }
                                }
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                break;
                            case 4:
                                System.out.print("Silahkan Masukkan PIN lama anda : ");
                                String pin = in.next();
                                if (pin.equals(data[i][1])) {
                                    System.out.print("Silahkan Masukkan PIN baru anda : ");
                                    String pb = in.next();
                                    System.out.print("Masukkan Ulang PIN baru anda \t: ");
                                    String pb2 = in.next();
                                    if (pb.equals(pb2)) {
                                        System.out.println("PIN Berhasil Ganti");
                                        data[i][1] = pb;
                                    } else {
                                        System.out.println("Maaf, PIN baru yang anda masukkan tidak sesuai");
                                    }
                                } else {
                                    System.out.println("Maaf PIN yang anda Masukkan Salah");
                                }
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                break;
                            case 5:
                                System.out.println("Apakah Anda Ingin Keluar : \n 1.Ya \n 2. Tidak");
                                System.out.print("Pilihan anda : ");
                                keluar = in.nextInt();
                                if (keluar == 1) {
                                    keluar = 1;
                                }
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                break;
                            default:
                                System.out.println("Inputan yang Anda Masukkan Salah!");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        }
                    } while (keluar != 1);
                }
            }
        }
    }
    private static String nama;
    private static String bank;
    private static int transfer;
    private static int Saldo;

    static void transfer() {
        Scanner in = new Scanner(System.in);
        int adm = 6500;
        int penerima;
        String trx;
        System.out.println("1. Sesama Bank IBN");
        System.out.println("2. Selain Bank IBN");
        System.out.println("3. Kembali");
        System.out.print("Pilihan Anda : ");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("No. Rekening yang dituju \t: ");
                String rek = in.next();
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (rek.equals(data[4][3])) {
                            nama = data[4][0];
                            bank = data[4][2];
                            System.out.print("Masukkan Nominal Transfer \t: ");
                            int trf = in.nextInt();
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("Anda akan Melakukan Transaksi Kepada  : ");
                            System.out.println("Nama  : " + nama);
                            System.out.println("Anda akan Melakukan Transaksi Sebesar : " + trf);
                            System.out.println("Apakah anda ingin melakukan transaksi : \n 1. Ya \n 2. Tidak");
                            System.out.print("Pilihan Anda : ");
                            int pill = in.nextInt();
                            if (pill == 1) {
                                if (Saldo - trf >= 50000) {
                                    transfer = trf;
                                    penerima = Integer.parseInt(data[4][4]) + trf;
                                    trx = Integer.toString(penerima);
                                    data[4][4] = trx;
                                }
                            }
                        } break;         
                    }break;
                }
                break;
            case 2:
                System.out.print("No. Rekening yang dituju \t: ");
                rek = in.next();
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (rek.equals(data[i][3])) {
                            nama = data[i][0];
                            bank = data[i][2];
                            System.out.print("Masukkan Nominal Transfer \t: ");
                            int trf = in.nextInt();
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            int total = trf + adm;
                            System.out.println("Anda akan Melakukan Transaksi Kepada  : ");
                            System.out.println("Nama  : " + nama);
                            System.out.println("Bank  : " + bank);
                            System.out.println("Anda akan Melakukan Transaksi Sebesar :" + trf);
                            System.out.println("dengan Biaya ADM Sebesar              :" + adm);
                            System.out.println("Total                                 :" + total);
                            System.out.println("Apakah anda ingin melakukan transaksi ?\n1. Ya \n2. Tidak");
                            System.out.print("Pilihan Anda  :");
                            int pill = in.nextInt();
                            if (pill == 1) {
                                if (Saldo - total >= 50000) {
                                    transfer = total;
                                    penerima = Integer.parseInt(data[i][4]) + trf;
                                    trx = Integer.toString(penerima);
                                    data[i][4] = trx;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Inputan yang anda masukkan salah!");
        }

    }

}
