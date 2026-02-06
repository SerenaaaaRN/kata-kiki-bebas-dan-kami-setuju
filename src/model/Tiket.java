package src.model;

public class Tiket {
    private int harga;
    private String judulFilm;
    private Schedule jadwalFilm;
    private Studio studio;
    private String seat;

    //Konstruktor
    public Tiket(int harga, String judulFilm, Schedule jadwalFilm, Studio studio, String seat) {
        this.harga = harga;
        this.judulFilm = judulFilm;
        this.jadwalFilm = jadwalFilm;
        this.studio = studio;
        this.seat = seat;
    }

    //Getter dan Setter
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public Schedule getJadwalFilm() {
        return jadwalFilm;
    }

    public void setJadwalFilm(Schedule jadwalFilm) {
        this.jadwalFilm = jadwalFilm;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }    
}
