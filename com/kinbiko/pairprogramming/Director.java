package com.kinbiko.pairprogramming;

public class Director {
	private String name;
	
    public void sayMyName(){
    	System.out.println("My name is: " + getName());
    }
    public String getName(){
    	return name;
    }
    public Director(String nameToSet){
    	name = nameToSet;
    }
}
