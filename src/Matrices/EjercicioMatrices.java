/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author DAM_T
 */
public class EjercicioMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int op;
        int[][] array = new int[5][5];
        int[][] array2 = new int[5][5];
        int[][] arrayRes = new int[5][5];
        do {
            op = menu(leer);
            switch (op) {
                case 1:
                    rellenarMatriz(array);
                    rellenarMatriz(array2);
                    break;
                case 2:
                    System.out.println("\n\tLa primera array es: ");
                    mostrarMatriz(array);
                    System.out.println("\n\tLa segunda array es: ");
                    mostrarMatriz(array2);
                    break;
                case 3:
                    if (iguales(array, array2)) {

                        System.out.println("Son Iguales");
                    } else {
                        System.out.println("No son Iguales");
                    }

                    break;
                case 4:
                    System.out.println("\n\t|" + aciertos(array, array2) + "|");
                    for (int i = 0; i < aciertos(array, array2); i++) {
                        System.out.print(" A ");

                    }
                    System.out.println(" ");

                    break;
                case 5:
                    sumarMatriz(array, array2, arrayRes);
                    mostrarMatriz(arrayRes);
                    break;
                case 6:
                    restarMatriz(array, array2, arrayRes);
                    mostrarMatriz(arrayRes);
                    break;
                case 7:
                    multiplicarMatriz(array, array2, arrayRes);
                    mostrarMatriz(arrayRes);
                    break;

                default:
            }

        } while (op != 0);

    }

    public static int menu(Scanner t) {
        System.out.println("\n\tMenu");
        System.out.println("----");
        System.out.println();
        System.out.println("1.- Rellenar Matriz");
        System.out.println("2.- Mostar Matriz");
        System.out.println("3.- Son iguales ?");
        System.out.println("4.- Cuantos aciertos tiene");
        System.out.println("5.- Sumar");
        System.out.println("6.- Restar");
        System.out.println("7.- Multiplicar");
        System.out.println();
        System.out.print("Introduzca opción: ");
        int op = Integer.parseInt(t.nextLine());
        return op;
    }

    public static void rellenarMatriz(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarMatriz(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" | " + arr[i][j] + " | ");
            }
        }
    }

    public static boolean iguales(int[][] arrays1, int[][] arrays2) {
        boolean iguales = true;
        /*Diseñar una función llamada iguales, que reciba como parámetros tres argumentos:
        dos arrays y un número n, siendo este n la dimensión de los arrays, y devuelva VERDADERO o FALSO, si son iguales o no ambos arrays.*/
        for (int i = 0; i < arrays2.length; i++) {
            for (int j = 0; j < arrays2.length; j++) {

                if (arrays1[i][j] != arrays2[i][j]) {
                    iguales = false;
                }
            }

        }
        return iguales;
    }

    public static int aciertos(int[][] arr1, int[][] arr2) {
        int c = 0;
        /*Diseñar una función llamada aciertos, que reciba como parámetros tres argumentos: 
            dos arrays y un número n, siendo este n la dimensión de los arrays, y devuelva tantas 'A' como aciertos tenga. Un acierto será que las casillas de la misma posición de ambos arrays son iguales.*/
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i][j] == arr2[i][j]) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void sumarMatriz(int[][] arr1, int[][] arr2, int[][] arrR) {
        for (int i = 0; i < arrR.length; i++) {
            for (int j = 0; j < arrR.length; j++) {
                arrR[i][j] = arr1[i][j] + arr2[i][j];
            }

        }
    }

    public static void restarMatriz(int[][] arr1, int[][] arr2, int[][] arrR) {
        for (int i = 0; i < arrR.length; i++) {
            for (int j = 0; j < arrR.length; j++) {
                arrR[i][j] = arr1[i][j] - arr2[i][j];
            }

        }
    }

    public static void multiplicarMatriz(int[][] arr1, int[][] arr2, int[][] arrR) {
        for (int i = 0; i < arrR.length; i++) {
            for (int j = 0; j < arrR.length; j++) {
                arrR[i][j] = arr1[i][j] * arr2[i][j];
            }

        }
    }
}
