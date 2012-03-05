/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author erlon
 */
public class Aeronave {
 
 private int codigo;
 private String descricao;
 private String modelo;
 private int capacidade;
 private Fabricante fabricante;

 public Aeronave() {
 }

 public int getCapacidade() {
  return capacidade;
 }

 public void setCapacidade(int capacidade) {
  this.capacidade = capacidade;
 }

 public int getCodigo() {
  return codigo;
 }

 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }

 public String getDescricao() {
  return descricao;
 }

 public void setDescricao(String descricao) {
  this.descricao = descricao;
 }

 public String getModelo() {
  return modelo;
 }

 public void setModelo(String modelo) {
  this.modelo = modelo;
 }
 
 
 
}
