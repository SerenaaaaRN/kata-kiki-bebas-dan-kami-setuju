package model;

public class Movie {
    private int id;
    private String namaFilm;
    private int durasi;
    private String genre;

    public Movie(int id, String namaFilm, int durasi, String genre) {
        this.id = id;
        this.namaFilm = namaFilm;
        this.durasi = durasi;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
