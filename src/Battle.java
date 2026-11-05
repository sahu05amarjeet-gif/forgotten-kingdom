import java.util.Scanner;

public class Battle {
    public static void case1(Player playerDetails, Enemy enemyDetails, Scanner input) {
        System.out.println("You venture into the dark forest");
        System.out.println("You encountered an enemy...");
        System.out.println("....");
        System.out.println();
        System.out.println("===== BATTLE =====");
        System.out.println("Player name: " + playerDetails.getName());
        System.out.println("Enemy name: " + enemyDetails.getName());
        System.out.println("1. Attack");
        System.out.println("2. Run away");
        boolean isFound = true;
        while (isFound) {
            System.out.print("Choose: ");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Let the battle begins..!!");
                startBattle(playerDetails, enemyDetails);
                isFound = false;
            } else if (choice == 2) {
                System.out.println("You ran away cowardly");
                isFound = false;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void startBattle(Player playerDetails, Enemy enemyDetails) {
        while (playerDetails.getHealth() > 0 && enemyDetails.getHealth() > 0) {
            playerBattle(playerDetails, enemyDetails);
            if (enemyDetails.getHealth() <= 0) {
                System.out.println(playerDetails.getName() + " won the dual");
                break;
            }
            enemyBattle(playerDetails, enemyDetails);
            if (playerDetails.getHealth() <= 0) {
                System.out.println(enemyDetails.getName() + " won the dual");
                break;
            }
        }
    }

    public static void playerBattle(Player playerDetails, Enemy enemyDetails) {
        //Player attacks
        System.out.println("Player attacks: " + playerDetails.getAttackDamage());
        //Enemy looses health
        enemyDetails.takeDamage(playerDetails.getAttackDamage());
        //Display enemy's health
        System.out.println(enemyDetails.getName() + " looses health!! Current health " + enemyDetails.getHealth());
    }

    public static void enemyBattle(Player playerDetails, Enemy enemyDetails) {
        //Enemy attacks player
        System.out.println(enemyDetails.getName() + " attacked player " + enemyDetails.getAttackDamage());
        //Player looses health
        playerDetails.takeDamage(enemyDetails.getAttackDamage());
        //Display player's health
        System.out.println(playerDetails.getName() + " looses health!! Current health " + playerDetails.getHealth());
    }
}
