/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.Date;

/**
 *
 * @author erlon
 */
public abstract class Reserva implements InterfaceImprimir{
 
 private Date data;
 private String rota;

 public Reserva() {
 }
 
 public void cancelar(){
  
 }

 
 @Override
 public void imprimir() {
 System.out.println("imprimindo");
 }

 
 public Date getData() {
  return data;
 }

 public void setData(Date data) {
  this.data = data;
 }

 public String getRota() {
  return rota;
 }

 public void setRota(String rota) {
  this.rota = rota;
 }
 
 
 
}
