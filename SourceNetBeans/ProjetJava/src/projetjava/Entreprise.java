package projetjava;

import java.io.IOException;
import java.util.ArrayList;

public class Entreprise {

    private ArrayList<Competence> competences = new ArrayList<Competence>();
    private ArrayList<Employe> employes = new ArrayList<Employe>();
    
    public void addEmploye(Employe e) throws IOException{
        Fichier fich = new Fichier();
        fich.lectureEmp();
        
        System.out.println(this.employes.toString());
    }
   
    
}
