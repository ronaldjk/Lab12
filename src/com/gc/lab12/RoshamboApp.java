package com.gc.lab12;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		

		Player opponentPlayer = null;
		String choice = "y";
		
		
		
		// 1. Display user prompt
		
		System.out.println("Please enter your name: ");
		
		//2. Get user name input
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		//3. Display Select opponent prompt
		String playerSelection = Validator.getString(scan, "Choose your opponent: R(O)ckPlayer or R(A)ndomPlayer ");
		
		RockPlayer rockpl = new RockPlayer();
		RandomPlayer randpl = new RandomPlayer();
		char playerType = playerSelection.charAt(0);
		
		
		
		//4. Get user opponent choice input
		
		
		if (playerType == 'o' || playerType =='O') {
			opponentPlayer = rockpl;
		} else if (playerType == 'a' || playerType == 'A'){
			opponentPlayer = randpl;
		}
		
		if(playerSelection.charAt(0)=='o' || playerSelection.charAt(0)=='O') playerSelection="RockPlayer";
        else if(playerSelection.charAt(0)=='a' || playerSelection.charAt(0) == 'A') playerSelection="RandomPlayer";
        opponentPlayer.setName(playerSelection);
		
	
		while (choice.compareTo("y") == 0)
		{
        //5. Display user prompt for rock, paper, scissors
		
        System.out.println("Please select (R)ock, (P)aper, or (S)cissors: ");
        String rps = scan.next();
        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.setName(name); // sets the name as the humanPlayer
        humanPlayer.setResponse(rps);

      //6. Get user game choice 
        if(rps.charAt(0)=='r' || rps.charAt(0) == 'R') rps="Rock";
        else if(rps.charAt(0)=='p' || rps.charAt(0) == 'P') rps="Paper";
        else if(rps.charAt(0)=='s' || rps.charAt(0) == 'S') rps="Scissors";
        System.out.println(name+ " : " + rps);

       
        String roshambo=opponentPlayer.generateRoshambo().toString(); // this will generate opponent's roshambo
        System.out.println(opponentPlayer.getName()+ " : " +roshambo ); // prints opponent's name and their roshambo

      //7. Display results of match
        if(Character.toUpperCase(rps.charAt(0)) == roshambo.charAt(0))
        System.out.println("It's a tie!");
        
        else if(rps.equals("Paper") && roshambo.equals("Rock"))
        System.out.println(humanPlayer.getName()+" wins!");
        
        else if(roshambo.equals("Paper") && rps.equals("Rock"))
        System.out.println(opponentPlayer.getName()+" Wins");
        
        else if(rps.equals("Paper") && roshambo.equals("Scissors"))
        System.out.println(opponentPlayer.getName()+" Wins!");
        
        else if(roshambo.equals("Paper") && rps.equals("Scissors"))
        System.out.println(humanPlayer.getName()+" Wins!");
        
        else if(rps.equals("Scissors") && roshambo.equals("Rock"))
        System.out.println(opponentPlayer.getName()+" Wins");
        
        else if(roshambo.equals("Scissors") && rps.equals("Rock"))
        System.out.println(humanPlayer.getName()+" Wins");

       
         choice = Validator.getString(scan, "Would you like to ROSHAMBO again?!? (y/n): ");
         System.out.println();

     }
		
		System.out.println("Thanks for playing!");

	
	
}


}

