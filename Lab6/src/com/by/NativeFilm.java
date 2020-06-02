package com.by;

import java.util.Objects;

abstract class NativeFilm implements Film{
    private String name;
    private String producer;
    private boolean isTurned;

    public NativeFilm(String name, String producer){
        this.name = name;
        this.producer = producer;
        isTurned = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isTurned(){
        return isTurned;
    }

    public void setTurned(boolean isTurned){
        this.isTurned = isTurned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComedyFilm)) return false;
        ComedyFilm that = (ComedyFilm) o;
        return getName().equals(that.getName()) &&
                getProducer().equals(that.getProducer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getProducer());
    }

    @Override
    public abstract void turnOn();

    @Override
    public abstract void turnOff();
}
