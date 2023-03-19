package IOC.DAO;

public class DAONOSQL implements IDAO {
    @Override
    public double getData() {
        System.out.println("From No SQL DB");
        return (10);
    }
}