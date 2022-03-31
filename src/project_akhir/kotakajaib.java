package project_akhir;

import java.util.Scanner;

public class kotakajaib {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t GAME KOTAK AJAIB");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Menu :");
            System.out.println("1. Cara Bermain \n2. Nama Kelompok \n3. Skor Terbaik "
                    + "\n4. Mulai Permainan \n5. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    carabermain();
                    break;
                case 2:
                    kelompok();
                    break;
                case 3:
                    skorterbaik();
                    break;
                case 4:
                    main();
                    break;
                case 5:
                    System.out.println("Terima Kasih...");
                    break;
                default:
                    System.out.println("Input yang Anda Masukkan Salah!");
            }
        } while (menu != 5);
    }

    static void carabermain() {
        System.out.println("1. Masukkan baris dan kolom ke berapa yang ingin diisi oleh angka 0-9");
        System.out.println("2. Ulangi langkah pertama sehingga semua kotak terisi");
        System.out.println("3. Total angka vertikal,horizontal dan diagonal harus berjumlah 15");
    }

    static void kelompok() {
        System.out.println("Nama Kelompok :");
        System.out.println("1. Ikhsan Khaliq / 185150707111016");
        System.out.println("2. Muhammad Nalarizqy Haz Afhami / 185150707111015");
    }

    static int[] skor = new int[6];
    static String[] namaa = new String[6];
    private static int tap1;
    private static int main;
    private static String nama;

    static void skorterbaik() {
        System.out.println("Skor Terbaik :");
        for (int i = 0; i < skor.length - 1; i++) {
            for (int j = 0; j < skor[i + 1]; j++) {
                if (skor[i] < skor[i + 1]) {
                    int h = skor[j];
                    skor[j] = skor[i + 1];
                    skor[i + 1] = h;
                    String k = namaa[j];
                    namaa[j] = namaa[i + 1];
                    namaa[i + 1] = k;
                } 
            }
        }
        for (int i = 0; i < 5; i++) {
            if (namaa[i] == null) {
                System.out.println(i + 1+".");
            } else {
                System.out.println((i + 1) + (".") + namaa[i] + (" : ") + skor[i]);
            }
        }
    }

    static void main() {
        int tap = 1;
        int nilaia = 0, nilaib = 0, nilaic = 0, nilaid = 0, nilaie = 0, nilaif = 0, nilaig = 0, nilaih = 0, nilaii = 0;
        Scanner in = new Scanner(System.in);
        int cek1, cek2, cek3, cek4, cek5, cek6, cek7, cek8;
        do {
            for (int i = 0; i < 13; i++) {
                int a, b, c, d, e, f, g, h, z;

                if (i == 0 || i == 4 || i == 8 || i == 12) {
                    System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||");
                } else if (i == 2) {
                    for (int j = 0; j < 8; j++) {
                        if (j == 0) {
                            System.out.print("/");
                            System.out.print("\t");
                        } else if (j == 1) {
                            System.out.print(nilaia);
                            System.out.print("\t/\t");
                        } else if (j == 4) {
                            System.out.print(nilaib);
                            System.out.print("\t/\t");
                        } else if (j == 6) {
                            System.out.print(nilaic);
                            System.out.print("\t/\t");
                        }
                    }
                } else if (i == 6) {
                    for (int j = 0; j < 8; j++) {
                        if (j == 0) {
                            System.out.print("/");
                            System.out.print("\t");
                        } else if (j == 1) {
                            System.out.print(nilaid);
                            System.out.print("\t/\t");
                        } else if (j == 4) {
                            System.out.print(nilaie);
                            System.out.print("\t/\t");
                        } else if (j == 6) {
                            System.out.print(nilaif);
                            System.out.print("\t/");
                        }
                    }
                } else if (i == 10) {
                    for (int j = 0; j < 8; j++) {
                        if (j == 0) {
                            System.out.print("/");
                            System.out.print("\t");
                        } else if (j == 1) {
                            System.out.print(nilaig);
                            System.out.print("\t/\t");
                        } else if (j == 4) {
                            System.out.print(nilaih);
                            System.out.print("\t/\t");
                        } else if (j == 6) {
                            System.out.print(nilaii);
                            System.out.print("\t/");
                        }
                    }
                } else {
                    for (int j = 0; j < 4; j++) {
                        System.out.print("/");
                        System.out.print("\t\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("Masukkan Baris dan Kolom");
            System.out.print("Masukkan Baris : ");
            int baris = in.nextInt();
            System.out.print("Masukkan Kolom : ");
            int kolom = in.nextInt();
            System.out.print("Masukkan Nilai : ");
            int nilai = in.nextInt();
            if (baris == 1 && kolom == 1) {
                nilaia = nilai;
                tap++;
            }
            if (baris == 1 && kolom == 2) {
                nilaib = nilai;
                tap++;
            }
            if (baris == 1 && kolom == 3) {
                nilaic = nilai;
                tap++;
            }
            if (baris == 2 && kolom == 1) {
                nilaid = nilai;
                tap++;
            }
            if (baris == 2 && kolom == 2) {
                nilaie = nilai;
                tap++;
            }
            if (baris == 2 && kolom == 3) {
                nilaif = nilai;
                tap++;
            }
            if (baris == 3 && kolom == 1) {
                nilaig = nilai;
                tap++;
            }
            if (baris == 3 && kolom == 2) {
                nilaih = nilai;
                tap++;
            }
            if (baris == 3 && kolom == 3) {
                nilaii = nilai;
                tap++;
            }
            cek1 = nilaia + nilaib + nilaic;
            cek2 = nilaid + nilaie + nilaif;
            cek3 = nilaig + nilaih + nilaii;
            cek4 = nilaia + nilaid + nilaig;
            cek5 = nilaib + nilaie + nilaih;
            cek6 = nilaic + nilaif + nilaii;
            cek7 = nilaia + nilaie + nilaii;
            cek8 = nilaic + nilaie + nilaig;
        } while (cek1 != 15 || cek2 != 15 || cek3 != 15 || cek4 != 15
                || cek5 != 15 || cek6 != 15 || cek8 != 15);
        {
            System.out.print("Masukkan Nama Anda : ");
            nama = in.next();
            System.out.println("Permainan Selesai...");
            tap1 = 1000 / tap;
            System.out.println("Skor anda : " + tap1);
            main++;
        }
        for (int j = 1; j < skor.length; j++) {
            skor[main] = tap1;
            namaa[main] = nama;
        }
    }
}
