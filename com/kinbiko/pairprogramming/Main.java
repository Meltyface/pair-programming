package com.kinbiko.pairprogramming;

public class Main {

    public static void main(String[] args) {
    	Trigger trigger = new Trigger(); 
        //Type varName = new NameOfClass();
        Director director = trigger.getDirector();
        director.sayMyName();      
        
    }


}
