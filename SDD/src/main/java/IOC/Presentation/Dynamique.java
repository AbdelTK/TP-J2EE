package IOC.Presentation;

import IOC.DAO.IDAO;
import IOC.Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Dynamique {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(new File("src/IOC/Config.txt"));
        String dao = sc.nextLine();
        Class clsDao = Class.forName(dao);
        IDAO objDao = (IDAO) clsDao.newInstance();

        String metier = sc.nextLine();
        Class clsMetier = Class.forName(metier);
        IMetier objMetier = (IMetier) clsMetier.newInstance();

        Method method = clsMetier.getMethod("setDao", IDAO.class);
        method.invoke(objMetier, objDao);

        System.out.println(objMetier.calcul());
    }
}
