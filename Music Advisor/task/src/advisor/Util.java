package advisor;

public class Util {

    public static MenuOpt option(String userInput){
        switch (userInput) {
            case "new" -> {
                return MenuOpt.NEW;
            }
            case "categories" -> {
                return MenuOpt.CATEGORIES;
            }
            case "featured" -> {
                return MenuOpt.FEATURED;
            }
            case "playlists Mood" -> {
                return MenuOpt.MOOD;
            }
            default -> {return MenuOpt.EXIT;}
        }

    }
}
