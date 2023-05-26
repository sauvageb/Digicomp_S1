package fr.sauvageboris.training.jdbc.dao;

import fr.sauvageboris.training.jdbc.ConnectionManager;
import fr.sauvageboris.training.jdbc.model.Fruit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FruitJdbcCrud implements GenericCrud<Fruit, Long> {

    @Override
    public Optional<Fruit> findById(Long id) {
        String query = "SELECT id, name, price, bestBefore FROM fruits where id=?";
        try (PreparedStatement pst = ConnectionManager.get().prepareStatement(query)) {
            pst.setLong(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Fruit fruit = new Fruit(rs.getLong("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getObject("bestBefore", LocalDate.class));
                return Optional.of(fruit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public boolean update(Fruit fruit) {
        String query = "UPDATE fruits SET name=?, price=?, bestBefore=? WHERE id=?";
        try (PreparedStatement pst = ConnectionManager.get().prepareStatement(query)) {
            pst.setString(1, fruit.getName());
            pst.setDouble(2, fruit.getPrice());
            pst.setObject(3, fruit.getBestBefore());
            pst.setLong(4, fruit.getId());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean create(Fruit fruit) {
        String query = "INSERT INTO fruits (name, price, bestBefore) VALUES (?, ?, ?)";
        try (PreparedStatement pst = ConnectionManager.get().prepareStatement(query)) {
            pst.setString(1, fruit.getName());
            pst.setDouble(2, fruit.getPrice());
            pst.setObject(3, fruit.getBestBefore());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Fruit fruit) {
        String query = "DELETE FROM fruits WHERE id=?";
        try (PreparedStatement pst = ConnectionManager.get().prepareStatement(query)) {
            pst.setLong(1, fruit.getId());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Fruit> findAll() {
        List<Fruit> fruits = new ArrayList<>();
        String query = "SELECT id, name, price, bestBefore FROM fruits";
        try (PreparedStatement pst = ConnectionManager.get().prepareStatement(query)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Fruit fruit = new Fruit(rs.getLong("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getObject("bestBefore", LocalDate.class));
                fruits.add(fruit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fruits;
    }

}
