public class Player {
    private String Name;
    private int Health;
    private int attackDamage;
    private int gold;
    private int xp;
    private int level;

    Player(String Name, int Health, int attackDamage, int gold, int xp, int level) {
        this.Name = Name;
        this.Health = Health;
        this.attackDamage = attackDamage;
        this.gold = gold;
        this.xp = xp;
        this.level = level;
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
}
