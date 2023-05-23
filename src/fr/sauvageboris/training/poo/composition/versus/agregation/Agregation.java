package fr.sauvageboris.training.poo.composition.versus.agregation;


public class Agregation {

    public static void main(String[] args) {
        Compte compte = new Compte(1234);
        Client client = new Client("John Doe");
        client.setCompte(compte);
    }

    static class Client {
        private String nom;
        private Compte compte;

        public Client(String nom) {
            this.nom = nom;
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


