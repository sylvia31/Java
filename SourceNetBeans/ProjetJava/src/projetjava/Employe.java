/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Employe {

    protected int idE ;
    protected String nomEmp ;
    protected ArrayList <Competence> listeComp ;
    
    public Employe(int idE, String nomEmp){
        this.idE = idE ;
        this.nomEmp = nomEmp ;
    }
    
    public void ajoutComp(Competence c){
        this.listeComp.add(c) ;
    }
    
    public void supprComp(Competence c){
        this.listeComp.remove(c) ;
    }
    
    public String toString(){
        return this.nomEmp + " d'identifiant " + this.idE;
    }
}
