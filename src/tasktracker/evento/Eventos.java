package tasktracker.evento;

import java.util.Scanner;
import tasktracker.ui.Opcoes;


public class Eventos implements Opcoes{
    
    private String data;
    private String local;
    private String nomeEvento;
    private String situacao;


    
    @Override
    public void mostrar() {
        System.out.println("....................................");
        System.out.println("Data " + getData());
        System.out.println("Local: " + getLocal());
        System.out.println("Título: " + getNomeEvento());
        System.out.println("Status: " + getSituacao());
        System.out.println("....................................");
    }
    
    @Override
    public void start(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Data do evento (dd/mm/aaaa): ");
        String d = sc.nextLine();
        System.out.println("Local: ");
        String l = sc.nextLine();
        System.out.println("Nome do evento: ");
        String n = sc.nextLine();
        System.out.println("Status: [P] pendente, [C] concluído, [N] não realizado");
        String s = sc.nextLine();
        
        this.setData(d);
        this.setLocal(l);
        this.setNomeEvento(n);
        this.setSituacao(s);
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
    
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


}
