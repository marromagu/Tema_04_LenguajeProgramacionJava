/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author JMRivera
 */
public class Fecha {
  private int dia;
  private int mes;
  private int annio;
  private boolean valida;

  public Fecha(int dia, int mes, int annio) {
    this.dia = dia;
    this.mes = mes;
    this.annio = annio;
    setValida();
  }

  public Fecha() {
    this.dia = 1;
    this.mes = 1;
    this.annio = 2000;
    this.valida = true;
  }

  @Override
  public String toString() {
    return dia + "/" + mes + "/" + annio;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
    setValida();
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
    setValida();
  }

  public int getAnnio() {
    return annio;
  }

  public void setAnnio(int annio) {
    this.annio = annio;
    setValida();
  }

  public boolean isValida() {
    return valida;
  }

  public void setValida() {
    boolean auxiliar;
    auxiliar = (dia >= 1 && dia <=12) && (mes >= 1 && mes <=31) && (annio >0);
    this.valida = auxiliar;
  }
  
  
}
