package org.hillcrest.music;

/**
 * Creates a playlist that songs can be added to, removed from, and displayed like list
 */
public class Playlist {
    private Track[] tracks;
    private int currentSize;

    /***
     * Initializes the Playlist object
     */
    public Playlist() {
        tracks = new Track[10];
        currentSize = 0;
    }

    /***
     * adds a track to the playlist
     *
     * @param track takes a track object and adds it into the Playlist array
     */
    public String addTrack(Track track) {
        if (track.getDuration() < 0) {
            return "Invalid length. Track not added.";
        }
        if (currentSize == tracks.length) {
            growArray();
        }
        tracks[currentSize++] = track;
        return "Track added!";
    }

    /***
     * removes a track from the playlist
     *
     * @param title takes the title of the song and removes it from the Playlist array
     */
    public String removeTrack(String title) {
        int index = findTrackIndex(title);
        if (index == -1) {
            return "Track not found.";
        }
        for (int i = index; i < currentSize - 1; i++) {
            tracks[i] = tracks[i + 1];
        }
        tracks[--currentSize] = null;
        return "Track removed.";
    }

    /***
     * Displays the playlist
     *
     * @return the playlist string
     */
    public String display() {
        if (currentSize == 0) {
            return "No tracks in the playlist.";
        }
        String displayStr = "Your Playlist: \n";
        for (int i = 0; i < currentSize; i++) {
            displayStr = displayStr + tracks[i];
        }
        return displayStr;
    }

    /***
     * finds the index of a song in the playlist
     *
     * @param title LSets you decide which song to find the index of
     * @return the index
     */
    private int findTrackIndex(String title) {
        for (int i = 0; i < currentSize; i++) {
            if (tracks[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    /***
     * if the playlist needs more space, this will make it bigger
     */
    private void growArray() {
        tracks = new Track[tracks.length * 2];
    }

    /***
     * Gets the current size of the playlist
     *
     * @return the size
     */
    public int getCurrentSize() {
        return currentSize;
    }

    /***
     * gets the total capacity of the playlist
     *
     * @return the capacity
     */
    public int getCurrentCapacity() {
        return tracks.length;
    }
}