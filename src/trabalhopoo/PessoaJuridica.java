/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author erlon
 */
public class PessoaJuridica extends Cliente{
 
 private String cnpj;

 public PessoaJuridica() {
 }

 public PessoaJuridica(String cnpj) {
  this.cnpj = cnpj;
 }

 public String getCnpj() {
  return cnpj;
 }

 public void setCnpj(String cnpj) {
  this.cnpj = cnpj;
 }
 
 
 
}
