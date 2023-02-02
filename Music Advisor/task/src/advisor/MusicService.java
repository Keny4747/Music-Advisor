package advisor;

import java.util.List;

public class MusicService implements IMusicService{
    private MusicRepo repo;
    public  MusicService(){
        repo = new MusicRepo();
    }
    @Override
    public List<Song> getAllSongs() {
        return repo.getAllSongs();
    }

    @Override
    public Song getSongById(int id) {
        return repo.getSongById(id);
    }

    @Override
    public void addSong(Song song) {
        repo.addSong(song);
    }
}
