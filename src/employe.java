public class employe extends salarie{
    private double hsupp;
    private double phsupp;
    public employe(int matricule, String nom, int recrutement, double hsupp, double phsupp) {
        super(matricule, nom, recrutement);
        this.hsupp = hsupp;
        this.phsupp = phsupp;
    }

    public double getHsupp() {
        return hsupp;
    }

    public void setHsupp(double hsupp) {
        this.hsupp = hsupp;
    }

    public double getPhsupp() {
        return phsupp;
    }

    public void setPhsupp(double phsupp) {
        this.phsupp = phsupp;
    }

    @Override
    public String toString() {
        return "hsupp=" + hsupp +
                ", phsupp=" + phsupp +
                '}';
    }

    public void affiche(){;
        System.out.println(super.toString()+" "+toString());
    }
    public double salaire(){
        double x=super.salaire();
        return x+(this.hsupp*this.phsupp);
    }
}
