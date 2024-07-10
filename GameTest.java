package UnitTesting;

import org.junit.jupiter.api.Test;
//we are importing the classes->Game,Players here in test class
import MagicalArena.Game;
import MagicalArena.Players;


import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    public void testGame() {
    	// Created players with initial health, strength, and attack values
    	Players playerA = new Players(50, 5, 10);  
    	Players playerB = new Players(100, 10, 5);  

        // Create a Game object with the two players
        Game game = new Game(playerA, playerB);
        // Start the game simulation
        game.start();
     // We are asserting that either playerA's health or playerB's health is zero or less
        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }
}


