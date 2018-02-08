package projetjava;

public class Projet {

    private int idP;
    private static int idPStatic;

    public Projet() {
        this.idP = Projet.idPStatic++;
    }
    protected String nomProj ;
    protected int nbMissions ;
    
    public Projet(int idP){
        this.idP = idP;
    }
    
    public Projet(String nomProj){
        this.nomProj = nomProj ;
        this.nbMissions = 0;
    }
    
    public void pgmerMission(){
        nbMissions ++ ;
        
    }
    
    
}
