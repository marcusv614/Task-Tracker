package tasktracker.menu;

import java.util.Scanner;
import tasktracker.evento.Eventos;
import tasktracker.tarefa.Tarefa;

public final class Menu {
    Eventos ev = new Eventos();
    Tarefa taf = new Tarefa();
    
    public final void mostrarMenu() {
        while (true) {            
            System.out.println("""
                               Digite um valor:
                               [0] Sair
                               [1] Evento
                               [2] Tarefa
                               """);
            Scanner sc = new Scanner(System.in);
            
            int resp = sc.nextInt();
            System.out.println("");
            if (resp == 0) {break;}
            else if (resp == 1) {
                ev.start();
                ev.criarArray();
                ev.mostrar();
            } else if (resp == 2) {
                taf.start();
                taf.criarArray();
                taf.mostrar();
            } else {System.out.println("Valor inválido");}
        }
    }

}
