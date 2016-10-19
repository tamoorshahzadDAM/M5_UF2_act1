/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import static java.lang.Character.isDigit;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Tamoor Classe de funcions pròpies utils.
 */
public class MyUtils extends Exception {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String cadenainvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenainvertida = cadenainvertida + cadena.charAt(i);
        }

        return cadenainvertida;
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

        Calendar calendar = new GregorianCalendar();
        long diaactual = calendar.getTimeInMillis();
        long resultat = 0;

        if (year <= calendar.get(Calendar.YEAR)) {
            if (calendar.get(Calendar.YEAR) - year < 150) {
                if (month >= 1 && month <= 12) {

                    if (month == 4 || month == 6 || month == 9 || month == 11) {
                        if (day > 0 && day <= 30) {
                            Calendar calendar1 = new GregorianCalendar(year, month-1, day); 
                            long fechaNacimiento = calendar1.getTimeInMillis();
                            resultat = diaactual - fechaNacimiento;

                        } else {
                            return -2;
                        }

                    } else if (month == 2) {
                        if (day > 0 && day <= 28) {
                            Calendar calendar1 = new GregorianCalendar(year, month-1, day); 
                            long fechaNacimiento = calendar1.getTimeInMillis();
                            resultat = diaactual - fechaNacimiento;
                        } else {
                            return -2;
                        }

                    } else if (day > 0 && day <= 31) {
                            Calendar calendar1 = new GregorianCalendar(year, month-1, day); 
                        long fechaNacimiento = calendar1.getTimeInMillis();
                        resultat = diaactual - fechaNacimiento;
                    } else {
                        return -2;
                    }

                } else {
                    return -2;
                }
            } else {
               return -1;

            }
        } else {
            System.out.println("Any Invalido!!");
            System.exit(0);
        }
        long dies = 3600 * 24 * 1000;
        long resultado = resultat / dies;
        long resultatFinal = resultado / 365;
        return (int)resultatFinal;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(int numero) {

        
        if (numero == 0) {
            return 1;

        } else if (numero < 0 || numero > 999)  {
            return -1;

        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }

    }
    
}
