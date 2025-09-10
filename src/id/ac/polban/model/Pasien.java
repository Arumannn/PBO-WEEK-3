package id.ac.polban.model;


public class Pasien {
    private String id;
    private String nama;
    private int umur;

    public Pasien(String id, String nama, int umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public int getUmur() { return umur; }

    public void tampilkanData() {
        System.out.println("ID Pasien: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
