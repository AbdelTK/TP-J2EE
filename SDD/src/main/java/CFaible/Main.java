package CFaible;

import CFaible.Car;
import CFaible.Moteur;


public class Main {
    public static void main(String[] args) {
        Car v = new Car();
        v.setMoteur(new Moteur());
        v.rouler();
        System.out.println("Bon Voyage !");
    }
}