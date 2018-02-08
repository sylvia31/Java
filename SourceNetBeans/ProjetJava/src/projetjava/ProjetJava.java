package projetjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Competence> touteslesComp = new ArrayList<Competence>();
        ArrayList<Employe> touslesEmp = new ArrayList<Employe>();
        //ArrayList< //troisième fichier ??

        //Lecture du fichier reliant les employés aux compétences
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Donner le chemin d'accès du fichier reliant les employés aux compétences :"); //C:\\Users\\USER\\Documents\\L3 MIAGE\\Semestre 2\\AOC\\ProjetJava\\fichiers\\competences_personnel.csv
        String chemin = sc.nextLine();

        BufferedReader entree = new BufferedReader(new FileReader(chemin));
        String s;
        StringTokenizer st;

        entree.readLine();
        while ((s = entree.readLine()) != null) {
            if (!entree.equals(" ")) {
                st = new StringTokenizer(s, "");
                while (st.hasMoreTokens()) {
                    String mot = st.nextToken();
                    String[] mots = s.split(";", 2);
                    for (int i = 0; i < mots.length; i++) {
                        System.out.println(mots[i]);
                    }
                    System.out.println(" ");
                }
            }
        }*/


        //Lecture de la liste du personnel
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Donner le chemin d'accès du fichier contenant la liste du personnel :"); //C:\\Users\\USER\\Documents\\L3 MIAGE\\Semestre 2\\AOC\\ProjetJava\\fichiers\\liste_personnel.csv
        String chemin2 = sc2.nextLine();

        BufferedReader entree2 = new BufferedReader(new FileReader(chemin2));
        String s2;
        StringTokenizer st2;

        entree2.readLine();
        while ((s2 = entree2.readLine()) != null) {
            if (!entree2.equals(" ")) {
                st2 = new StringTokenizer(s2, "");
                while (st2.hasMoreTokens()) {
                    String mot2 = st2.nextToken();
                    String[] mots2 = s2.split(";");
                    touslesEmp.add(new Employe(Integer.parseInt(mots2[3]), mots2[1]));
                    System.out.println(mots2[3] + " " + mots2[0] + " " + mots2[1] + " " + mots2[2]);
                    System.out.println(" ");
                }
            }
        }
        //System.out.println(touslesEmp.toString());
        

        /*//Lecture de la liste des compétences
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Donner le chemin d'accès du fichier contenant la liste des compétences :"); //C:\\Users\\USER\\Documents\\L3 MIAGE\\Semestre 2\\AOC\\ProjetJava\\fichiers\\liste_competences.csv
        String chemin3 = sc3.nextLine();

        BufferedReader entree3 = new BufferedReader(new FileReader(chemin3));
        String s3;
        StringTokenizer st3;

        entree3.readLine();
        while ((s3 = entree3.readLine()) != null) {
            if (!entree3.equals(" ")) {
                st3 = new StringTokenizer(s3, "");
                while (st3.hasMoreTokens()) {
                    String mot3 = st3.nextToken();
                    String[] mots3 = s3.split(";");
                    for (int i = 0; i < mots3.length; i++) {
                        System.out.println(mots3[i]);
                    }
                    touteslesComp.add(new Competence(mots3[0], mots3[1], mots3[2]));
                    System.out.println(" ");
                }
            }
        }*/
        
        Mission m = new Mission();
        m.creerMission();
        Employe e1 = new Employe(51, "Sylvia");
        Entreprise ent = new Entreprise(touslesEmp, touteslesComp);
        
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        System.out.println(c.getTime());
        c.add(Calendar.DATE, 2);
        System.out.println(c.getTime());
        ent.addEmploye(e1);
        System.out.println(touslesEmp.toString());
        /*touslesEmp.remove(e1);
        System.out.println(touslesEmp.toString());*/
    }

}
