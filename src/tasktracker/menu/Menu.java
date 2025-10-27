package tasktracker.menu;

import java.util.Scanner;
import tasktracker.evento.Eventos;
import tasktracker.tarefa.Tarefa;
import java.util.ArrayList;

public final class Menu {

    ArrayList<Tarefa> listaTaf = new ArrayList<>();
    
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


    public final void mostrarMenu() {
        while (true) {
            System.out.println("""
                               Digite um valor:
                               [0] Sair
                               [1] Evento
                               [2] Tarefa
                               [3] Mostrar eventos
                               [4] Mostrar tarefas
                               """);
            Scanner sc = new Scanner(System.in);

            int resp = sc.nextInt();
            System.out.println("");
            if (resp == 0) {
                break;
            } else if (resp == 1) {
                Eventos ev = new Eventos();
                ev.start();
                ev.mostrar();

            } else if (resp == 2) {
                Tarefa taf = new Tarefa();
                taf.start();
                taf.mostrar();
                listaTaf.add(taf);

            } else if (resp == 4 && listaTaf != null && !listaTaf.isEmpty()) {
                mostrarListaTaf();
            } else {
                System.out.println("Valor inválido");
                System.out.println("");
            }
        }
    }

}
