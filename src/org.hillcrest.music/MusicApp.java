package org.hillcrest.music;

import java.util.Scanner;


public class MusicApp {
    /***
     * Samhith Vajjala
     * 3/20/2025
     * Music playlist
     *
     * @param args the main method
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int choice;

        do {
            printMenu();
            System.out.print("Enter choice: ");
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Enter a number from 1 to 4.");
                in.next();
            }
            choice = in.nextInt();
            in.nextLine();

            if(choice == 1) {
                addTrack(in, playlist);
            } else if(choice == 2) {
                removeTrack(in, playlist);
            } else if(choice == 3) {
                System.out.println(playlist.display());
            } else if(choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);
        in.close();
    }


    /***
     * Prints the main menu
     */
    private static void printMenu() {
        System.out.println("\n---------------------------------------");
        System.out.println("1) Add Track");
        System.out.println("2) Remove Track");
        System.out.println("3) Display Playlist");
        System.out.println("4) Exit");
        System.out.println("---------------------------------------");
    }

    /***
     * Prints the menu that adds a song to the playlist
     *
     * @param in lets the user make the song
     * @param playlist adds to the playlist
     */
    private static void addTrack(Scanner in, Playlist playlist) {
        System.out.print("Enter title: ");
        String title = in.nextLine();
        System.out.print("Enter artist: ");
        String artist = in.nextLine();
        System.out.print("Enter duration: ");

        while (!in.hasNextDouble()) {
            System.out.println("Invalid duration. Please enter a number.");
            in.next();
        }
        double duration = in.nextDouble();
        in.nextLine();

        playlist.addTrack(new Track(title, artist, duration));
    }

    /***
     * Menu to remove a song from the playlsit
     *
     * @param in lets the user make the song
     * @param playlist adds to the playlist
     */
    private static void removeTrack(Scanner in, Playlist playlist) {
        System.out.print("Enter title to remove: ");
        String title = in.nextLine();
        playlist.removeTrack(title);
    }
}


    //All I/O happens here
    //add the following methods
    /*
    main method
    private static void printMenu()
    private static void addTrack(Scanner in, Playlist playlist)
    private static void removeTrack(Scanner in, Playlist playlist)
     */
