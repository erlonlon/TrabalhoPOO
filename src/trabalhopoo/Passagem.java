/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author erlon
 */
public class Passagem  extends Reserva{
 
 private int poltrona;
 private Double preco;
 private String classe;

 public Passagem() {
 }

 public String getClasse() {
  return classe;
 }

 public void setClasse(String classe) {
  this.classe = classe;
 }

 public int getPoltrona() {
  return poltrona;
 }

 public void setPoltrona(int poltrona) {
  this.poltrona = poltrona;
 }

 public Double getPreco() {
  return preco;
 }

 public void setPreco(Double preco) {
  this.preco = preco;
 }
 
         
public void tranferir(){
 
 System.out.println("Traferindo ");
 
}
 @Override
 public void imprimir() {
 System.out.println("Imprimindo");
 }
 
 
 
}
