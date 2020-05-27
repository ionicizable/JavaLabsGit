package entity;

import java.util.Objects;

public class Dog extends  Animal {
    protected String breed;
    protected Boolean owner;

    public Dog(Integer age, Boolean aggressive, String breed, Boolean owner) {
        super(age, true, aggressive, false);
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return breed.equals(dog.breed) &&
                owner.equals(dog.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, owner);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("breed='").append(breed).append('\'');
        sb.append(", owner=").append(owner);
        sb.append(", age=").append(age);
        sb.append(", tail=").append(tail);
        sb.append(", aggressive=").append(aggressive);
        sb.append(", flying=").append(flying);
        sb.append('}');
        return sb.toString();
    }
}
