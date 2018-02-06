package com.gc.lab12;

public enum Roshambo { // enumeration called Roshambo

	ROCK, PAPER, SCISSORS;
    
   @Override
   public String toString(){
       if (this.ordinal() == 0)   return "Rock"; // returns the ordinal of this enumeration constant
       if (this.ordinal() == 1)   return "Paper"; // returns the ordinal of this enumeration constant
       if (this.ordinal() == 2)   return "Scissors"; // returns the ordinal of this enumeration constant
       return "";   
    }    
	
}
