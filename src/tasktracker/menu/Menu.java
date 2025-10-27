package tasktracker.menu;

import java.util.Scanner;
import tasktracker.evento.Eventos;
import tasktracker.tarefa.Tarefa;
import java.util.ArrayList;

public final class Menu {

    ArrayList<Tarefa> listaTaf = new ArrayList<>();
    ArrayList<Eventos> listaEv = new ArrayList<>();

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
                            Digite um valor:
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
                    if (!listaEv.isEmpty() && listaEv != null) {
                        mostrarListaEv();
                    } else {
                        System.out.println("Nenhum evento cadastrado! \n");
                    }
                }
                case 4 -> {
                    if (!listaTaf.isEmpty() && listaTaf != null) {
                        mostrarListaTaf();
                    } else {
                        System.out.println("Nenhuma lista cadastrada!\n");
                    }
                }
                default -> {
                    System.out.println("Valor inválido\n");
                    System.out.println("");
                }
            }
        }
    }

}
