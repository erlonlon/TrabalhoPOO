 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author erlon
 */
public class Voo extends Cliente{
 

 private int codigo;
 private String origem;
 private String destino;
  private Aeronave aeronave;
  
  private Trecho trecho;

 public Voo() {
 }
 
 public int calculaDistancia(int dist){
  
  return dist;
 } 
 
 public void calculaDistancia(){
  
 }

 public Aeronave getAeronave() {
  return aeronave;
 }

 public void setAeronave(Aeronave aeronave) {
  this.aeronave = aeronave;
 }

 public int getCodigo() {
  return codigo;
 }

 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }

 public String getDestino() {
  return destino;
 }

 public void setDestino(String destino) {
  this.destino = destino;
 }

 public String getOrigem() {
  return origem;
 }

 public void setOrigem(String origem) {
  this.origem = origem;
 }

 public Trecho getTrecho() {
  return trecho;
 }

 public void setTrecho(Trecho trecho) {
  this.trecho = trecho;
 }
  
  
 
 
}
