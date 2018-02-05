package projetjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Competence {

    private String idC;
    private String compFR;
    private String compANG;

    public Competence(String idC, String compFR, String compANG) {
        this.idC = idC;
        this.compANG = compANG;
        this.compFR = compFR;
    }

}
