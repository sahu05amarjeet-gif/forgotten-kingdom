public class Enemy {
    private String name;
    private int health;
    private int attackDamage;

    Enemy(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    void displayDetails() {
        System.out.println("Enemy name: " + name);
        System.out.println("Health: " + health + " | " + "Attack: " + attackDamage);
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
}
