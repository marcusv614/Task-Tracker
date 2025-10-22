package tasktracker;
import tasktracker.evento.Eventos;

public class TaskTracker {

    public static void main(String[] args) {
        Eventos ev = new Eventos();
        
        ev.criarEvento();
        ev.mostrarEvento();
    }

}
