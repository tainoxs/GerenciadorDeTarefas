package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefaDesafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        Scanner remove = new Scanner(System.in);
        int sys = 0;
        int rep = -1;
        List<String> tarefas = new ArrayList<>();



        while (sys != 4){

            System.out.print("\nDigite:\n1: Adicionar tarefa\n2: Ver tarefas\n3: Marcar como concluída\n4: Para finalizar o programa.\n\n  ");
            sys = entrada.nextInt();
            if (sys == 1){
                do {
                    System.out.print("\nDigite a tarefa que deseja adicionar:\n  ");
                    rep++;
                    tarefas.add(texto.nextLine());
                    System.out.print("\nA tarefa: "+tarefas.get(rep)+" foi adicionada!\n\nDigite 1 para adicionar outra tarefa\ne 2 para voltar...\n  ");
                    sys = entrada.nextInt();
                }while (sys == 1);{
                    sys = 0;
                }


            }
            else if (sys == 2) {
                do {
                    if (tarefas.size()>=1){
                        for (int i = 0;i < tarefas.size();i++) {
                            System.out.print(i+1 +"- " + tarefas.get(i)+"\n");

                        }
                        System.out.print("\nDigite 2 para voltar:\n  ");
                        sys = entrada.nextInt();

                    }

                    else if (tarefas.isEmpty()) {
                        System.out.print("\nNenhuma tarefa a ser exibida!\n");
                        System.out.print("\nDigite 2 para voltar:\n  ");
                        sys = entrada.nextInt();
                    }
                }while (sys != 2);
                continue;





            }
            else if (sys == 3) {
                do {
                    for (int i = 0;i < tarefas.size();i++) {
                        System.out.print(i+1 +"- " + tarefas.get(i)+"\n");
                    }
                    if (tarefas.size()>=1){
                        System.out.print("\nQual tarefa deseja remover?\n  ");
                        tarefas.remove(remove.nextInt()-1);
                        rep--;
                        continue;
                    } else if (tarefas.isEmpty()) {
                        System.out.print("\nNenhuma tarefa a ser excluida!\n");
                        System.out.print("\nDigite 3 para voltar:\n  ");
                        sys = entrada.nextInt();
                    }
                }while (sys != 3);
                continue;
            }



        }
        System.out.println("---- PROGRAMA FINALIZADO ----");
        entrada.close();
        texto.close();

    }
}


