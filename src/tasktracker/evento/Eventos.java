package tasktracker.evento;

import java.util.Scanner;
import tasktracker.ui.Opcoes;


public class Eventos implements Opcoes{
    String[] eventoArray =  new String[4];
    
    private String data;
    private String local;
    private String nomeEvento;
    private String situacao;

    @Override
    public void listaArrays() {
        
    }
    
    @Override
    public void criarArray() {
        eventoArray[0] = getData();
        eventoArray[1] = getLocal();
        eventoArray[2] = getNomeEvento();
        eventoArray[3] = getSituacao();
    }
    
    @Override
    public void mostrar() {
        System.out.println("....................................");
        System.out.println("Data " + eventoArray[0]);
        System.out.println("Local: " + eventoArray[1]);
        System.out.println("Título: " + eventoArray[2]);
        System.out.println("Status: " + eventoArray[3]);
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
