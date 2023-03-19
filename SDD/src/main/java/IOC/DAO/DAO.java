package IOC.DAO;

public class DAO implements IDAO{
    @Override
    public double getData() {
        System.out.println("From SQL DB");
        return (7);

    }
}
