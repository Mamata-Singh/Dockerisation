package MagicalArena;

import java.util.Scanner;

public class ArenaM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //it will prompt user for Input on screen for PlayerA
        System.out.println("Enter status of Player A: Health, Strength, Attack");
        int healthA = scanner.nextInt();
        int strengthA = scanner.nextInt();
        int attackA = scanner.nextInt();
     //it will prompt user for Input on screen for PlayerB
        System.out.println("Enter status of Player B: Health, Strength, Attack");
        int healthB = scanner.nextInt();
        int strengthB = scanner.nextInt();
        int attackB = scanner.nextInt();
     // Create Players objects for Player A and Player B
        Players playerA = new Players(healthA, strengthA, attackA);
        Players playerB = new Players(healthB, strengthB, attackB);
        // Created a Game object with Player A and Player B, then start the game
        Game game = new Game(playerA, playerB);
        game.start();
    }
}
