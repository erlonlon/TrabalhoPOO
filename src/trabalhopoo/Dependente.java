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
public class Dependente extends   PessoaFisica{
 
 
 private String sexo;
 private Date dataNascimento;
 private PessoaFisica pFisica;

 public Dependente() {
 }

 public Dependente(String sexo, Date dataNascimento) {
  this.sexo = sexo;
  this.dataNascimento = dataNascimento;
  
 }

 public PessoaFisica getpFisica() {
  return pFisica;
 }

 public void setpFisica(PessoaFisica pFisica) {
  this.pFisica = pFisica;
 }



 public Date getDataNascimento() {
  return dataNascimento;
 }

 public void setDataNascimento(Date dataNascimento) {
  this.dataNascimento = dataNascimento;
 }

 public String getSexo() {
  return sexo;
 }

 public void setSexo(String sexo) {
  this.sexo = sexo;
 }
 
 
 
}
