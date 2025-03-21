package org.hillcrest.music;

public class Track {
    private String title;
    private String artist;
    private double duration;

    /***
     * Initializes a song
     *
     * @param title of the song
     * @param artist of the song
     * @param duration of the song
     */
    public Track(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    /***
     * gets the title of the song
     *
     * @return the title
     */
    public String getTitle(){
        return title;
    }

    /***
     * gets the artist of the song
     *
     * @return the artist
     */
    public String getArtist(){
        return artist;
    }

    /***
     * gets the duration of the song
     *
     * @return the duration
     */
    public double getDuration(){
        return duration;
    }

    /***
     * sets the title of song
     *
     * @param title This way you can pick what you want to name the song
     */
    public void setTitle(String title){
        this.title = title;
    }

    /***
     * sets the artist of song
     *
     * @param artist This way you can pick who made the song
     */
    public void setArtist(String artist){
        this.artist = artist;
    }

    /***
     * sets the length of the song
     *
     * @param duration This way you can specify how long the song is
     */
    public void setDuration(double duration){
        this.duration = duration;
    }

    /***
     * gives a full overview of the track, with title, artist, and duration
     *
     * @return title, artist, and duration
     */
    @Override
    public String toString() {
        return "Title: " + title +
                " | Artist: " + artist +
                " | Duration: " + duration + "\n";
    }
}
