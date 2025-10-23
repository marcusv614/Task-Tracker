package tasktracker.tarefa;

import java.util.Scanner;
import tasktracker.inter.Opcoes;

public class Tarefa implements Opcoes {

    private String data;
    private String nomeEvento;
    private String desc;

    @Override
    public void mostrar() {
        System.out.println("....................................");
        System.out.println("Data: " + getData());
        System.out.println("Título: " + getNomeEvento());
        System.out.println("Descrição: " + getDesc());
        System.out.println("....................................");
    }

    @Override
    public void criar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Data da Tarefa: ");
        String d = sc.nextLine();
        System.out.println("Nome da Tarefa: ");
        String n = sc.nextLine();
        System.out.println("Descrição: ");
        String desc = sc.nextLine();
        
        this.setData(d);
        this.setNomeEvento(n);
        this.setDesc(desc);
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


}
