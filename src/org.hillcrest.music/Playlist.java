package org.hillcrest.music;

public class Playlist {
    private Track[] tracks;
    private int currentSize;

    public Playlist() {
        tracks = new Track[10];
        currentSize = 0;
    }

    public void addTrack(Track track) {
        if (track.getDuration() < 0) {
            System.out.println("Invalid length. Track not added.");
            return;
        }
        if (currentSize == tracks.length) {
            growArray();
        }
        tracks[currentSize++] = track;
        System.out.println("Track added!");
    }

    public void removeTrack(String title) {
        int index = findTrackIndex(title);
        if (index == -1) {
            System.out.println("Track not found.");
            return;
        }
        for (int i = index; i < currentSize - 1; i++) {
            tracks[i] = tracks[i + 1];
        }
        tracks[--currentSize] = null;
        System.out.println("Track removed.");
    }

    public void display() {
        if (currentSize == 0) {
            System.out.println("No tracks in the playlist.");
            return;
        }
        System.out.println("Your Playlist:");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(tracks[i]);
        }
    }

    private int findTrackIndex(String title) {
        for (int i = 0; i < currentSize; i++) {
            if (tracks[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    private void growArray() {
        tracks = new Track[tracks.length * 2];
    }

    public int getCurrentSize() {
        return currentSize;
    }


    public int getCurrentCapacity() {
        return tracks.length;
    }
}