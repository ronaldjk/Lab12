package com.gc.lab12;

import java.util.Random;

public class RandomPlayer extends Player {
	public RandomPlayer()
    {
        name = "RandomPlayer";
    }

  
	
    @Override
    public Roshambo generateRoshambo()
    {              
        // random selection between rock, paper, or scissors
        
       Random r=new Random(); // create new object of class "Random"
       int ch=r.nextInt(3);
       if(ch==0) return Roshambo.ROCK;
       else if(ch==1) return Roshambo.PAPER;
       else return Roshambo.SCISSORS;
    } 

}
