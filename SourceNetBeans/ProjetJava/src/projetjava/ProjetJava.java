package projetjava;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class ProjetJava {

    public static void main(String[] args) throws IOException, Exception {
        //Lecture fichiers
        /*Fichier comp = new Fichier();
        comp.lectureComp();
        System.out.println("");
        Fichier empl = new Fichier();
        empl.lectureEmpl();
        System.out.println("");
        Fichier attributions = new Fichier();
        attributions.lectureAtt();*/
        
        
        
        Mission m = new Mission();
        m.creerMission();
        
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        System.out.println(c.getTime());
        c.add(Calendar.DATE, 2);
        System.out.println(c.getTime());
    }

}
