# Gerenciador de Tarefas

Este é um programa simples em Java para gerenciamento de tarefas. Ele permite ao usuário adicionar tarefas, visualizar a lista de tarefas e marcar uma tarefa como concluída (removendo-a da lista). O programa é interativo e usa um menu no console para navegação.

## Funcionalidades

- **Adicionar tarefa:** Permite ao usuário adicionar uma tarefa à lista.
- **Ver tarefas:** Exibe a lista de tarefas cadastradas.
- **Marcar como concluída:** Remove uma tarefa da lista após ser concluída.
- **Finalizar o programa:** Encerra a execução do programa.

## Como usar

1. Ao iniciar o programa, o usuário verá um menu com as seguintes opções:
    - Digite `1` para **Adicionar tarefa**.
    - Digite `2` para **Ver tarefas**.
    - Digite `3` para **Marcar uma tarefa como concluída**.
    - Digite `4` para **Finalizar o programa**.

2. **Adicionar Tarefa:**
   - Após selecionar a opção `1`, você será solicitado a digitar a tarefa que deseja adicionar.
   - Será possível adicionar quantas tarefas quiser. Para isso, digite `1` após adicionar uma tarefa para continuar adicionando, ou `2` para voltar ao menu principal.

3. **Ver Tarefas:**
   - Ao selecionar a opção `2`, o programa exibirá a lista de tarefas adicionadas. 
   - Caso não haja tarefas, uma mensagem informará que a lista está vazia.
   - Digite `2` para retornar ao menu principal.

4. **Marcar Tarefa como Concluída:**
   - Selecione a opção `3` para ver a lista de tarefas numeradas.
   - Digite o número da tarefa que deseja marcar como concluída para removê-la da lista.
   - Caso não haja tarefas a remover, uma mensagem informará que a lista está vazia.
   - Digite `3` para retornar ao menu principal.

5. **Finalizar o Programa:**
   - Selecione `4` para finalizar o programa.

## Requisitos

- **Java 8 ou superior**

## Como executar

1. Clone ou baixe o repositório.
2. Compile o arquivo Java com o comando:
   ```bash
   javac DesafioHoraDePraticar3.java
