package tasktracker.tarefa;

import java.util.Scanner;
import tasktracker.ui.Opcoes;

public class Tarefa implements Opcoes {

    private String data;
    private String nomeEvento;
    private String desc;
    private String situacao;

    @Override
    public void mostrar() {
        System.out.println("....................................");
        System.out.println("Data: " + getData());
        System.out.println("Título: " + getDesc());
        System.out.println("Descrição: " + getNomeEvento());
        System.out.println("Status: " + getSituacao());
        System.out.println("....................................");
    }

    @Override
    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Data da Tarefa: ");
        String d = sc.nextLine();
        System.out.println("Nome da Tarefa: ");
        String n = sc.nextLine();
        System.out.println("Descrição: ");
        String desc = sc.nextLine();
        System.out.println("Status: [P] pendente, [C] concluído");
        String s = sc.nextLine();

        this.setData(d);
        this.setNomeEvento(n);
        this.setDesc(desc);
        this.setSituacao(s);
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


}
