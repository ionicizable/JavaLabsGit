package entity;

import java.util.Objects;

public class Puppy extends Dog {

    protected String name;

    public Puppy(Integer age, String breed, String name) {
        super(age, false, breed, true);
        this.name = name;
    }

    public void showName(){
        System.out.println("\n");
        System.out.println(this.getName());
        System.out.println("\n");
    }

    public String getName() {
        return this.name;
    }

    public void voice(){
        System.out.println("\n");
        System.out.println("woof");
        System.out.println("\n");
    }

    public void jump(){
        System.out.println("\n");
        System.out.println("*puppy does a cute jump*");
        System.out.println("\n");
    }

    public void run(){
        System.out.println("\n");
        System.out.println("*puppy runs around in circles, chasing its tail*");
        System.out.println("\n");
    }

    public void bite(){
        System.out.println("\n");
        System.out.println("*puppy tries to bite you but it is too small to reach*");
        System.out.println("\n");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Puppy puppy = (Puppy) o;
        return Objects.equals(getName(), puppy.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Puppy{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
