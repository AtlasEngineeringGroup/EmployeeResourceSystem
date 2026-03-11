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

    public void alocarRecurso(double valorRecurso){
        if (this.valorEstimado > 5000 ){
            System.out.println("Mensagem especial!");
        }
    }
}
