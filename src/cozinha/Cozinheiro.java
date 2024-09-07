package cozinha;

import cozinha.almoxarifado.Almoxerife;
import rh.Funcionario;

public class Cozinheiro extends Funcionario {
     public Cozinheiro(String name, Integer idade, String cargo) {
          super(name, idade, "Cozinheiro");
     }

     // Preparação
     public void selecionarIngredientesLanche() {
          System.out.println("Selecionando pães, carne, bacon, salada e queijo");
     }

     public void selecionarIngredientesVitamina() {
          System.out.println("Selecionando copo, frutas e gelo");
     }

     public void lavarIngredientes() {
          System.out.println("Lavando os ingredientes necessarios!");
     }

     // Ação
     private void preprararLanche() {
          System.out.println("Preparando lanche especial");
     }

     private void preprararVitamina() {
          System.out.println("Preparando a vitamina enigmatica");
     }

     public void preprararCombo() {
          preprararLanche();
          preprararVitamina();
     }

     private void baterVitaminaNoLiquidificador() {
          System.out.println("Adionando os ingredientes no liquidificador e batendo");
     }

     private void fritarIngredienteDoLanche() {
          System.out.println("Fazendo as frituras!");
     }

     // Entrega
     public void adicionarLancheNoBalcao() {
          System.out.println("Adicionando lanche escolhido no balcão!");
     }

     public void adicionarSucoNoBalcao() {
          System.out.println("Adicionando suco no balcão!");
     }

     public void adicionarComboNoBalcao() {
          adicionarLancheNoBalcao();
          adicionarSucoNoBalcao();
     }

     // Extras
     private void pedirParaTrocarGas(Almoxerife meuAmigo) {
          meuAmigo.trocarGas();
     }

     private void pediringredientes(Almoxerife almoxarife) {
          almoxarife.entregarIngredientes();
     }
}
