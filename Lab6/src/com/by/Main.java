package com.by;

public class Main {
    public static void main(String[] args){
        ComedyFilm comedyFilm = new ComedyFilm("1+1", "Loran Zeytun");

        System.out.println(comedyFilm);
        comedyFilm.turnOn();
        comedyFilm.turnOff();
    }
}
