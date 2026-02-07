package model;

public class Studio {
    private int studioId;
    private String namaStudio;
    private int kapasitas;
    private String tipeStudio;

    // Konstruktor
    public Studio(int studioId, String namaStudio, int kapasitas, String tipeStudio) {
        this.studioId = studioId;
        this.namaStudio = namaStudio;
        this.kapasitas = kapasitas;
        this.tipeStudio = tipeStudio;
    }

    // Getter Setter
    public String getNamaStudio() {
        return namaStudio;
    }

    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getTipeStudio() {
        return tipeStudio;
    }

    public void setTipeStudio(String tipeStudio) {
        this.tipeStudio = tipeStudio;
    }

    public int getStudioId() {
        return studioId;
    }

    public void setStudioId(int studioId) {
        this.studioId = studioId;
    }

}
