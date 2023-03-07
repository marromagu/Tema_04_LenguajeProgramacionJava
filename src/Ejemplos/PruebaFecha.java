/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebafecha;

import Ejemplos.Fecha;
import java.util.Scanner;

/**
 *
 * @author JMRivera
 */
public class PruebaFecha {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    Fecha f1,f2;
    f1 = new Fecha();
    f2 = new Fecha(2,6,1965);
    System.out.println("Fecha1: " + f1.toString() + (f1.isValida()?" válida":" errónea"));
    System.out.println("Fecha2: " + f2.toString() + (f2.isValida()?" válida":" errónea"));
    System.out.println("Introduzca una fecha:");
    do{
      System.out.print("Día:");
      f1.setDia(Integer.parseInt(teclado.nextLine()));
      System.out.print("Mes:");
      f1.setMes(Integer.parseInt(teclado.nextLine()));
      System.out.print("Año:");
      f1.setAnnio(Integer.parseInt(teclado.nextLine()));
      System.out.println("Fecha1: " + f1.toString() + (f1.isValida()?" válida":" errónea"));
    }while(!f1.isValida());
  }
  
}
