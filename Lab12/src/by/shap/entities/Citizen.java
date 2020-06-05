package by.shap.entities;

public class Citizen {
    private String name;
    private String language;
    private Integer rich;
    private String cityName;

    public Citizen(String name, String language, Integer rich, String cityName) {
        this.name = name;
        this.language = language;
        this.rich = rich;
        this.cityName = cityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getRich() {
        return rich;
    }

    public void setRich(Integer rich) {
        this.rich = rich;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Citizen{");
        sb.append("name='").append(name).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", rich=").append(rich);
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
