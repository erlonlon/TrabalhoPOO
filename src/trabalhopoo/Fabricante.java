/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author erlon
 */
class Fabricante {
 
 private String cnpj;
 private String nome;
 private Aeronave aeronave;

 public Fabricante() {
 }

 public Aeronave getAeronave() {
  return aeronave;
 }

 public void setAeronave(Aeronave aeronave) {
  this.aeronave = aeronave;
 }

 public String getCnpj() {
  return cnpj;
 }

 public void setCnpj(String cnpj) {
  this.cnpj = cnpj;
 }

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }
 
 
 
}
