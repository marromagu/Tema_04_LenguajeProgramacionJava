/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjeciciosBucles;

import java.util.Scanner;

/**
 *
 * @author DAM_T
 */
public class Ejercicios_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int op;
        do {
            op = menu(teclado);
            switch (op) {
                case 1:
                    ejercicio1(teclado);
                    break;
                case 2:
                    ejercicio2(teclado);
                    break;
                case 3:
                    ejercicio3(teclado);
                    break;
                case 4:
                    ejercicio4(teclado);
                    break;
                case 5:
                    ejercicio5(teclado);
                    break;
                case 6:
                    ejercicio6(teclado);
                    break;
                case 7:
                    ejercicio7(teclado);
                    break;
                case 8:
                    ejercicio8(teclado);
                    break;
                default://Nada que hacer
            }
            if (op != 0) {
                System.out.println("\nPelse intro para continuar...");
                teclado.nextLine();
            } else {
                System.out.println("\nFin del programa.");
            }
        } while (op != 0);
    }

    public static int menu(Scanner a) {
        //Devuelve un entero
        //Scanner t es una llamada al Scanner teclado de la clase main para poder leer los numero por teclado
        System.out.println("Menu");
        System.out.println("----");
        System.out.println();
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3");
        System.out.println("4.- Ejercicio 4");
        System.out.println("5.- Ejercicio 5");
        System.out.println("6.- Ejercicio 6");
        System.out.println("7.- Ejercicio 7");
        System.out.println("8.- Ejercicio 8");
        System.out.println();
        System.out.print("Introduzca opción: ");
        int op = Integer.parseInt(a.nextLine());
        System.out.println();
        return op;
    }

    public static void ejercicio1(Scanner t) {
        // Vodi no devuelve nada
        /*Dado un número positivo por el usuario, mostrar todos los números que hay desde 0 hasta dicho número inclusive.*/
        System.out.println("Ejercicio 1");
        System.out.println("-----------");
        System.out.println();

        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(t.nextLine());
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ejercicio2(Scanner te) {
        /*Dado dos números positivos (el primero más pequeño que el segundo), mostrar todos los números que hay desde el primero hasta el segundo (ambos inclusive).*/
        System.out.println("Ejercicio 2");
        System.out.println("-----------");
        System.out.println();

        System.out.print("Introduzca un número pequeño: ");
        int pequeño = te.nextInt();
        System.out.print("Introduzca un número grande: ");
        int grande = te.nextInt();

        for (int i = pequeño; i <= grande; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void ejercicio3(Scanner tec) {
        /*Dados dos números positivos (el primero más pequeño que el segundo), mostrar la suma de todos los números desde el primero hasta el segundo (ambos inclusive).*/
        System.out.println("Ejercicio 3");
        System.out.println("-----------");
        System.out.println();
        System.out.print("Introduzca un número pequeño: ");
        int pequeño = tec.nextInt();
        System.out.print("Introduzca un número grande: ");
        int grande = tec.nextInt();
        int suma = 0;
        for (int i = pequeño; i <= grande; i++) {

            suma = suma + i;
        }
        System.out.println(suma);
    }

    public static void ejercicio4(Scanner tecl) {
        /*Dado dos números positivos (el primero más pequeño que el segundo), 
        mostrar todos los números, desde el primero hasta el segundo, que sean divisores de un número concreto (dado también por el usuario).*/
        System.out.println("Ejercicio 4");
        System.out.println("-----------");
        System.out.println();
        System.out.print("Introduzca un número pequeño: ");
        int pequeño = tecl.nextInt();
        System.out.print("Introduzca un número grande: ");
        int grande = tecl.nextInt();
        System.out.print("Introduzca un número : ");
        int dividendo = tecl.nextInt();

        for (int i = pequeño; i <= grande; i++) {
            if (i % dividendo == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

    }

    public static void ejercicio5(Scanner tecla) {
        /*Dados dos números positivos (el primero más pequeño que el segundo), 
        mostrar la suma de todos los números, desde el primero hasta el segundo, que sean divisores de un número concreto (dado también por el usuario).*/
        System.out.println("Ejercicio 5");
        System.out.println("-----------");
        System.out.println();
        System.out.print("Introduzca un número pequeño: ");
        int pequeño = tecla.nextInt();
        System.out.print("Introduzca un número grande: ");
        int grande = tecla.nextInt();
        System.out.print("Introduzca un número : ");
        int dividendo = tecla.nextInt();
        int suma = 0;
        for (int i = pequeño; i <= grande; i++) {
            if (i % dividendo == 0) {
                suma = suma + i;
            }
        }
        System.out.println(suma);
        System.out.println("");
    }

    public static void ejercicio6(Scanner teclad) {
        /*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.*/
        System.out.println("Ejercicio 6");
        System.out.println("-----------");
        System.out.println();
        int num = 1;
        do {
            System.out.print("Introduzca un número : ");
            num = teclad.nextInt();
            if (num > 0) {
                System.out.println("Es positivo");
                System.out.println("El proceso se repetirá hasta que se introduzca un 0.");
            }
            if (num < 0) {
                System.out.println("Es negativo");
                System.out.println("El proceso se repetirá hasta que se introduzca un 0.");
            }

        } while (num != 0);
    }

    public static void ejercicio7(Scanner teclado) {
        /*Pedir números hasta que se teclee uno negativo. Una vez ocurra esto, el algoritmo debe imprimir la suma de todos los números introducidos a excepción del número negativo.*/
        System.out.println("Ejercicio 7");
        System.out.println("-----------");
        System.out.println();
        int num = 0;
        int suma = 0;
        do {
            System.out.print("Introduzca un número : ");
            num = Integer.parseInt(teclado.nextLine());
            if (num > 0) {
                suma = suma + num;
            }

        } while (num > 0);
        System.out.println(suma);
    }

    public static void ejercicio8(Scanner t) {
        /*Realiza un juego para adivinar un número numSecreto (por ejemplo, entre 0 y 20). 
        El algoritmo debe ir pidiendo números al usuario indicando si es mayor o menor que numSecreto. El algoritmo acaba cuando el usuario acierta el número (Utilizar la función Math.random()).*/
        System.out.println("Ejercicio 8");
        System.out.println("-----------");
        System.out.println();
        int numSecreto = (int) (Math.random() * 20);
        int num = -1;
        do {
            System.out.println("Adivina el numero secreto");
            num = Integer.parseInt(t.nextLine());
        } while (num != numSecreto);
        System.out.println("¡¡¡¡BIEN!!!!");
    }
}
