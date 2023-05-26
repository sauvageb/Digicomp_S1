package fr.sauvageboris.training.jdbc;


import fr.sauvageboris.training.jdbc.dao.FruitJdbcCrud;
import fr.sauvageboris.training.jdbc.model.Fruit;

import java.time.LocalDate;
import java.util.function.Consumer;

public class Main {

    // PRÉ-REQUIS :
    // Utiliser data.sql pour créer la table fruits dans la base de données example
    public static void main(String[] args) {
        FruitJdbcCrud fruitDao = new FruitJdbcCrud();
        System.out.println("1# Using READ (find all fruits)");
        fruitDao.findAll().stream().forEach(new Consumer<Fruit>() {
            @Override
            public void accept(Fruit fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("2# Using READ (find fruit by id)");
        fruitDao.findById(1L).ifPresent(new Consumer<Fruit>() {
            @Override
            public void accept(Fruit fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("3# Using CREATE (find fruit by id)");
        boolean isCreated = fruitDao.create(new Fruit("Kiwi", 1.0f, LocalDate.now()));
        System.out.println("Insertion : " + (isCreated ? "ok" : "not ok"));

        System.out.println("4# Using UPDATE (update fruit)");
        fruitDao.findById(2L).ifPresent(new Consumer<Fruit>() {
            @Override
            public void accept(Fruit fruitToUpdate) {
                fruitToUpdate.setName(fruitToUpdate.getName() + "modified");
                boolean isUpdated = fruitDao.update(fruitToUpdate);
                System.out.println("Update : " + (isUpdated ? "ok" : "not ok"));
            }
        });

        System.out.println("5# Using DELETE (Delete fruit)");
        fruitDao.findById(2L).ifPresent(new Consumer<Fruit>() {
            @Override
            public void accept(Fruit fruitToDelete) {
                boolean isDeleted = fruitDao.delete(fruitToDelete);
                System.out.println("Deleted : " + (isDeleted ? "ok" : "not ok"));
            }
        });

        System.out.println("6# Closing connection object");
        ConnectionManager.close();
    }

}
