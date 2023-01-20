/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

import Ejemplos.Entrada;

/**
 *
 * @author jmrivera
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas = new int[10];
        rellenar(notas);
        mostrar(notas);
        System.out.println("La media es "+media(notas));
    }

    public static void rellenar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Entrada.leerEntero("Introduzca la nota " + (i + 1) + ":");
        }
    }

    public static void mostrar(int[] vector) {
        System.out.println("El contenido es:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

    public static float media(int[] vector) {
        float suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma / vector.length;
    }
}
