package com.kinbiko.pairprogramming;

public abstract class Director {

    public void sayMyName(){
    	System.out.println("My name is: " + getName());
    }
    public abstract String getName();
}
