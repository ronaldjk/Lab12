package com.gc.lab12;

public class RockPlayer extends Player {
	
	public RockPlayer()
	{
		name = "RockPlayer";
	}
	
	@Override
	public Roshambo generateRoshambo()
	{
		return Roshambo.ROCK; 
	}

}
	