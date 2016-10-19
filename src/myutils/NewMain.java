/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.util.Calendar;
import java.util.Scanner;
import static myutils.MyUtils.factorial;

/**
 *
 * @author ALUMNEDAM
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
//        Scanner lector = new Scanner(System.in);
//        
//        System.out.println("Intrudeix una cadena. (todo seguido)");
//        String cadena = lector.next();
//        
//        System.out.println(MyUtils.inverteix(cadena));

        //Prueba de Calcular edad 
////        Scanner lector = new Scanner(System.in);
////        Calendar calendar = Calendar.getInstance();
////
////        System.out.println("Intrudeix la data de neixament: ");
////        boolean validardia = false;
////        try {
////
////            int dia = lector.nextInt();
////            validardia = true;
////
////        } catch (Exception ex) {
////            System.out.println("El nombre no es un enter!!");
////        }
////
////        System.out.println("Intrudeix la mes de neixament: ");
////
////        boolean validarmes = false;
////        while (!validarmes){
////            try {
////
////                int mes = lector.nextInt();
////                validarmes = true;
////
////            } catch (Exception ex) {
////                System.out.println("El nombre no es un enter!!");
////                System.out.println("Introdueix altra vegada.");
////            }
////        }
////        System.out.println("Intrudeix la any de neixament: ");
////
////        boolean validarany = false;
////        try {
////
////            int any = lector.nextInt();
////            validarany = true;
////
////        } catch (Exception ex) {
////            System.out.println("El nombre no es un enter!!");
////        }
//
 //      System.out.println(MyUtils.edat(01, 06, 1800));

        //Pruba de cacular factorial
       System.out.println(factorial(5));
    }

}
