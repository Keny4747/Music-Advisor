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
            case "auth"->{
                return MenuOpt.AUTH;
            }
            case "exit"->{
                return MenuOpt.EXIT;
            }
            default -> {
                return MenuOpt.DEFAULT;
            }
        }

    }
}
