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
public class TrabalhoPOO {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
  // TODO code application logic here
  
 
  PessoaFisica p = new PessoaFisica();
  p.setCpf("1010");
  p.setNome("Erlon");
  p.setEndereco("Rua A");
  p.setLogin("erlon");
  p.setSenha("123");
  
  System.out.println("Pessoa Fisica = " + p.getNome());
  
  
  Dependente d = new Dependente();
  d.setpFisica(p);
  d.setNome("Filha de papai");
d.setDataNascimento(new Date());
d.setSexo("Feminino");

System.out.println("Dependente : " + d.getNome() + " /  Responsavel : " +  p.getNome());


  
  
  
 }
}
