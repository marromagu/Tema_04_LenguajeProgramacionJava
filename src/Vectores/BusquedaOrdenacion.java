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
        int op, n, posicion;
        do {
            op = menu(leer);
            switch (op) {
                case 1:
                    rellenar(vector);
                    System.out.println("\nVector creado... \n");
                    break;
                case 2:
                    mostrar(vector);
                    break;
                case 3:
                    System.out.println("¿Que numero quieres buscar?");
                    n = Integer.parseInt(leer.nextLine());
                    System.out.println("Esta en la posicion: " + busquedaSimple(vector, n));
                    break;
                case 4:
                    ordenar(vector);
                    System.out.println("¿Que numero quieres buscar?");
                    n = Integer.parseInt(leer.nextLine());
                    System.out.println("Esta en la posicion: " + busquedaOrdenada(vector, n));
                    break;
                case 5:
                    ordenar(vector);
                    System.out.println("¿Que numero quieres buscar?");
                    n = Integer.parseInt(leer.nextLine());
                    System.out.println("Esta en la posicion: " + busquedaBinaria(vector, n));
                    break;
                case 6:
                    ordenaSelecccion(vector);
                    System.out.println("\nAlgoritmo de ordenacion por seleccion...");
                    break;
                case 7:
                    ordenaBurbuja(vector);
                    System.out.println("\nAlgoritmo de ordenacion de la burbuja");
                    break;
                case 8:
                    ordenar(vector);
                    System.out.println("¿Que numero deseas insertar?");
                    n = Integer.parseInt(leer.nextLine());
                     posicion = busquedaBinaria(vector, n);
                    // No existe en el array el valor a insertar
                    if (posicion == -1) {
                        // Si hay hueco para el valor a insertar: no es mayor que el último
                        if (vector.length > n) {
                            posicion = busquedaHueco(vector, n);
                            desplazarDerecha(vector, n);
                            vector[posicion] = n;
                        } 
                    }
                    break;
                case 9:
                    ordenar(vector);
                    System.out.println("¿Que numero deseas eliminar?");
                    n = Integer.parseInt(leer.nextLine());
                     posicion = busquedaBinaria(vector, n);
                     // Muestra la posición si es distinta de "-1"
                     if (posicion != -1) {
                        desplazarIzquierda(vector,n);
                    }else{
                         System.out.println("No existe el elemento a borrar.");
                     }
                    break;

                default://No hacer nada
            }
        } while (op != 0);
    }

    public static int menu(Scanner t) {
        System.out.println("\n\tMenu");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("1.- Crear Nuevo Vector");
        System.out.println("2.- Ver el Vector");
        System.out.println("3.- Búsqueda simple");
        System.out.println("4.- Búsqueda ordenada");
        System.out.println("5.- Búsqueda binaria");
        System.out.println("6.- Metodo de seleccion");
        System.out.println("7.- Metodo de la burbuja");
        System.out.println("8.- Insercion en orden y desplazamiento");
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
        for (int i = 0; i < 5 * (vector.length); i++) {
            System.out.print("-");

        }
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" | " + vector[i]);
        }
        System.out.println(" |");
        for (int i = 0; i < 5 * (vector.length); i++) {
            System.out.print("-");

        }
        System.out.println("");
    }

    public static void ordenar(int[] v) {
        int aux;
        for (int i = 0; i < v.length; i++) {
            for (int j = (v.length - 1); j > i; j--) {
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
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public static int busquedaOrdenada(int[] v, int n) {
        int i = 0, pos = -1;
        while ((i < v.length) && (pos == -1) && (v[i] <= n)) {
            if (v[i] == n) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public static int busquedaBinaria(int[] v, int n) {
        int izq, der, centro = 0;
        boolean encontrado;
        izq = 0;
        der = v.length - 1;
        encontrado = false;
        while ((izq <= der) && (!encontrado)) {
            centro = (izq + der) / 2;
            if (v[centro] == n) {
                encontrado = true; // Verdadero
            } else if (n > v[centro]) {
                izq = centro + 1;
            } else {
                der = centro - 1;
            }
        }
        if (!encontrado) {
            centro = -1; // No lo ha encontrado, posición "ficticia".
        }
        return centro;
    }

    public static void ordenaSelecccion(int[] v) {
        int menor;
        int aux; // Variable para intercambio.
        for (int i = 0; i < v.length; i++) {
            menor = i; // Se calcula el menor elemento a partir de i.
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
// Se intercambia el elemento i con el elemento menor.
            aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
        }
    }

    public static void ordenaBurbuja(int v[]) {
        int i, j, aux;
        for (i = 0; i < v.length; i++) {
            for (j = v.length - 1; j > i; j--) {
                if (v[j] < v[j - 1]) {
                    aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
    }

    public static void desplazarDerecha(int[] v, int pos) {
        // Función que desplaza a la derecha el contenido de un array
        // a partir de la posición "pos"
        for (int i = (v.length - 1); i < (pos + 1); i--) {
            v[i] = v[i - 1];
        }
    }

    public static void desplazarIzquierda(int[] v, int pos) {
        // Función que desplaza a la izquierda el contenido de un array
        // hasta la posición "pos"
        for (int i = pos; i < (v.length - 1); i++) {
            v[i] = v[i + 1];
        }
    }

    public static int busquedaHueco(int[] v, int n) {
        // Función que busca el hueco donde insertar el valor "n"
        int i = 0, pos = 0;
        while (i < v.length && v[i] < n) {
            i++;
        }
        if (i < v.length) {
            pos = i;
        } else {
            pos = -1;
        }
        return pos;
    }
}
