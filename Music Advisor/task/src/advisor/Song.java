package advisor;

import java.util.List;

public class Song {
    private int id;
    private String title;
    private List<Artist> artists;

    public Song(int id, String title, List<Artist> artists) {
        this.id = id;
        this.title = title;
        this.artists = artists;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Artist> getArtists() {
        return artists;
    }
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artists=" + artists +
                '}';
    }
}
