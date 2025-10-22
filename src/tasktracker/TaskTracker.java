package tasktracker;
import java.util.Scanner;
import tasktracker.evento.Eventos;

public class TaskTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Eventos ev = new Eventos();
        
        System.out.println("Data do evento (dd/mm/aaaa): ");
        String data = sc.nextLine();
        System.out.println("Local: ");
        String local = sc.nextLine();
        System.out.println("Nome do evento: ");
        String nomeEvento = sc.nextLine();
        
        ev.criarEvento(data, local, nomeEvento);
        ev.mostrarEvento();
    }

}
