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
        
        
//        Calendar calendar = Calendar.getInstance();
//        int resultat = 0;
//
//        if (year < Calendar.YEAR) {
//            if (month >= 1 && month <= 12) {
//
//                if (month == 4 || month == 6 || month == 9 || month == 11) {
//                    int totalDiesMes = 30;
//
//                } else if (month == 2) {
//                    int totalDiesMes = 28;
//
//                    if ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
//                        totalDiesMes = 29;
//                    }
//                }
//                
//                int difyear = calendar.get(Calendar.YEAR) - year;
//                int difmonth = calendar.get(Calendar.MONTH) - month;
//                int difday = calendar.get(Calendar.DAY_OF_MONTH) - day;
//
//            } else {
//                System.out.println("Mes invalido!!!!!");
//            }
//        } else {
//            System.out.println("Any Invalido!!");
//
//        }




//            Calendar calendar = Calendar.getInstance();
//           
//
//        
//        int difyear = calendar.get(Calendar.YEAR) - year;
//        int difmonth = calendar.get(Calendar.MONTH) - month;
//        int difday = calendar.get(Calendar.DAY_OF_MONTH) - day;
//
//        int anyseg = difyear.
//            
//        }
//        
//        if (difyear > 150) {
//            resultat = -1;
//
//        } else {
//            System.out.println("error");
//        }

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
