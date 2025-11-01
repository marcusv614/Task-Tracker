package tasktracker;

import tasktracker.menu.Menu;

public class TaskTracker {

    public static void main(String[] args) {
        try {
            Menu m = new Menu();
            m.boasVindas();
            m.mostrarMenu();
        } catch (Exception e) {
            System.out.println("Opção inválida, tente denovo. \n");
            Menu m = new Menu();
            m.boasVindas();
            m.mostrarMenu();
        }
    }

}
