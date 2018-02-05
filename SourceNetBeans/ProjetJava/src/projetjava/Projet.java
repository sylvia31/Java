package projetjava;

public class Projet {

    private int idP;
    private static int idPStatic;

    public Projet() {
        this.idP = Projet.idPStatic++;
    }
    
    public Projet(int idP){
        this.idP=idP;
    }
}
