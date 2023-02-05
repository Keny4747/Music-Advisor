package advisor;

import java.net.URI;
import java.util.Scanner;

public class Main{
    private static final String clientId = "a19ee7dbfda443b2a8150c9101bfd645";
    private static final String redirectUri = "http://localhost:8080";
    private static boolean accessGranted = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {

            String command = input.nextLine();
            switch (command) {
                case "auth":
                    auth();
                    break;
                case "new":
                    if (accessGranted) {
                        newReleases();
                    } else {
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "featured":
                    if (accessGranted) {
                        featured();
                    } else {
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "categories":
                    if (accessGranted) {
                        categories();
                    } else {
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    System.exit(0);
                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    private static void auth() {
        URI authorizationUri = URI.create("https://accounts.spotify.com/authorize?client_id=" + clientId + "&redirect_uri=" + redirectUri + "&response_type=code");
        System.out.println(authorizationUri.toString());
        System.out.println("---SUCCESS---");
        accessGranted = true;
    }

    private static void newReleases() {
        System.out.println("---NEW RELEASES---");
        System.out.println("Mountains [Sia, Diplo, Labrinth]");
        System.out.println("Runaway [Lil Peep]");
        System.out.println("The Greatest Show [Panic! At The Disco]");
        System.out.println("All Out Life [Slipknot]");
    }

    private static void featured(){
        StringBuilder featured= new StringBuilder();
        featured
                .append("Mellow Morning\n")
                .append("Wake Up and Smell the Coffee\n")
                .append("Monday Motivation\n")
                .append("Songs to Sing in the Shower\n");
        System.out.printf("---FEATURED---%n%s",featured);
    }

    private static void categories(){
        StringBuilder categorie= new StringBuilder();
        categorie
                .append("Top Lists\n")
                .append("Pop\n")
                .append("Mood\n")
                .append("Latin\n");
        System.out.printf("---CATEGORIES---%n%s",categorie);
    }

    private static void moodPlaylists(){
        StringBuilder playlists= new StringBuilder();
        playlists
                .append("Walk Like A Badass \n")
                .append("Rage Beats  \n")
                .append("Arab Mood Booster\n")
                .append("Sunday Stroll\n");
        System.out.printf("---MOOD PLAYLISTS---%n%s",playlists);
    }
}




