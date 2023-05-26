package fr.sauvageboris.training.demo.poo;

public class Demo {

    public static void main(String... arguments) {
        System.out.println("Démo POO");

        Car car1 = new Car("Red", "Peugeot", "208", 4);
        Car car2 = new Car("Red", "Peugeot", "208", 4);
        System.out.println(car1.color);
        System.out.println(car1.brand);
        System.out.println(car1.model);

        System.out.println(car1.equals(car2));



    }
}
