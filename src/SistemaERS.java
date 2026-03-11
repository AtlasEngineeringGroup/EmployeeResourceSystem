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

    public void alocarRecurso(int colaboradorid, int recursosid, String data, String observacao) {

        for (Recurso r : listaRecursos) {
            if (r.getId() == recursosid && r.podeSerAlocado()) {
                for (Colaborador c : listaColaboradores) {
                    if (c.getId() == colaboradorid) {

                        Alocacao novaAlocacao = new Alocacao(colaboradorid, recursosid, data, observacao);
                        listaAlocacoes.add(novaAlocacao);
                        r.setDisponivel(false);
                        System.out.println("Recurso alocado com sucesso");
                    } else {
                        System.out.println("Erro ao alocar! ");
                    }
                }
            }
        }
    }

    public void devolverRecurso(int colaboradorid, int recursosid){

        for (int i = 0; i < listaAlocacoes.size(); i++){
            Alocacao a = listaAlocacoes.get(i);
            if (a.getIdRecursos() == recursosid && a.getIdColaborador() == colaboradorid){
                listaAlocacoes.remove(a);
                    for (Recurso r : listaRecursos){
                            if(r.getId() == recursosid){
                                r.setDisponivel(true);
                            }
                        }
                    System.out.println("O recurso foi devolvido! ");
                }
            else {
                System.out.println("Erro! ");
                }
            }
    }

    public void buscarRecursosDisponiveis(){

        for (Recurso r : listaRecursos) {
            if (r.disponivel) {
                System.out.println("O recurso " + r.nomeDoRecurso + "está disponível! ");
            }
        }
    }

    public void exibirColaborador(int idColaborador){
        for (Colaborador c : listaColaboradores){
            if (c.id == idColaborador){
                System.out.println("Nome: " + c.nome);
                System.out.println("Cargo: " + c.cargo);
                System.out.println("Salário: " + c.salario);
                System.out.println("Data de Admissão: " + c.dataDeAdmissao);
            }
            else {
                System.out.println("Colaborador não encontrado! ");
            }
        }
    }

    public static void main(String[] args) {
        SistemaERS sistema = new SistemaERS();

        sistema.cadastrarColaborador(1, "João", "Dev", 5000, "07/09/2022");
        sistema.cadastrarRecuros(1,"Notebook","Eletronico",true,2000);
        sistema.alocarRecurso(1,1,"11/03/2026"," Notebook foi alocado!");
        System.out.println(sistema.listaAlocacoes);
        sistema.devolverRecurso(1,1);
        sistema.buscarRecursosDisponiveis();
        sistema.exibirColaborador(1);
    }
}