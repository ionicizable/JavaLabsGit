package by.shap.dao;

import by.shap.connectionPool.Connections;
import by.shap.entities.City;

import java.sql.*;
import java.util.ArrayList;

public class CityDao {

    public CityDao() {
    }

    public void create(City city) {
        String insert_new = "INSERT INTO CITY VALUES(?,?,?)";
        try {
            Connection connection = Connections.get();
            PreparedStatement preparedStatement = connection.prepareStatement(insert_new);
            preparedStatement.setString(1, city.getName());
            preparedStatement.setInt(2, city.getYear());
            preparedStatement.setInt(3, city.getArea());
            preparedStatement.execute();
            Connections.putBack(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<City> readAll() throws SQLException {
        try {
            Connection connection = Connections.get();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT NAME, YEAR, AREA FROM CITY");
            ArrayList<City> cities = new ArrayList<>();
            while (resultSet.next()) {
                cities.add(cityFromResultSet(resultSet));
            }
            Connections.putBack(connection);
            return cities;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    private City cityFromResultSet(ResultSet input) throws SQLException {
        return new City(
                input.getString(1),
                input.getInt(2),
                input.getInt(3));
    }
}
