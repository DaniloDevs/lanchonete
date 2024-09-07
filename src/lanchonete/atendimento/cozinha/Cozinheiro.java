package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

     public void adicionarLancheNoBalcao() {
          System.out.println("");
          System.out.println("Adicionando lanche escolhido no balcão!");
     }
     public void adicionarSucoNoBalcao() {
          System.out.println("");
          System.out.println("Adicionando suco no balcão!");
     }
     public void adicionarComboNoBalcao() {
          adicionarLancheNoBalcao();
          adicionarSucoNoBalcao();
     }
     
     private void preprararLanche() {
          System.out.println("Preparando lanche especial");
     }
     private void preprararVitamina() {
          System.out.println("Preparando a vitamina enigmatica");
     }
     private void preprararCombo() {
          preprararLanche();
          preprararVitamina();
     }
     
     private void selecionarIngredientesLanche() {
          System.out.println("Selecionando pães, carne, bacon, salada e queijo");
     }
     private void selecionarIngredientesVitamina() {
          System.out.println("Selecionando copo, frutas e gelo");
     }
     
     private void lavarIngredientes() {
          System.out.println("Lavando os ingredientes necessarios!");
     }
     private void baterVitaminaNoLiquidificador() {
          System.out.println("Adionando os ingredientes no liquidificador e batendo");
     }
     private void fritarIngredienteDoLanche() {
          System.out.println("Fazendo as frituras!");
     }
     
     private void pedirParaTrocarGas(Almoxarife meuAmigo) {
          meuAmigo.trocarGas();     
     }
     private void pediringredientes(Almoxarife almoxarife) {
          almoxarife.entregarIngredientes();
     }
}
D