/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 * Clase para pedir datos por teclado
 * @author jmrivera
 */
public class Entrada {
    /**
     * Lee una cadena desde teclado hasta que se pulsa intro
     * @return cadena leida
     */
    public static String leerTeclado(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    /**
     * Muestra un mensaje y
     * Lee una cadena desde teclado hasta que se pulsa intro
     * @param mensaje que se muestra
     * @return cadena leida
     */
    public static String leerTeclado(String mensaje){
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        return teclado.nextLine();
    }
    /**
     * Lee una cadena desde teclado hasta que se pulsa intro
     * @return cadena leida
     */
    public static String leerCadena(){
        return leerTeclado();
    }
    /**
     * Muestra un mensaje y
     * Lee una cadena desde teclado hasta que se pulsa intro
     * @param mensaje que se muestra
     * @return cadena leida
     */
    public static String leerCadena(String mensaje){
        return leerTeclado(mensaje);
    }

    /**
     * Lee un entero desde teclado
     * @return valor leido
     */
    public static int leerEntero(){
        int valor;
        boolean correcto = false;
        do{
            try{
                valor = Integer.parseInt(leerTeclado());
                correcto = true;
            }catch(NumberFormatException e){
                System.out.println("Error entrada: formato int");
                valor = 0;
            }
        }while(!correcto);
        return valor;
    }
    /**
     * Muestra un mensaje y
     * Lee un entero desde teclado
     * @param mensaje que se muestra
     * @return valor leido
     */
    public static int leerEntero(String mensaje){
        int valor;
        boolean correcto = false;
        do{
            try{
                valor = Integer.parseInt(leerTeclado(mensaje));
                correcto = true;
            }catch(NumberFormatException e){
                System.out.println("Error entrada: formato int");
                valor = 0;
            }
        }while(!correcto);
        return valor;
    }
    /**
     * Lee un double desde teclado
     * @return valor leido
     */
    public static double leerDouble(){
        double valor;
        boolean correcto = false;
        do{
            try{
                valor = Double.parseDouble(leerTeclado());
                correcto = true;
            }catch(NumberFormatException e){
                System.out.println("Error entrada: formato double");
                valor = 0;
            }
        }while(!correcto);
        return valor;
    }
    /**
     * Muestra un mensaje y
     * Lee un double desde teclado
     * @param mensaje que se muestra
     * @return valor leido
     */
    public static double leerDouble(String mensaje){
        double valor;
        boolean correcto = false;
        do{
            try{
                valor = Double.parseDouble(leerTeclado(mensaje));
                correcto = true;
            }catch(NumberFormatException e){
                System.out.println("Error entrada: formato double");
                valor = 0;
            }
        }while(!correcto);
        return valor;
    }
    /**
     * Lee un float desde teclado
     * @return valor leido
     */
    public static float leerFloat(){
        float valor;
        boolean correcto = false;
        do{
            try{
                valor = Float.parseFloat(leerTeclado());
                correcto = true;
            }catch(NumberFormatException e){
                System.out.println("Error entrada: formato float");
                valor = 0;
            }
        }while(!correcto);
        return valor;
    }
    /**
     * Muestra un mensaje y
     * Lee un float desde teclado
     * @param mensaje que se muestra
     * @return valor leido
     */
    public static float leerFloat(String mensaje){
        float valor;
        boolean correcto = false;
        do{
            try{
                valor = Float.parseFloat(leerTeclado(mensaje));
                correcto = true;
            }catch(NumberFormatException e){
                System.out.println("Error entrada: formato float");
                valor = 0;
            }
        }while(!correcto);
        return valor;
    }
    /**
     * Lee un caracter desde teclado
     * @return valor leido
     */
    public static char leerCaracter(){
        char valor;
        boolean correcto = false;
        do{
            try{
                valor = leerTeclado().charAt(0);
                correcto = true;
            }catch(Exception e){
                System.out.println("Error entrada: formato char");
                valor = 0;
            }
        }while(!correcto);
        return valor;
    }
    /**
     * Muestra un mensaje y
     * Lee un caracter desde teclado
     * @param mensaje que se muestra
     * @return valor leido
     */
    public static char leerCaracter(String mensaje){
        char valor;
        boolean correcto = false;
        do{
            try{
                valor = leerTeclado(mensaje).charAt(0);
                correcto = true;
            }catch(Exception e){
                System.out.println("Error entrada: formato char");
                valor = 0;
            }
        }while(!correcto);
        return valor;
    }


}
