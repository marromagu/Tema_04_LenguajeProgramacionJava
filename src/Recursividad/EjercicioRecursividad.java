/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursividad;

/**
 *
 * @author DAM_T
 */
public class EjercicioRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /*Crear una función  recursiva que calcule el MCD de dos número por el método de Euclides. El método de Euclides es el siguiente:
Se divide el número mayor entre el menor.
Si la división es exacta, el divisor es el MCD.
Si la división no es exacta, dividimos el divisor entre el resto obtenido y se continúa de esta forma hasta obtener una división exacta, siendo el último divisor el MCD.
Crea un programa principal que lea dos números enteros y muestre el MCD.*/
    public static int recursivaMCD(int ma, int me) {
        int mcd = 0;

        if (ma % me == 0) {
            mcd = me;
        } else {
            mcd = recursivaMCD(ma, ma % me);
        }
        return mcd;
    }

    //Realizar un algoritmo que calcule a^b de forma recursiva.
    public static int recursivaAB(int a, int b) {
        int c = 0;
        if (b == 0) {
            c = 1;
        } else {
            c = recursivaAB(a, b - 1);
        }
        return c;
    }

    //Escribir una función recursiva que imprima por pantalla todos los nº desde un nº introducido por teclado hasta 1
    public static void recursivaLista(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.print(n + " ");
            recursivaLista(n - 1);

        }
    }

    //Realizar un programa que utilice una función recursiva para recorrer un vector. Deberá utilizar también otra función recursiva para rellenar dicho vector.
    public static void recursivaVectorR(int[] v,int i) {
        if (v.length > 0) {
            v[v.length - i] = (int)(Math.random()*10);
          
            recursivaVectorR(v,i-1);
            
        }

    }
    public static void recursivaVectorM(int[] v,int i) {
        if (v.length > 0) {          
            recursivaVectorM(v,i-1);
            
            System.out.println(v[v.length-i]);
        }

    }
    //Escribir una función recursiva que ordene de menor a mayor un vector de enteros basándose en la siguiente idea: coloque el elemento mayor en la última posición, y luego ordene el resto del vector con una llamada recursiva.
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
    public static void recursivaOrdena(int v[]) {
        int i, j, aux;
        
    }
}
