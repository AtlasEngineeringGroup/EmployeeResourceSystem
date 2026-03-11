import java.util.ArrayList;
public class SistemaERS {

    ArrayList<Colaborador> listaColaboradores = new ArrayList<>();
    ArrayList<Recurso> listaRecursos = new ArrayList<>();
    ArrayList<Alocacao> listaAlocacoes = new ArrayList<>();

    public void cadastrarColaborador(int id, String nome, String cargo, double salario, String dataDeAdmissao) {
        Colaborador novoColaborador = new Colaborador(id, nome, cargo, salario, dataDeAdmissao);
        listaColaboradores.add(novoColaborador);
        System.out.println("Colaborador " + nome + " cadastrado com sucesso!");
    }

    public void cadastrarRecuros(int id, String nomeDoRecurso, String categoria, boolean disponivel, double valorEstimado){
        Recurso novoRecurso = new Recurso(id, nomeDoRecurso, categoria, disponivel, valorEstimado);
        listaRecursos.add(novoRecurso);
        System.out.println("Recurso " + nomeDoRecurso + " cadastrado com sucesso!");
    }


    public static void main(String[] args) {
        SistemaERS sistema = new SistemaERS();

        sistema.cadastrarColaborador(1, "João", "Dev", 5000, "07/09/2022");
        sistema.cadastrarRecuros(1,"Notebook","Eletronico",true,10000);
    }
}