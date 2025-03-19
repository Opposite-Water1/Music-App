package org.hillcrest.music;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TrackTest {
    @Test
    void testGetters() {
        Track track = new Track("SongA", "ArtistA", 3.5);
        assertEquals("SongA", track.getTitle());
        assertEquals("ArtistA", track.getArtist());
        assertEquals(3.5, track.getDuration());
    }

    @Test
    void testSetters() {
        Track track = new Track("SongA", "ArtistA", 3.5);
        track.setTitle("NewSong");
        track.setArtist("NewArtist");
        track.setDuration(4.2);
        assertEquals("NewSong", track.getTitle());
        assertEquals("NewArtist", track.getArtist());
        assertEquals(4.2, track.getDuration());
    }

    @Test
    void testToString() {
        Track track = new Track("SongA", "ArtistA", 3.5);
        String expected = "Title: SongA | Artist: ArtistA | Duration: 3.5";
        assertEquals(expected, track.toString());
    }
}
