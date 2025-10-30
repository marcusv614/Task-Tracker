package tasktracker.menu;

import java.util.Scanner;
import tasktracker.evento.Eventos;
import tasktracker.tarefa.Tarefa;
import java.util.ArrayList;

public final class Menu {

    ArrayList<Tarefa> listaTaf = new ArrayList<>();
    ArrayList<Eventos> listaEv = new ArrayList<>();

    public void subMenu1() {
        System.out.println("""
                           [0] Voltar
                           [1] Alterar Dados
                           """);
    }

    public void mostrarListaTaf() {
        for (int i = 0; i < listaTaf.size(); i++) {
            Tarefa t = listaTaf.get(i);
            System.out.println("===== TAREFA [" + i + "] =====");
            System.out.println("Data: " + t.getData());
            System.out.println("Nome da Tarefa: " + t.getNomeEvento());
            System.out.println("Descrição: " + t.getDesc());
            System.out.println("Situação: " + t.getSituacao());
            System.out.println("=============================\n");
        }
    }

    public void mostrarListaEv() {
        for (int j = 0; j < listaEv.size(); j++) {
            Eventos e = listaEv.get(j);
            System.out.println("===== Evento [" + j + "] =====");
            System.out.println("Data: " + e.getData());
            System.out.println("Local: " + e.getLocal());
            System.out.println("Nome do Evento: " + e.getNomeEvento());
            System.out.println("Situação: " + e.getSituacao());
            System.out.println("=============================\n");
        }
    }

    public final void mostrarMenu() {
        OUTER:
        while (true) {
            System.out.println("""
                            [0] Sair
                            [1] Adicionar Evento
                            [2] Adicionar Tarefa
                            [3] Mostrar eventos
                            [4] Mostrar tarefas
                            """);

            Scanner sc = new Scanner(System.in);
            int resp = sc.nextInt();

            switch (resp) {
                case 0 -> {
                    break OUTER;
                }
                case 1 -> {
                    Eventos ev = new Eventos();
                    ev.start();
                    System.out.println("Evento cadastrado! \n");
                    listaEv.add(ev);
                }
                case 2 -> {
                    Tarefa taf = new Tarefa();
                    taf.start();
                    System.out.println("Tarefa cadastrada! \n");
                    listaTaf.add(taf);
                }
                case 3 -> {
                    if (listaEv != null && !listaEv.isEmpty()) {
                        mostrarListaEv();
                    } else {
                        System.out.println("Nenhum evento cadastrado! \n");
                    }
                }
                case 4 -> {
                    if (listaTaf != null && !listaTaf.isEmpty()) {
                        mostrarListaTaf();
                        subMenu1();
                        while (true) {
                            
                            if (!sc.hasNextInt()) {
                                sc.nextLine();
                                continue;
                            }

                            int resp2 = sc.nextInt();
                            sc.nextLine();

                            if (resp2 == 0) {
                                break;
                            } else if (resp2 == 1) {
                                System.out.println("Digite o índice da tarefa a ser editada. \n");
                                
                                if (!sc.hasNextInt()) {
                                    sc.nextLine();
                                    continue;
                                }

                                int resp3 = sc.nextInt();
                                sc.nextLine();
                                
                                if (resp3 < 0 || resp3 >= listaTaf.size()) {
                                    System.out.println("Índice fora do intervalo. Tente novamente.\n");
                                    continue;
                                }

                                Tarefa t = listaTaf.get(resp3);
                                System.out.println("===== TAREFA [" + resp3 + "] =====");
                                System.out.println("Data: " + t.getData());
                                System.out.println("Nome da Tarefa: " + t.getNomeEvento());
                                System.out.println("Descrição: " + t.getDesc());
                                System.out.println("Situação: " + t.getSituacao());
                                System.out.println("=============================\n");
                                System.out.println("""
                                                   Editar:
                                                   [1] Data
                                                   [2] Nome
                                                   [3] Descrição
                                                   [4] Status
                                                   """);
                                
                                if (!sc.hasNextInt()) {
                                    sc.nextLine();
                                    continue;
                                }
 
                                int resp4 = sc.nextInt();
                                sc.nextLine();

                                switch (resp4) {
                                    case 1 -> {
                                        System.out.println("Digite a nova data: \n");
                                        String novaData = sc.nextLine();
                                        listaTaf.get(resp3).setData(novaData);
                                    }
                                    case 2 -> {
                                        System.out.println("Digite o novo nome: \n");
                                        String novoNome = sc.nextLine();
                                        listaTaf.get(resp3).setNomeEvento(novoNome);
                                    }
                                    case 3 -> {
                                        System.out.println("Digite a nova descrição: \n");
                                        String novaDesc = sc.nextLine();
                                        listaTaf.get(resp3).setDesc(novaDesc);
                                    }
                                    case 4 -> {
                                        System.out.println("Digite o novo status [P] [C]");
                                        String novoStatus = sc.nextLine();
                                        listaTaf.get(resp3).setSituacao(novoStatus);
                                    }
                                    default ->
                                        System.out.println("valor inválido");
                                }
                                
                                System.out.println("Tarefa atualizada !");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Nenhuma tarefa cadastrada!\n");
                    }
                }
                default -> {
                    System.out.println("Valor inválido!\n");
                }
            }
        }
    }
}
