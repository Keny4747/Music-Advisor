package advisor;

public enum MenuOpt {
        NEW("new"),
        FEATURED("featured"),
        CATEGORIES("categories"),
        MOOD("playlists Mood"),
        EXIT("exit"),
        AUTH("auth"),
        DEFAULT("");

        final String value;
        MenuOpt(String value){
            this.value = value;
        }

}
