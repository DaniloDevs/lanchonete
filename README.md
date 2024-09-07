# Projeto Lanchonete - Simulação de Atendimento

Este projeto implementa uma simulação de um sistema de atendimento em uma lanchonete. O sistema inclui a interação entre **clientes**, **atendentes**, **cozinheiros** e **almoxarifes**. Cada classe representa um papel específico e possui funcionalidades distintas para gerenciar pedidos e operações diárias na lanchonete.


## Funcionalidades

### 1. Cliente
- **Escolher Lanche**: Permite ao cliente selecionar um lanche do menu.
- **Fazer Pedido**: O cliente faz um pedido para o lanche escolhido.
- **Pagar Conta**: O cliente realiza o pagamento da conta.

### 2. Atendente
- **Servir Mesa**: O atendente retira o lanche da cozinha e serve a mesa.
- **Receber Pagamento**: O atendente recebe o pagamento do cliente.
- **Pegar Lanche da Cozinha**: Método interno para pegar o lanche pronto na cozinha.

### 3. Cozinheiro
- **Selecionar Ingredientes para Lanche**: O cozinheiro seleciona ingredientes para preparar um lanche.
- **Selecionar Ingredientes para Vitamina**: O cozinheiro seleciona ingredientes para preparar uma vitamina.
- **Preparar Lanche**: O cozinheiro prepara o lanche.
- **Preparar Vitamina**: O cozinheiro prepara a vitamina.
- **Adicionar Lanche e Suco no Balcão**: O cozinheiro coloca o lanche e o suco no balcão para ser retirado pelo atendente.
- **Preparar Combo**: Método que prepara um combo de lanche e vitamina.

### 4. Almoxarife
- **Entregar Ingredientes**: O almoxarife entrega ingredientes solicitados pela cozinha.
- **Trocar Gás**: O almoxarife realiza a troca do gás na cozinha.
- **Controlar Entrada e Saída de Itens**: Métodos internos para gerenciar o estoque e a movimentação de itens.

## Como Executar o Projeto

1. **Compilar o Código**:
   - Navegue até o diretório do projeto e compile o código usando `javac`.

     ```sh
     javac -d bin src/main/RestauranteSimulation.java src/cozinha/Cozinheiro.java src/cozinha/almoxarifado/Almoxerife.java src/salao/Cliente.java src/salao/balcao/Atendente.java
     ```

2. **Executar o Programa**:
   - Execute a classe principal `RestauranteSimulation` usando `java`.

     ```sh
     java -cp bin main.RestauranteSimulation
     ```
