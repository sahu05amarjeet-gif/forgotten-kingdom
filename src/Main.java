import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("FORGOTTEN KINGDOM -TERMINAL");
        System.out.println("⚔\uFE0F Welcome, Warrior!");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = input.nextLine();
        System.out.println("---------------------------------------------");

        System.out.println("Your Adventure begins..." + username);
        Player playerDetails = new Player(username, 100, 20, 50, 0, 1, 100);
        System.out.println();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== MAIN MENU ===");
            System.out.println("1. Explore the kingdom");
            System.out.println("2. View the player stats");
            System.out.println("3. Exit game");
            System.out.print("Choose your action: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Enemy enemyDetails = new Enemy("Goblin", 50, 10);
                    Battle.case1(playerDetails, enemyDetails, input);
                    break;
                case 2:
                    System.out.println("--- PLAYER STATS ---");
                    playerDetails.displayDetails();
                    break;
                case 3:
                    System.out.println("Thanks for playing, warrior!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
