package by.shap.entities;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private Integer year;
    private Integer area;
    private ArrayList<Citizen> population;

    public City(String name, Integer year, Integer area) {
        this.name = name;
        this.year = year;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public List<Citizen> getPopulation() {
        return population;
    }

    public void setPopulation(ArrayList<Citizen> population) {
        this.population = population;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("name='").append(name).append('\'');
        sb.append(", year=").append(year);
        sb.append(", area=").append(area);
        sb.append('}');
        return sb.toString();
    }
}
