/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vectores;

import java.util.Scanner;

/**
 *
 * @author DAM_T
 */
public class BusquedaOrdenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[20];
        int op;
        do {
            op = menu(leer);
            switch (op) {
                case 1:
                    rellenar(vector);
                    mostrar(vector);
                    break;
                case 2:
                    ordenar(vector);
                    mostrar(vector);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;

                default://No hacer nada
            }
        } while (op != 0);
    }

    public static int menu(Scanner t) {
        System.out.println("\tMenu");
        System.out.println("----");
        System.out.println();
        System.out.println("1.- Crear Nuevo Vector");
        System.out.println("2.- Ordena el Vector");
        System.out.println("3.- Búsqueda simple");
        System.out.println("4.- Búsqueda ordenada");
        System.out.println("5.- Búsqueda binaria");
        System.out.println("6.- Método de selección");
        System.out.println("7.- Método de la burbuja");
        System.out.println("8.- Inserción en orden y desplazamiento");
        System.out.println("9.- Borrado con desplazamiento");
        System.out.println();
        System.out.print("Introduzca opción: ");
        int op = Integer.parseInt(t.nextLine());
        return op;
    }

    public static void rellenar(int[] vectorR) {

        for (int i = 0; i < vectorR.length; i++) {
            vectorR[i] = (int) (Math.random() * 100);
        }
    }

    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" | " + vector[i]);
        }
        System.out.println(" |");
    }

    public static void ordenar(int[] v) {
        int aux;
        for (int i = 0; i < v.length; i++) {
            for (int j = (v.length - 1); j < i; j--) {
                if (v[j] < v[j - 1]) {
                    aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
    
    }

    public static int busquedaSimple(int[] v, int n) {
        //Recibe un vector y un numero q buscar, y debuelve la posicion.
        int i = 0, pos = -1;
        while (i < v.length && pos == -1) {
            if (v[i] == n) {
                pos = n;
            }
            i++;
        }
        return pos;
    }

    public static int busquedaOrdenada(int[] v, int n) {
        int i = 0, pos = -1;
        while ((i < v.length) && (pos == -1) && (v[i] <= n)) {
            if (v[i] == n) {
                pos = n;
            }
            i++;
        }
        return pos;
    }

}
