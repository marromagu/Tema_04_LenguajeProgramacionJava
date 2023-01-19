/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vectores;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class EjerciciosFuncionesConVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int op;
        do {
            op = menu(leer);
            switch (op) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3(leer);
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                default:
            }

        } while (op != 0);

    }

    public static int menu(Scanner t) {
        System.out.println("\tMenu");
        System.out.println("----");
        System.out.println();
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3");
        System.out.println("4.- Ejercicio 4");
        System.out.println("5.- Ejercicio 5");
        System.out.println("6.- Ejercicio 6");
        System.out.println();
        System.out.print("Introduzca opción: ");
        int op = Integer.parseInt(t.nextLine());
        return op;
    }

    public static void ejercicio1() {
        /*Diseñar un algoritmo que pida 5 notas que se almacenaran en un array y calcule las notas máxima, mínima y media . 
        Para ello diseña las funciones: Rellenar(vector, tam) que no devuelve nada y las funciones Maximo(vector, tam), Minimo(vector, tam) y Media(vector, tam) que devolverán nota máxima, mínima y la media respectivamente.*/
        int[] notas = new int[5];
        rellenar(notas);
        mostrar(notas);
        System.out.println("El maximo es: " + maximo(notas));
        System.out.println("El minimo es: " + minimo(notas));
        System.out.println("La media es : " + media(notas));
    }

    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" | " + vector[i]);
        }
        System.out.println(" |");
    }

    public static void rellenar(int[] vector) {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Escribe un numero: ");
            vector[i] = Integer.parseInt(t.nextLine());

        }
    }

    public static int maximo(int[] v) {
        int max = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }

        }
        return max;
    }

    public static int minimo(int[] v) {
        int min = maximo(v);
        for (int i = 0; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }

        }
        return min;
    }

    public static float media(int[] v) {
        float med = 0;
        for (int i = 0; i < v.length; i++) {
            med = med + v[i];

        }
        med = med / v.length;

        return med;
    }

    public static void ejercicio2() {
        /*Diseñar un algoritmo que cree un vector de 20 elementos llamado pares, lo rellene con los 20 primeros números pares y muestre su contenido: crear las funciones Rellenar y Mostrar, correspondientes.*/
        int[] pares = new int[20];
        rellenarPares(pares);
        mostrar(pares);

    }

    public static void rellenarPares(int[] vector) {
        int par = 2;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = par;
            par += 2;

        }
    }

    public static void ejercicio3(Scanner t) {
        /*Diseñar un algoritmo que cree un vector de 100 elementos, almacene en él las tiradas de un dado (recuerda la función azar ( n ) ). Por último deberá mostrar cuantas veces ha aparecido cada punto del dado. Diseñar la función Tiradas que rellene el vector y la función ContarPunto(vector, punto, tam) que devolverá cuantas veces aparece en el vector el valor punto.*/
        int[] dado = new int[10];//Tamaño real es 100, para comprobar q funciona esta en 10 ;)
        rellenarRandom(dado, 6, 1);
        mostrar(dado);
        System.out.println("Dime un numero del 1 al 6");
        int num = Integer.parseInt(t.nextLine());
        System.out.println("Tienes " + contarPuntos(num, dado) + " puntos.");

    }

    public static void rellenarRandom(int[] v, int f, int p) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * f + p);

        }
    }

    public static int contarPuntos(int num, int[] v) {
        int puntos = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == num) {
                puntos++;
            }

        }
        return puntos;

    }

    public static void ejercicio4() {
        /*Diseñar un algoritmo que cree un vector de 100 elementos, almacene en él 100 notas generadas al azar (recuerda la función azar ( n ) ). Por último deberá mostrar cuantos aprobados y cuantos suspensos hay. Igual que el anterior con las funciones CuentaAprobados y CuentaSuspensos*/
        int[] notas = new int[100];
        rellenarRandom(notas, 11, 0);
        contarNotas(0, notas);// 0 es un numero q nos indicara en la funcion contarNotas si se activa la sengunda parte de la funcion o no, siendo 0 desactivada y 1 activada 

    }

    public static void contarNotas(int num, int[] v) {
        int aprobado = 0, suspenso = 0, bien = 0, suficientes = 0, notables = 0, sobresalientes = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] >= 5) {
                aprobado++;

                if (v[i] == 5) {
                    suficientes++;
                }
                if (v[i] == 6) {
                    bien++;
                }
                if (v[i] > 6 && v[i] < 10) {
                    notables++;
                }
                if (v[i] == 10) {
                    sobresalientes++;
                }

            } else {
                suspenso++;
            }

        }
        if (num == 0) {
            System.out.println("Suspensos : " + suspenso);
            System.out.println("Aprobados : " + aprobado);
        }
        if (num == 1) {
            System.out.println("Suspensos : " + suspenso);
            System.out.println("Suficientes : " + suficientes);
            System.out.println("Bien : " + bien);
            System.out.println("Notables : " + notables);
            System.out.println("Sobresalientes : " + sobresalientes);

        }

    }

    public static void ejercicio5() {
        /*Diseñar un algoritmo como el anterior que muestre cuantos suspensos, suficientes, bien, notables y sobresalientes hay. En este caso crearemos la función Rellenar del ejercicio anterior y una función MostrarNotas que mostrará cuantos suspensos, suficientes, bien, notables y sobresalientes hay.*/
        int[] nota = new int[100];
        rellenarRandom(nota, 11, 0);
        contarNotas(1, nota);// 0 es un numero q nos indicara en la funcion contarNotas si se activa la sengunda parte de la funcion o no, siendo 0 desactivada y 1 activada 

    }

    public static void ejercicio6() {
        /*Diseñar un algoritmo que cree un vector de 10 elementos, lo rellene con los 10 primeros números impares y muestre su contenido en orden inverso. Diseñar la correspondiente funcion RellenarImpar y MostrarAlReves*/
        int[] impar = new int[10];
        rellenarImpar(impar);
        mostrarAlReves(impar);
    }

    public static void rellenarImpar(int[] v) {
        int imp = 1;
        for (int i = 0; i < v.length; i++) {
            v[i] = imp;
            imp += 2;

        }
    }

    public static void mostrarAlReves(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" | " + vector[(vector.length - 1)-i]);
        }
        System.out.println(" |");
    }

}
