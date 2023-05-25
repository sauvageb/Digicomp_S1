package fr.sauvageboris.training.demo.composition_vs_agregation;

public class Composition {

    public static void main(String[] args) {
        Client client = new Client("John Doe", 1234);
    }

    static class Client {
        private String nom;
        private Compte compte;

        public Client(String nom, int numeroCompte) {
            this.nom = nom;
            this.compte = new Compte(numeroCompte);
        }

        public void setCompte(Compte compte) {
            this.compte = compte;
        }
    }

    static class Compte {
        private int numero;

        public Compte(int numero) {
            this.numero = numero;
        }
    }
}
