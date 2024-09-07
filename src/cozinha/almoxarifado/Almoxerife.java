package cozinha.almoxarifado;

import rh.Funcionario;

public class Almoxerife extends Funcionario{
     public Almoxerife(String name, Integer idade, String cargo) {
          super(name, idade, "Almoxerife");
     }

     // Controle
     private void controlarEntradaItem() {
          System.out.println("Controlando a entrada de itens na lanchonete");
     }
     private void controlarSaidaItem() {
          System.out.println("Controlando a sada de itens na lanchonete");
     }

     // Ação
     public void entregarIngredientes() {
          System.out.println("Entregando ingredientes pedidos!");
     }
     
     public void trocarGas() {
          System.out.println("Trocando o gas!");
     }
}
