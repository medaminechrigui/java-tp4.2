public class entreprise {
    public static void main(String[] args) {
        salarie tabsalarie[] = new salarie[5];
        tabsalarie[0] = new employe(12345, "Walid", 2002, 15, 4);
        tabsalarie[1] = new vendeur(23445, "Yessine", 2007, 1000, 0.1);
        tabsalarie[2] = new vendeur(65478, "Nassime", 2000, 700, 0.1);
        tabsalarie[3] = new employe(87698, "Aymen ", 2003, 19, 5);
        tabsalarie[4] = new employe(12345, "Khaled", 2008, 7, 4);
        System.out.println("**************liste des employes************");
        for (int i = 0; i < tabsalarie.length; i++) {
            if (tabsalarie[i] instanceof employe) {
                ((employe) tabsalarie[i]).affiche();
        }
    }
        System.out.println("**************liste des vendeurs************");
        for (int i = 0; i < tabsalarie.length; i++) {
            if (tabsalarie[i] instanceof vendeur) {
                ((vendeur) tabsalarie[i]).affiche();
            }
        }
        int x=0;
        for (int i = 1; i < tabsalarie.length; i++) {
            if (tabsalarie[i].recrutement<tabsalarie[x].recrutement){
                x=i;
            }
        }
        System.out.println("**************plus ancien************");
        System.out.println("nom :"+tabsalarie[x].nom+" recrute en "+tabsalarie[x].recrutement);
        salarie maxv=null;
        for(int i=0;i<tabsalarie.length;i++){
            if (tabsalarie[i] instanceof vendeur){
            if (maxv==null){
                maxv=tabsalarie[i];
            } else if (tabsalarie[i].salaire()> maxv.salaire()){
                maxv=tabsalarie[i];
            }
        }}
        System.out.println("**************vender plus grands salaire************");
        System.out.println("num :"+maxv.matricule+" avec une salaire "+maxv.salaire());

    }}
