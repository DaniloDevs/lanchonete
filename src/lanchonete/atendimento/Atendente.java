package lanchonete.atendimento;

public class Atendente {

     public void servindoMesa() {
          pegarLancheCozinha();
          System.out.println("Servindo mesa");
     }
     private void pegarLancheCozinha() {
          System.out.println("Pegando lanche na cozinha");
     }
     public void receberPagamento() {
          System.out.println("Recebendo pagamento do cliente");
     }
     void trocarGas() {
          System.out.println("Trocando gas da cozinha");
     }
     private void pegarPedidoBalcao() {
          System.out.println("Pegando pedido no balcão");
     }
}
