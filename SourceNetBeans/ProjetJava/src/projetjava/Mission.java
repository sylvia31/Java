package projetjava;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Mission extends Projet implements AffecterEmploye, AjoutMission{

    private int idM;
    private static int id; //il faudrait pas l'initialiser à 0 ?
    private Date datedeb;
    private int duree;
    private int nbTotalPers;
    private ArrayList<Employe> employesMission = new ArrayList<Employe>();
    private ArrayList<Competence> competencesMission = new ArrayList<Competence>();
    private final HashMap<Integer,Mission> toutesLesMissions = new HashMap<Integer,Mission>();
    private enum statut {
        Planifiée, EnCours, EnPréparation, Terminée
    };
    private statut etatMission;
    
    //pourquoi c'est final ?
    private final HashMap<Integer,Mission> touteslesMissions = new HashMap<Integer, Mission>();

    //j'ai enlevé idM vu qu'on l'utilise pas
    public Mission(int idP, int duree, int nbTotalPers) {
        super(idP);
        this.duree = duree;
        this.nbTotalPers = nbTotalPers;
        //etatMission = statut.EnCours;
        this.idM = Mission.id++;
    }
    public Mission(){
        this.idM = Mission.id ++;
    }
    
    
    public void creerMission() throws Exception{
        try{
            Mission m = new Mission();
            this.toutesLesMissions.put(idM, m);
        }
        catch (Exception e){
            throw new Exception("La mission ne peut pas être créée");
        }
    public void enrgMission(Mission m){
        //if une nouvelle mission est créée
        this.touteslesMissions.put(idM, m);
    }
    
    }
    
    public void defEtatMission(Date d){
        Date dateFin = new Date(this.datedeb.getTime()+this.duree*24*60*1000);
        System.out.println(dateFin);
        dateFin.compareTo(d);
        if(dateFin.before(d))
            this.etatMission = statut.Terminée;
        else
            this.etatMission = statut.EnCours;
        
    public void programmerMission() {

    }
    
    

    /**
     * Affecter un employé à une mission
     *
     * @param e
     */
    public ArrayList affecter(ArrayList a, Employe e) {
        for (Employe emp : this.employesMission){
            if (!emp.equals(e))
                this.employesMission.add(e);
        }
        return a;
    }

    @Override
    public ArrayList affecter(Employe e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    /**
     * Supprimer un employé d'une mission, Prend en paramètre une liste
     * d'employés et l'employé à supprimer, Renvoie la nouvelle liste d'employés
     * de la mission
     */
    public ArrayList supprEmploye(ArrayList a, Employe e) {
        for (Employe emp : this.employesMission) {
            if (emp.equals(e)) {
                this.employesMission.remove(e);
            }
        }
        return a;
    }

    /**
     * Ajouter une compétence à une mission, Prend en paramètre une liste de
     * compétences et la compétence à ajouter, Renvoie la nouvelle liste de
     * compétences de la mission
     */
    public ArrayList addCompetence(ArrayList a, Competence c) {
        this.competencesMission.add(c);
        return a;
    }
}
