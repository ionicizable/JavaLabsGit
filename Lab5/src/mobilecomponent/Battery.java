package mobilecomponent;

public class Battery {
    private int capacity;

    public Battery(){
        capacity = 0;
    }

    public Battery(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "\n\tcapacity=" + capacity + '\n' +
                '}';
    }
}
