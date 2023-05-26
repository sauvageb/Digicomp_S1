package fr.sauvageboris.training.jdbc.model;

import java.time.LocalDate;

public class Fruit {
    private Long id;
    private String name;
    private double price;
    private LocalDate bestBefore;

    public Fruit(Long id, String name, double price, LocalDate bestBefore) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.bestBefore = bestBefore;
    }

    public Fruit(String name, double price, LocalDate bestBefore) {
        this.name = name;
        this.price = price;
        this.bestBefore = bestBefore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bestBefore=" + bestBefore +
                '}';
    }
}
