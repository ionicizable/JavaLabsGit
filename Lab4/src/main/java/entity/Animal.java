package entity;

import java.util.Objects;

public class Animal {
    protected Integer age;
    protected Boolean tail;
    protected Boolean aggressive;
    protected Boolean flying;

    public Animal(Integer age, Boolean tail, Boolean aggressive, Boolean flying) {
        this.age = age;
        this.tail = tail;
        this.aggressive = aggressive;
        this.flying = flying;
    }

    public Animal() {

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getTail() {
        return tail;
    }

    public void setTail(Boolean tail) {
        this.tail = tail;
    }

    public Boolean getAggressive() {
        return aggressive;
    }

    public void setAggressive(Boolean aggressive) {
        this.aggressive = aggressive;
    }

    public Boolean getFlying() {
        return flying;
    }

    public void setFlying(Boolean flying) {
        this.flying = flying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAge().equals(animal.getAge()) &&
                getTail().equals(animal.getTail()) &&
                getAggressive().equals(animal.getAggressive()) &&
                getFlying().equals(animal.getFlying());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getTail(), getAggressive(), getFlying());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("age=").append(age);
        sb.append(", tail=").append(tail);
        sb.append(", aggressive=").append(aggressive);
        sb.append(", flying=").append(flying);
        sb.append('}');
        return sb.toString();
    }
}
