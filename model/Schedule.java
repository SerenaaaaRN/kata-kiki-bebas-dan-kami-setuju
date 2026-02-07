package model;

public class Schedule {
    private int scheduleId;
    private Movie movie;
    private Studio studio;
    private String jamTayang;

    // Konstruktor
    public Schedule(int scheduleId, Movie movie, Studio studio, String jamTayang) {
        this.scheduleId = scheduleId;
        this.movie = movie;
        this.studio = studio;
        this.jamTayang = jamTayang;
    }

    // Getter dan setter
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public void setJamTayang(String jamTayang) {
        this.jamTayang = jamTayang;
    }

}
