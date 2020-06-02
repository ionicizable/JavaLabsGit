package com.by;

public class ComedyFilm extends NativeFilm {

    public ComedyFilm(String name, String producer){
        super(name, producer);
    }

    @Override
    public void turnOff() {
        System.out.println("You stopped watching " + getName());
        setTurned(false);
    }

    @Override
    public void turnOn() {
        System.out.println("You started watching " + getName());
        setTurned(true);
    }

    @Override
    public String toString() {
        return "ComedyFilm{" +
                "name='" + getName() + '\'' +
                ", producer='" + getProducer() + '\'' +
                '}';
    }
}
