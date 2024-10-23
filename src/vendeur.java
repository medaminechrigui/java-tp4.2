public class vendeur extends salarie{
    private double vente;
    private double pourcentage;

    public double getVente() {
        return vente;
    }

    public void setVente(double vente) {
        this.vente = vente;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public vendeur(int matricule, String nom, int recrutement, double vente, double pourcentage) {
        super(matricule, nom, recrutement);
        this.vente = vente;
        this.pourcentage = pourcentage;
    }

    @Override
    public String toString() {
        return "vente=" + vente +
                ", pourcentage=" + pourcentage +
                '}';
    }
    public void affiche(){
        System.out.println(super.toString()+" "+toString());
    }
    public double salaire(){
        double x=super.salaire();
        return x+this.pourcentage*this.vente;
    }
}
