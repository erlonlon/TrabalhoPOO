/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author erlon
 */
public abstract class Cliente {
 
 private String nome;
 private String endereco;
 private String login;
 private String senha;

 public Cliente() {
 }

 public Cliente(String nome, String endereco, String login, String senha) {
  this.nome = nome;
  this.endereco = endereco;
  this.login = login;
  this.senha = senha;
 }

 public String getEndereco() {
  return endereco;
 }

 public void setEndereco(String endereco) {
  this.endereco = endereco;
 }

 public String getLogin() {
  return login;
 }

 public void setLogin(String login) {
  this.login = login;
 }

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public String getSenha() {
  return senha;
 }

 public void setSenha(String senha) {
  this.senha = senha;
 }
 
 
 
}
