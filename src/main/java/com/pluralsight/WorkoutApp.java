package com.pluralsight;

import java.util.Scanner;

public class WorkoutApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runHomeScreen();
    }

    public static void runHomeScreen() {
        String command;
        do {
            System.out.println();
            System.out.println("=== Home ===");
            System.out.println("N) New Workout");
            System.out.println("W) Workouts");
            System.out.println("X) Exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "N" -> addWorkout();
                case "W" -> runWorkoutsScreen();
                case "X" -> System.out.println("Goodbye!");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("X"));
    }

    public static void runWorkoutsScreen() {
        String command;
        do {
            System.out.println();
            System.out.println("=== Workouts ===");
            System.out.println("A) All Workouts");
            System.out.println("Q) Quick Workouts");
            System.out.println("F) Favorites");
            System.out.println("S) Search");
            System.out.println("H) Home");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "A" -> displayAllWorkouts();
                case "Q" -> displayQuickWorkouts();
                case "F" -> displayFavoritesWorkouts();
                case "S" -> runSearchScreen();
                case "H" -> System.out.println("Back to Home");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("H"));
    }

    public static void runSearchScreen() {
        String command;
        do {
            System.out.println();
            System.out.println("=== Search ===");
            System.out.println("1) By Name");
            System.out.println("2) By Type");
            System.out.println("3) By Length");
            System.out.println("0) Back");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "1" -> searchByName();
                case "2" -> searchByType();
                case "3" -> searchByLength();
                case "0" -> System.out.println("Back to Browse Movies");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("0"));
    }

    public static void addWorkout() {
        System.out.println("TODO: display all workouts");
        pressEnterToContinue();
    }

    public static void displayAllWorkouts() {
        System.out.println("TODO: display all workouts");
        pressEnterToContinue();
    }

    public static void displayQuickWorkouts() {
        System.out.println("TODO: display all workouts");
        pressEnterToContinue();
    }

    public static void displayFavoritesWorkouts() {
        System.out.println("TODO: display all workouts");
        pressEnterToContinue();
    }

    public static void searchByName() {
        System.out.println("TODO: display all workouts");
        pressEnterToContinue();
    }

    public static void searchByType() {
        System.out.println("TODO: display all workouts");
        pressEnterToContinue();
    }

    public static void searchByLength() {
        System.out.println("TODO: display all workouts");
        pressEnterToContinue();
    }

    public static void pressEnterToContinue() {
        System.out.println();
        System.out.print("Press Enter to go back to the menu...");
        scanner.nextLine();
    }
}
