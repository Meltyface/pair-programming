package com.kinbiko.pairprogramming;

public class Main {

    public static void main(String[] args) {
        //Type varName = new NameOfClass();
        Director director = getDirector();
        director.sayMyName();        
    }

    private static Director getDirector(){
        //Could just as easily return new Miyazaki();
        return new Takehara();
    }

}
