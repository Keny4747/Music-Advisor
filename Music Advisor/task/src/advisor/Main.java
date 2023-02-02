package advisor;
import java.util.Scanner;
public class Main {
    public final Scanner scanner = new Scanner(System.in);
    private MusicService service = new MusicService();
    public static void main(String[] args) {
        Main main = new Main();
        String input;

        do{
            input=main.userInput();
            main.menu(input);
        }while(!input.equals("exit"));
        main.messageExit();

    }
    public String userInput(){
        return scanner.nextLine();
    }
    public void menu(String userInput){
        MenuOpt opt = Util.option(userInput);
        switch (opt){
            case NEW -> newReleases();
            case FEATURED ->featured();
            case CATEGORIES -> categories();
            case MOOD -> moodPlaylists();
        }
    }
    public void messageExit(){
        System.out.println("---GOODBYE!---");
    }
    public void newReleases(){
        StringBuilder release= new StringBuilder();
        release
                .append("Mountains [Sia, Diplo, Labrinth]\n")
                .append("Runaway [Lil Peep]\n")
                .append("The Greatest Show [Panic! At The Disco]\n")
                .append("All Out Life [Slipknot]\n");
        System.out.printf("---NEW RELEASES---%n%s",release);
    }
    public void featured(){
        StringBuilder featured= new StringBuilder();
        featured
                .append("Mellow Morning\n")
                .append("Wake Up and Smell the Coffee\n")
                .append("Monday Motivation\n")
                .append("Songs to Sing in the Shower\n");
        System.out.printf("---FEATURED---%n%s",featured);
    }

    public void categories(){
        StringBuilder categorie= new StringBuilder();
        categorie
                .append("Top Lists\n")
                .append("Pop\n")
                .append("Mood\n")
                .append("Latin\n");
        System.out.printf("---CATEGORIES---%n%s",categorie);
    }

    public void moodPlaylists(){
        StringBuilder playlists= new StringBuilder();
        playlists
                .append("Walk Like A Badass \n")
                .append("Rage Beats  \n")
                .append("Arab Mood Booster\n")
                .append("Sunday Stroll\n");
        System.out.printf("---MOOD PLAYLISTS---%n%s",playlists);
    }
}
