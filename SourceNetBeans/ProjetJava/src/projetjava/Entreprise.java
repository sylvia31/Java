package projetjava;

import java.io.IOException;
import java.util.ArrayList;

public class Entreprise {

    private ArrayList<Competence> competences = new ArrayList<Competence>();
    private ArrayList<Employe> employes = new ArrayList<Employe>();
    
    //quoi comme constructeur ??
    //faudrait lier fichier et entreprise, mais comment ?
    public Entreprise(ArrayList<Employe> touslesEmp, ArrayList<Competence> touteslesComp){
        this.touteslesComp = touteslesComp;
        this.touslesEmp = touslesEmp;
    }
    
    public void addEmploye(Employe e){
        for(Employe emp : this.touslesEmp){
            if (!emp.equals(e))
                this.touslesEmp.add(e);
        }
    }
    
    public void supprEmploye(Employe e){
        for(Employe emp : this.touslesEmp){
            if (emp.equals(e))
                this.touslesEmp.remove(e);
        }
    }
    
    public void addCompetence(Competence c){
        for(Competence comp : this.touteslesComp){
            if (!comp.equals(c))
                this.touteslesComp.add(c);
        }
    }
    
    public void supprCompetence(Competence c){
        for(Competence comp : this.touteslesComp){
            if (comp.equals(c))
                this.touteslesComp.remove(c);
        }
    }
}
