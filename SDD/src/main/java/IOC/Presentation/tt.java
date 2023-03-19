package IOC.Presentation;

import IOC.DAO.DAO;
import IOC.DAO.DAONOSQL;
import IOC.Metier.metier;

public class tt {
    public static void main(String[] args) {
        metier metier = new metier();
        DAONOSQL nosql = new DAONOSQL();
        //metier.setDao(sql);
        metier.setDao(nosql);
        double resultat = metier.calcul();
        System.out.println("Resultat est = " + resultat);
    }
}
