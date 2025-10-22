package tasktracker.evento;

import java.util.Scanner;


public class Eventos {
    private String data;
    private String local;
    private String nomeEvento;
    
    
    public void mostrarEvento() {
        System.out.println("....................................");
        System.out.println(getData());
        System.out.println(getLocal());
        System.out.println(getNomeEvento());
        System.out.println("....................................");
    }
    
    public void criarEvento(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Data do evento (dd/mm/aaaa): ");
        String d = sc.nextLine();
        System.out.println("Local: ");
        String l = sc.nextLine();
        System.out.println("Nome do evento: ");
        String n = sc.nextLine();
        
        this.setData(d);
        this.setLocal(l);
        this.setNomeEvento(n);
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}
