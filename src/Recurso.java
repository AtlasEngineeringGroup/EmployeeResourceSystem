public class Recurso {
    int id;
    String nomeDoRecurso;
    String categoria;
    boolean disponivel;
    double valorEstimado;

    public Recurso(int id, String nomeDoRecurso, String categoria, boolean disponivel, double valorEstimado){
        this.id = id;
        this.nomeDoRecurso = nomeDoRecurso;
        this.categoria = categoria;
        this.disponivel = true;
        this.valorEstimado = valorEstimado;

    }

    public int getId(){
        return id;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public boolean podeSerAlocado(){
        return disponivel && valorEstimado <= 5000;
    }
}
