package advisor;

import java.util.List;

public interface IMusicService {
    public List<Song> getAllSongs();
    public Song getSongById(int id);
    public void addSong(Song song);
}
