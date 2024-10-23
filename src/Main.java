public class Main {
    public static void main(String[] args) {
        employe w=new employe(12345,"Walid",2002,15,4);
        vendeur y=new vendeur(23445,"Yessine",2007,1000,0.1);
        w.affiche();
        y.affiche();
        System.out.println(w.salaire());
        System.out.println(w.salaire());
    }
}