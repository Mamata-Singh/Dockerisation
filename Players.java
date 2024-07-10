package MagicalArena;
//In Players class,Each player has health, strength, and attack attributes.
public class Players {
    private int health;
    private int strength;
    private int attack;
    
    //Constructor to initialize a player with given health, strength, and attack values.
    public Players(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }
    //it gets the current health of the player.
    public int getHealth() {
        return health;
    }
    //It gets the strength of the player
    public int getStrength() {
        return strength;
    }
    //it gets the attack value of the player.
    public int getAttack() {
        return attack;
    }
    
    //The health value will not go below zero and there will be reduction to the the player's health by the given damage amount.
    public void reduceHealth(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }



}
