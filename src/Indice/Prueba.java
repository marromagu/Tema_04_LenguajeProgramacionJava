/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Indice;

/**
 *
 * @author DAM_T
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, num;
        num = 10;
        for (i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        i = 0;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= num);
        System.out.println("");
    }

}
