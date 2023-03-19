package CFaible;

public class Car implements ICar{
    private IENGINE Moteur;

    @Override
    public void rouler() {
        Moteur.demarrer();
        System.out.println("La voiture roule correctement");
    }
    public void setMoteur(IENGINE m) {
        this.Moteur = m;
    }
}
