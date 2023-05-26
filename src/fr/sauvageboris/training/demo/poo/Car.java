package fr.sauvageboris.training.demo.poo;

import java.util.Objects;

public class Car {
    // Attributs
    String color;
    String brand;
    String model;
    int nbWheels;

    public Car(String color, String brand, String model, int nbWheels) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.nbWheels = nbWheels;
    }

    @Override
    public boolean equals(Object objectCompared) {
        if (this == objectCompared) return true;
        if (objectCompared == null || this.getClass() != objectCompared.getClass()) return false;
        Car car = (Car) objectCompared;
        return nbWheels == car.nbWheels && Objects.equals(color, car.color) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, model, nbWheels);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", nbWheels=" + nbWheels +
                '}';
    }
}
