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
public class Representante  extends PessoaJuridica{
 
 private Date dataNascimento;
 private PessoaJuridica pJuridica;

 public Representante() {
 }

 public Representante(Date dataNascimento, PessoaJuridica pJuridica) {
  this.dataNascimento = dataNascimento;
  this.pJuridica = pJuridica;
 }

 public Date getDataNascimento() {
  return dataNascimento;
 }

 public void setDataNascimento(Date dataNascimento) {
  this.dataNascimento = dataNascimento;
 }

 public PessoaJuridica getpJuridica() {
  return pJuridica;
 }

 public void setpJuridica(PessoaJuridica pJuridica) {
  this.pJuridica = pJuridica;
 }
 
 
 
 
}
