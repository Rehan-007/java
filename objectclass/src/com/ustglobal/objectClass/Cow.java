package com.ustglobal.objectClass;

public class Cow {

	int cost;
	String name;
	String color;
	
	
	public Cow(int cost, String name, String color) {
		super();
		this.cost = cost;
		this.name = name;
		this.color = color;
	}
	
	public boolean equals(Object obj) {
		
	    Cow c=(Cow)obj;
	    
	    if(this.cost == c.cost) {
	    	  if(this.name == c.name) {
	    		  if(this.color == c.color) {
	    			  return true;
	    		  }else {
	    			  return false;
	    		  }
	    		  
	    	  }else{
	    		  return false;
	    	  }
	      }else{
	    	  return false;
	      }
	 }

}
