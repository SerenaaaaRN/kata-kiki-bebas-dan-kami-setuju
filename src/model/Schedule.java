package src.model;

public class Schedule {
    private int durasi;
    private String jamMulai;
    private String jamSelesai;
    private String tanggal;

    //Konstruktor
    public Schedule(int durasi, String jamMulai, String jamSelesai, String tanggal) {
        this.durasi = durasi;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.tanggal = tanggal;
    }

    //Getter dan setter

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(String jamMulai) {
        this.jamMulai = jamMulai;
    }

    public String getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(String jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    
}
