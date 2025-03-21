package org.hillcrest.music;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PlaylistTest {
    @Test
    void testAddTrack() {
        Playlist playlist = new Playlist();
        Track track = new Track("SongB", "ArtistB", 4.0);
        playlist.addTrack(track);
        assertEquals(1, playlist.getCurrentSize());
    }

    @Test
    void testAddTrackInvalidDuration() {
        Playlist playlist = new Playlist();
        Track track = new Track("SongC", "ArtistC", -1.0);
        playlist.addTrack(track);
        assertEquals(0, playlist.getCurrentSize());
    }

    @Test
    void testRemoveTrack() {
        Playlist playlist = new Playlist();
        Track track = new Track("SongD", "ArtistD", 5.0);
        playlist.addTrack(track);
        playlist.removeTrack("SongD");
        assertEquals(0, playlist.getCurrentSize());
    }

    @Test
    void testRemoveNonExistentTrack() {
        Playlist playlist = new Playlist();
        playlist.removeTrack("NonExistent");
        assertEquals(0, playlist.getCurrentSize());
    }

    @Test
    void testGrowArray() {
        Playlist playlist = new Playlist();
        for (int i = 0; i < 11; i++) {
            playlist.addTrack(new Track("Song" + i, "Artist", 3.0));
        }
        assertTrue(playlist.getCurrentCapacity() >= 20);
    }
}

