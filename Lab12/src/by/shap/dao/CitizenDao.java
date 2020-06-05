package by.shap.dao;

import by.shap.connectionPool.Connections;
import by.shap.entities.Citizen;

import java.sql.*;
import java.util.ArrayList;

public class CitizenDao {

    public CitizenDao() {
    }

    public void create(Citizen citizen) {
        String insert_new = "INSERT INTO CITY VALUES(?,?,?,?,?)";
        try {
            Connection connection = Connections.get();
            PreparedStatement preparedStatement = connection.prepareStatement(insert_new);
            preparedStatement.setString(1, citizen.getName());
            preparedStatement.setString(2, citizen.getLanguage());
            preparedStatement.setInt(3, citizen.getRich());
            preparedStatement.setString(3, citizen.getCityName());
            preparedStatement.setInt(3, citizen.getRich());
            preparedStatement.execute();
            Connections.putBack(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Citizen> readAll() throws SQLException {
        try {
            Connection connection = Connections.get();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT NAME, LANGUAGE, RICH, CITYNAME FROM CITIZEN");
            ArrayList<Citizen> citizens = new ArrayList<>();
            while (resultSet.next()) {
                citizens.add(citizenFromResultSet(resultSet));
            }
            Connections.putBack(connection);
            return citizens;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    private Citizen citizenFromResultSet(ResultSet input) throws SQLException {
        return new Citizen(
                input.getString(1),
                input.getString(2),
                input.getInt(3),
                input.getString(4));
    }
}
