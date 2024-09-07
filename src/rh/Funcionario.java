package rh;

public class Funcionario {
     String name;
     Integer idade;
     String cargo;

     public Funcionario(String name, Integer idade, String cargo) {
          this.name = name;
          this.idade = idade;
          this.cargo = cargo;
     }

     public String getName() {
          return name;
     }

     public Integer getIdade() {
          return idade;
     }

     public String getCargo() {
          return cargo;
     }
}
