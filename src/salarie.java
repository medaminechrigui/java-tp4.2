public class salarie {
    protected int matricule;
    protected String nom;
    protected int recrutement;
    public salarie(int matricule, String nom, int recrutement) {
        this.matricule = matricule;
        this.nom = nom;
        this.recrutement = recrutement;
    }

    public int getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public int getRecrutement() {
        return recrutement;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRecrutement(int recrutement) {
        this.recrutement = recrutement;
    }
    @Override
    public String toString() {
        return "{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", recrutement=" + recrutement +
                '}';
    }
    public double salaire(){
        if (this.recrutement<2005){
            return 400;
        }
        else{
            return 280;
        }
    }
    public void affiche(){
        System.out.println(toString());
    }
}
