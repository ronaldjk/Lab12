package com.gc.lab12;

public abstract class Player {
	   public String name;
	    public String response;

	    public Player() {}
	    
	    //set method for name
	    public void setName(String name)
	    {
	        this.name = name;
	    }
	    
	    //get method for name
	    public String getName()
	    {
	        return name;
	    }
	    
	    
	    public void setResponse(String response)
	    {
	        this.response = response;
	    }
	    
	    
	    public String getResponse()
	    {
	        return response;
	    }
	    
	    // this is an abstract method that allows an inheriting class to ultimately generate and return a Roshambo value
	    public abstract Roshambo generateRoshambo();    
}
