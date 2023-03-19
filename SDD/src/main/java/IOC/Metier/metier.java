package IOC.Metier;

import IOC.DAO.IDAO;

public class metier implements IMetier {
    IDAO dao;
    @Override
    public double calcul() {
        double data = dao.getData();
        return data*10;
    }
    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
