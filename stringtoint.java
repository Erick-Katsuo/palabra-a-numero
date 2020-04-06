/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtoint;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Katsuo
 */
public class Stringtoint {

    static final String NEGATIVO = "negativo";
    static final String CERO = "cero";
    static final String UNO = "uno";
    static final String DOS = "dos";
    static final String TRES = "tres";
    static final String CUATRO = "cuatro";
    static final String CINCO = "cinco";
    static final String SEIS = "seis";
    static final String SIETE = "siete";
    static final String OCHO = "ocho";
    static final String NUEVE = "nueve";

    static final String DIEZ = "diez";

    static final String ONCE = "once";
    static final String DOCE = "doce";
    static final String TRECE = "trece";
    static final String CATORCE = "catorce";
    static final String QUINCE = "quince";

    static final String VEINTE = "veinte";
    static final String TREINTA = "treinta";
    static final String CUARENTA = "cuarenta";
    static final String CINCUENTA = "cincuenta";
    static final String SESENTA = "sesenta";
    static final String SETENTA = "setenta";
    static final String OCHENTA = "ochenta";
    static final String NOVENTA = "noventa";

    static final int NUM_NEG = -1;

    static String palabra = "def";

    static int rangoDiezNov(String[] vectorPalabras, int pos) {
        int result = 0;
        switch (vectorPalabras[pos]) {
            case DIEZ:
                result = 10;
                break;
            case VEINTE:
                result = 20;
                break;
            case TREINTA:
                result = 30;
                break;
            case CUARENTA:
                result = 40;
                break;
            case CINCUENTA:
                result = 50;
                break;
            case SESENTA:
                result = 60;
                break;
            case SETENTA:
                result = 70;
                break;
            case OCHENTA:
                result = 80;
                break;
            case NOVENTA:
                result = 90;
        }
        return result;
    }

    static int rangoCeroNuev(String[] vectorPalabras, int pos) {
        int result = 0;
        switch (vectorPalabras[pos]) {
            case UNO:
                result = 1;
                break;
            case DOS:
                result = 2;
                break;
            case TRES:
                result = 3;
                break;
            case CUATRO:
                result = 4;
                break;
            case CINCO:
                result = 5;
                break;
            case SEIS:
                result = 6;
                break;
            case SIETE:
                result = 7;
                break;
            case OCHO:
                result = 8;
                break;
            case NUEVE:
                result = 9;
        }
        return result;
    }
    
    static int rangoOncQuin(String[] vectorPalabras, int pos) {
        int result = 0;
        switch (vectorPalabras[pos]) {
            case ONCE:
                result = 11;
                break;
            case DOCE:
                result = 12;
                break;
            case TRECE:
                result = 13;
                break;
            case CATORCE:
                result = 14;
                break;
            case QUINCE:
                result = 15;
        }
        return result;
    }

    public static void main(String[] args) {

        int posCero = 1;
        int posUno = -1;
        int posDos = -2;
        int casEsp = 0;

        Scanner entradaConsola = new Scanner(System.in);

        System.out.println("Ingrese un numero en texto");
        palabra = entradaConsola.nextLine();
        String[] vectorPalabras = palabra.split(" ");

        if (vectorPalabras[0].equals(NEGATIVO)) {
            posCero = NUM_NEG;
            if (vectorPalabras.length > 2) {
                posUno = rangoDiezNov(vectorPalabras, 1);
                posDos = rangoCeroNuev(vectorPalabras, 3);
            }else{
                // caso donde no existe Y
                
                if(vectorPalabras.length == 2){                    
                    posUno = rangoDiezNov(vectorPalabras, 1);
                    posDos = rangoCeroNuev(vectorPalabras, 1);
                    casEsp = rangoOncQuin(vectorPalabras, 1);
                }else{
                    posUno = rangoDiezNov(vectorPalabras, 1);
                    posDos = rangoCeroNuev(vectorPalabras, 2);
                }
            }
        } else {
            if (vectorPalabras.length > 1) {
                System.out.println("existe y");
                posUno = rangoDiezNov(vectorPalabras, 0);
                posDos = rangoCeroNuev(vectorPalabras, 2);
            }else{
                // caso donde no existe Y
                if(vectorPalabras.length == 1){                    
                    posUno = rangoDiezNov(vectorPalabras, 0);
                    posDos = rangoCeroNuev(vectorPalabras, 0);
                    casEsp = rangoOncQuin(vectorPalabras, 0);
                }else{
                    posUno = rangoDiezNov(vectorPalabras, 0);
                    posDos = rangoCeroNuev(vectorPalabras, 1); 
                }
            }
        }

        System.out.println(posCero + " " + posUno + " " + posDos + " " + casEsp);
        System.out.println(posCero * (posUno + posDos + casEsp));
    }
}
