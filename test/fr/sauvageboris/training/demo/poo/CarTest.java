package fr.sauvageboris.training.demo.poo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void testEquals() {
        Car expected = new Car("ROUGE", "PEUGEOT", "208", 4);
        Car actual = new Car("ROUGE", "PEUGEOT", "208", 4);
        Assertions.assertTrue(expected.equals(actual));
    }

    @Test
    void testNotEquals() {
        Car expected = new Car("ROUGE", "PEUGEOT", "208", 4);
        Car actual = new Car("VERT", "PEUGEOT", "208", 4);
        Assertions.assertFalse(expected.equals(actual));
    }

    @Test
    void testNoAAtEquals() {
        Car expected = new Car("ROUGE", "PEUGEOT", "208", 4);
        Car actual = null;
        Assertions.assertTrue(expected.equals(actual));
    }
}
