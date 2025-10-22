package tasktracker.evento;
public class Eventos {
    private String data;
    private String local;
    private String nomeEvento;

    @Override
    public String toString() {
        return "Eventos{" + "data=" + data + ", local=" + local + ", nomeEvento=" + nomeEvento + '}';
    }
    
    public void criarEvento(String data, String local, String nomeEvento){
        this.setData(data);
        this.setLocal(local);
        this.setNomeEvento(nomeEvento);
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
