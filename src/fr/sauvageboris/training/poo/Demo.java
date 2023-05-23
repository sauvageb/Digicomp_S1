package fr.sauvageboris.training.poo;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Démo POO");

        Car car1 = new Car(args[0], args[1], args[2], 4);
        System.out.println(car1.color);
        System.out.println(car1.brand);
        System.out.println(car1.model);
    }
}
