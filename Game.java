package MagicalArena;
//In this class,two players will  fight until one's health reaches to zero
import java.util.Random;

//We have 2 players,PlayerA and PlayerB
public class Game {
    private Players playerA;
    private Players playerB;
    private Random random;
    
    
  //Constructor to initialize 2 players->PlayerA,PlayerB.
    public Game(Players playerA, Players playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.random = new Random();
    }

    public void start() {
    	//this function determines that based on health,which player will attack first
        boolean isPlayerATurn = playerA.getHealth() <= playerB.getHealth();
        
        //we will continue the game until one player's health reaches zero.
        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
        	// Determine who is  the attacker and defender based on whose turn it is.
        	Players attacker = isPlayerATurn ? playerA : playerB;
            Players defender = isPlayerATurn ? playerB : playerA;
            
            // We will roll the dice for both attack and defense.
            int attackRoll = rollDice();
            int defenseRoll = rollDice();
            
            // we are calculating the  attack damage and defense strength.
            int attackDamage = attackRoll * attacker.getAttack();
            int defenseStrength = defenseRoll * defender.getStrength();
            
            // Calculate the actual damage dealt after defense.
            int damage = Math.max(0, attackDamage - defenseStrength);
            defender.reduceHealth(damage);
            
            
            
            // Print the details of the turn.
            System.out.println("Player " + (isPlayerATurn ? "A" : "B") + " attacks with roll " + attackRoll);
            System.out.println("Player " + (isPlayerATurn ? "B" : "A") + " defends with roll " + defenseRoll);
            System.out.println("Damage dealt: " + damage);
            System.out.println("Player A health: " + playerA.getHealth() + ", Player B health: " + playerB.getHealth());
         // we are switching  turns for PlayerA and PlayerB.
            isPlayerATurn = !isPlayerATurn;
        }
        
        
        
        
        // it determine the outcome of the game.
        if (playerA.getHealth() <= 0 && playerB.getHealth() <= 0) {
            System.out.println("Game Draws!!");
        } else if (playerA.getHealth() <= 0) {
            System.out.println("Player B WINS!!");
        } else {
            System.out.println("Player A WINS!!");
        }
    }
    
    
    
//    a six-sided dice is rolled and returns the result.
    private int rollDice() {
        return random.nextInt(6) + 1;
    }
}
