/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.util.Calendar;

/**
 *
 * @author Tamoor Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String cadenainvertida = "";
        
        for (int i = cadena.length() -1; i >= 0; i--) {
            cadenainvertida = cadenainvertida + cadena.charAt(i);
        }
        
        return cadenainvertida;
    }

    private boolean anytraspas(int any){
        
        return (any % 4 == 0 && (any % 100 != 0 || any % 400 == 0));
        
    }
    
    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        
        int resultat = 0;
        
        if (month >=1 && month <=12){
            
            if (month==4 || month==6 || month==9 || month==11 ){
                totalDiesMes = 30;
                
            } else if (month==2){
                totalDiesMes = 28;
                
                if (anytraspas()){
                    totalDiesMes=29;
                }
            }
            
        }else {
            System.out.println("Mes invalido!!!!!11");
        }
        
        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}
