package by.shap.entity;

import java.util.HashMap;

public class Train {
    private String destination;
    private Integer id;
    private String time;
    private HashMap<String, Integer> seat;

    public Train(String destination, Integer id, String time, HashMap<String, Integer> seat) {
        this.destination = destination;
        this.id = id;
        this.time = time;
        this.seat = seat;
    }

    public Train() {
        this.seat = new HashMap<>();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HashMap<String, Integer> getSeat() {
        return seat;
    }

    public void setSeat(HashMap<String, Integer> seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Train{");
        sb.append("destination='").append(destination).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", time=").append(time);
        sb.append(", seat=").append(seat);
        sb.append('}');
        return sb.toString();
    }
}
