public class Colaborador {
    int id;
    String nome;
    String cargo;
    double salario;
    boolean ativo;
    String dataDeAdmissao;

    public Colaborador(int id, String nome, String cargo, double salario, String dataDeAdmissao){
        this.id = id;
        this.nome = nome;
        this.nome = cargo;
        this.salario = salario;
        this.ativo = true;
        this.dataDeAdmissao = dataDeAdmissao;
    }
}

