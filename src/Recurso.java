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

    public boolean podeSerAlocado(){
        return disponivel && valorEstimado <= 5000;
    }
}
