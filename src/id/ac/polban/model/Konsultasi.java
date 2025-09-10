package id.ac.polban.model;


public class Konsultasi {
    private Pasien pasien;
    private Dokter dokter;

    public Konsultasi(Pasien pasien, Dokter dokter) {
        this.pasien = pasien;
        this.dokter = dokter;
    }

    public void tampilkanData() {
        System.out.println("Pasien: " + pasien.getNama() + " (ID: " + pasien.getId() + ")");
        System.out.println("Dokter: " + dokter.getNama() + " - Spesialis " + dokter.getSpesialis());
    }
}
