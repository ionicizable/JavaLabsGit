package by.shap;

import by.shap.dao.CitizenDao;
import by.shap.dao.CityDao;
import by.shap.entities.Citizen;
import by.shap.entities.City;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();
        CitizenDao citizenDao = new CitizenDao();
        try {
            System.out.println("Cities:");
            ArrayList<City> cities = cityDao.readAll();
            for (City city : cities) {
                System.out.println(city.toString());
            }
            System.out.println("Citizens");
            ArrayList<Citizen> citizens = citizenDao.readAll();
            for (Citizen citizen : citizens) {
                System.out.println(citizen.toString());
            }
            System.out.println("Введите имя города и язык:");
            Scanner sc = new Scanner(System.in);
            String buffer = sc.next();
            String lang = sc.next();
            for (Citizen citizen : citizens) {
                if (citizen.getCityName().equals(buffer)&&citizen.getLanguage().equals(lang)){
                    System.out.println(citizen.toString());
                }
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
