import cozinha.Cozinheiro;
import cozinha.almoxarifado.Almoxerife;
import salao.Cliente;
import salao.balcao.Atendente;

public class RestauranteSimulation {
    public static void main(String[] args) {
        // Criação dos funcionários
        Almoxerife almoxerife = new Almoxerife("João", 45, "Almoxarife");
        Cozinheiro cozinheiro = new Cozinheiro("Maria", 30, "Cozinheiro");
        Atendente atendente = new Atendente("Pedro", 28, "Atendente");

        // Criação do cliente
        Cliente cliente = new Cliente();

        // Simulação do atendimento
        System.out.println("=== Simulação do Atendimento ===\n");

        // Cliente faz um pedido
        System.out.println("** Cliente **");
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        System.out.println();

        // Atendente realiza as ações necessárias
        System.out.println("** Atendente **");
        atendente.servindoMesa();
        atendente.receberPagamento();
        System.out.println();

        // Cozinheiro prepara o lanche e o suco
        System.out.println("** Cozinheiro **");
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.lavarIngredientes();
        cozinheiro.preprararCombo();
        cozinheiro.adicionarComboNoBalcao();
        System.out.println();

        // Almoxarife entrega ingredientes e troca gás se necessário
        System.out.println("** Almoxarife **");
        almoxerife.entregarIngredientes();
        almoxerife.trocarGas();
        System.out.println();

        // O atendente retira o lanche e o suco do balcão
        System.out.println("** Conclusão **");
        atendente.pegarLancheCozinha();
        System.out.println("O atendente retirou o lanche e o suco do balcão e serviu ao cliente.");
        System.out.println("\n=== Fim da Simulação ===");
    }
}
