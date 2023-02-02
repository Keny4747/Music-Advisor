package advisor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MusicRepo {
    private List<Song> songList;

    public MusicRepo() {
        this.songList = new ArrayList<>();
    }
    public Song getSongById(int id) {
        Song song = songList.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        return song;
    }
    public List<Song> getAllSongs(){
        return songList;
    }
    public void addSong(Song song){
        songList.add(song);
    }
}
