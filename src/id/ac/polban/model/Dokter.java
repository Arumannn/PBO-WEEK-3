package id.ac.polban.model;

public class Dokter {
    private String id;
    private String nama;
    private String spesialis;

    public Dokter(String id, String nama, String spesialis) {
        this.id = id;
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getSpesialis() { return spesialis; }

    public void tampilkanData() {
        System.out.println("ID Dokter: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Spesialisasi: " + spesialis);
    }
}
