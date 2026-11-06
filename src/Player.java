import java.util.logging.Level;

public class Player {
    private String Name;
    private int Health;
    private int attackDamage;
    private int gold;
    private int xp;
    private int level;
    private int maxHealth;

    Player(String Name, int Health, int attackDamage, int gold, int xp, int level, int maxHealth) {
        this.Name = Name;
        this.Health = Health;
        this.attackDamage = attackDamage;
        this.gold = gold;
        this.xp = xp;
        this.level = level;
        this.maxHealth = maxHealth;
    }

    void displayDetails() {
        System.out.println("Player Name: " + Name);
        System.out.println("Health: " + Health + " | " + "Attack: " + attackDamage);
        System.out.println("Gold: " + gold + " | " + "XP: " + xp + " | " + "Level: " + level);
    }

    public String getName() {
        return Name;
    }

    public void takeDamage(int damage) {
        Health = Math.max(0, Health - damage);
    }

    public int getHealth() {
        return Health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void addXP(int amount) {
        xp += amount;
        checkLevelUp();
    }

    public void checkLevelUp() {
        //Keep subtracting until we reach level 0 or else our loop will not stop
        while (xp >= 120) {
            levelUp();
            xp -= 120;
        }
    }

    public void levelUp() {
        int currentLevel = this.level++;
        int level = currentLevel + 1;
        System.out.println("Congratulations! You're now level " + level);
        System.out.println("You've unlocked the rewards..!! Keep grinding champ!");
        rewardAwards();
    }

    public void rewardAwards() {
        this.maxHealth += 20;
        this.Health = this.maxHealth;
        this.attackDamage += 5;
    }

    public void addGold(int amount) {
        this.gold += amount;
    }

    public int getGold() {
        return gold;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

}
