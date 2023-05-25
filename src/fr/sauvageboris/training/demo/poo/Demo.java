package fr.sauvageboris.training.demo.poo;

public class Demo {

    public static void main(String... arguments) {
        System.out.println("Démo POO");

        Car car1 = new Car(arguments[0], arguments[1], arguments[2], 4);
        System.out.println(car1.color);
        System.out.println(car1.brand);
        System.out.println(car1.model);
    }
}
