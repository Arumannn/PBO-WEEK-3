package id.ac.polban.service;

import java.util.Scanner;
import id.ac.polban.model.Pasien;
import id.ac.polban.model.Dokter;
import id.ac.polban.model.Konsultasi;

public class RumahSakitApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pasien[] daftarPasien = new Pasien[100];
        Dokter[] daftarDokter = new Dokter[50];
        Konsultasi[] daftarKonsultasi = new Konsultasi[100];
        
        int jumlahPasien = 0;
        int jumlahDokter = 0;
        int jumlahKonsultasi = 0;
        
        int pilihan;

        do {
            System.out.println("\n=== SISTEM RUMAH SAKIT ===");
            System.out.println("1. Registrasi Pasien");
            System.out.println("2. Registrasi Dokter");
            System.out.println("3. Lihat Daftar Pasien");
            System.out.println("4. Lihat Daftar Dokter");
            System.out.println("5. Daftar Konsultasi");
            System.out.println("6. Lihat Daftar Konsultasi");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (jumlahPasien >= 100) {
                        System.out.println(" Kapasitas pasien sudah penuh!");
                        break;
                    }
                    
                    System.out.print("Masukkan NIK Pasien: ");
                    String idPasien = sc.nextLine();
                    System.out.print("Masukkan Nama Pasien: ");
                    String namaPasien = sc.nextLine();
                    System.out.print("Masukkan Umur Pasien: ");
                    int umur = sc.nextInt();
                    sc.nextLine();

                    daftarPasien[jumlahPasien] = new Pasien(idPasien, namaPasien, umur);
                    jumlahPasien++;
                    System.out.println(" Pasien berhasil diregistrasi!");
                    break;

                case 2:
                    if (jumlahDokter >= 100) {
                        System.out.println(" Kapasitas dokter sudah penuh!");
                        break;
                    }
                    
                    System.out.print("Masukkan ID Dokter: ");
                    String idDokter = sc.nextLine();
                    System.out.print("Masukkan Nama Dokter: ");
                    String namaDokter = sc.nextLine();
                    System.out.print("Masukkan Spesialisasi: ");
                    String spesialis = sc.nextLine();

                    daftarDokter[jumlahDokter] = new Dokter(idDokter, namaDokter, spesialis);
                    jumlahDokter++;
                    System.out.println(" Dokter berhasil diregistrasi!");
                    break;

                case 3:
                    if (jumlahPasien == 0) {
                        System.out.println("Belum ada pasien.");
                    } else {
                        System.out.println("\n=== Daftar Pasien ===");
                        for (int i = 0; i < jumlahPasien; i++) {
                            daftarPasien[i].tampilkanData();
                            System.out.println("------------------");
                        }
                    }
                    break;

                case 4:
                    if (jumlahDokter == 0) {
                        System.out.println("Belum ada dokter.");
                    } else {
                        System.out.println("\n=== Daftar Dokter ===");
                        for (int i = 0; i < jumlahDokter; i++) {
                            daftarDokter[i].tampilkanData();
                            System.out.println("------------------");
                        }
                    }
                    break;

                case 5:
                    if (jumlahKonsultasi >= 100) {
                        System.out.println(" Kapasitas konsultasi sudah penuh!");
                        break;
                    }
                    
                    System.out.print("Masukkan NIK Pasien: ");
                    String pid = sc.nextLine();
                    System.out.print("Masukkan NIK Dokter: ");
                    String did = sc.nextLine();

                    Pasien pasien = null;
                    Dokter dokter = null;

                    for (int i = 0; i < jumlahPasien; i++) {
                        if (daftarPasien[i].getId().equals(pid)) {
                            pasien = daftarPasien[i];
                            break;
                        }
                    }
                    
                    for (int i = 0; i < jumlahDokter; i++) {
                        if (daftarDokter[i].getId().equals(did)) {
                            dokter = daftarDokter[i];
                            break;
                        }
                    }

                    if (pasien != null && dokter != null) {
                        daftarKonsultasi[jumlahKonsultasi] = new Konsultasi(pasien, dokter);
                        jumlahKonsultasi++;
                        System.out.println(" Konsultasi berhasil dibuat!");
                    } else {
                        System.out.println(" NIK Pasien atau Dokter tidak ditemukan.");
                    }
                    break;

                case 6:
                    if (jumlahKonsultasi == 0) {
                        System.out.println("Belum ada konsultasi.");
                    } else {
                        System.out.println("\n=== Daftar Konsultasi ===");
                        for (int i = 0; i < jumlahKonsultasi; i++) {
                            daftarKonsultasi[i].tampilkanData();
                            System.out.println("------------------");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Keluar dari sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 7);

    }
}
    


