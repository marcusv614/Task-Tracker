package tasktracker.menu;

import java.util.Scanner;
import tasktracker.evento.Eventos;

public final class Menu {
    Eventos ev = new Eventos();
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
                ev.criarEvento();
                ev.mostrarEvento();
            }
        }
    }

}
