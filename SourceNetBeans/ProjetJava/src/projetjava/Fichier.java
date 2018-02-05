package projetjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Fichier {

    protected ArrayList<Employe> toutlePers = new ArrayList <Employe>();
    protected ArrayList<String> touteslesComp = new ArrayList<String>();

    
    public void lectureComp() throws FileNotFoundException, IOException {
        //Lecture de la liste des compÈtences
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
                        /*System.out.println(mots3[i]);*/
                        touteslesComp.add(mots3[i]);
                        System.out.println(touteslesComp.toString());
                    }
                    System.out.println(" ");
                }
            }
        }
    }
    
    public void lectureEmp() throws FileNotFoundException, IOException {
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
                    System.out.println(mots2[3] + " " + mots2[0] + " " + mots2[1] + " " + mots2[2]);
                    System.out.println(" ");
                }
            }
        }
    }

    public void lectureEmpComp() throws FileNotFoundException, IOException {
        //Lecture du fichier reliant les employÈs aux compÈtences
        Scanner sc = new Scanner(System.in);
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
        }
    }
    
    public void addEmp (Employe e){
        this.toutlePers.add(e);
    }
    
}