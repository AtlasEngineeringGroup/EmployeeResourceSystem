package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.entities.Alocacao;
import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Recurso;

import java.util.ArrayList;

public class SistemaERS {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

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

        boolean encontrado = false;

        for (Recurso r : listaRecursos) {

            if (r.getId() == recursosid) {

                if (r.getValorEstimado() > 5000){
                    System.out.println("Para alocar este recurso é necessário autorização especial!");
                }

                if (r.podeSerAlocado()) {

                    for (Colaborador c : listaColaboradores) {

                        if (c.getId() == colaboradorid) {

                            Alocacao novaAlocacao = new Alocacao(colaboradorid, recursosid, data, observacao);
                            listaAlocacoes.add(novaAlocacao);

                            r.setDisponivel(false);

                            System.out.println("Recurso alocado com sucesso");
                            encontrado = true;
                        }
                    }
                }
            }
        }

        if (!encontrado){
            System.out.println("Colaborador ou Recurso não encontrados!");
        }
    }

    public void devolverRecurso(int colaboradorid, int recursosid){

        boolean encontrado = false;

        for (int i = 0; i < listaAlocacoes.size(); i++){

            Alocacao a = listaAlocacoes.get(i);

            if (a.getIdRecursos() == recursosid && a.getIdColaborador() == colaboradorid){

                listaAlocacoes.remove(a);

                for (Recurso r : listaRecursos){

                    if(r.getId() == recursosid){
                        r.setDisponivel(true);
                    }

                }

                System.out.println("O recurso foi devolvido!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("Alocação não encontrada!");
        }
    }

    public void buscarRecursosDisponiveis(){

        for (Recurso r : listaRecursos) {

            if (r.isDisponivel()) {
                System.out.println("O recurso " + r.getNomeDoRecurso() + " está disponível!");
            }

        }
    }

    public void exibirRecursos(){

        for(Recurso r : listaRecursos){

            System.out.println(
                    "ID: " + r.getId() +
                            " | Nome: " + r.getNomeDoRecurso() +
                            " | Disponível: " + r.isDisponivel()
            );

        }
    }

    public void exibirColaborador(int idColaborador){

        boolean encontrado = false;

        for (Colaborador c : listaColaboradores){

            if (c.getId() == idColaborador){

                System.out.println("Nome: " + c.getNome());
                System.out.println("Cargo: " + c.getCargo());
                System.out.println("Salário: " + c.getSalario());
                System.out.println("Data de Admissão: " + c.getDataDeAdmissao());

                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("Colaborador não encontrado!");
        }
    }

    // ⭐ INOVAÇÃO
    public void calcularCustoEquipamentosColaborador(int idColaborador){

        double total = 0;

        for(Alocacao a : listaAlocacoes){

            if(a.getIdColaborador() == idColaborador){

                for(Recurso r : listaRecursos){

                    if(r.getId() == a.getIdRecursos()){
                        total += r.getValorEstimado();
                    }

                }

            }

        }

        System.out.println("Custo total de equipamentos do colaborador: R$ " + total);
    }

    public static void main(String[] args) {

        SistemaERS sistema = new SistemaERS();

        int id = inteiro("ID do colaborador:");
        String nome = texto("Nome do colaborador:");
        String cargo = texto("Cargo:");
        double salario = real("Salário:");
        String data = texto("Data de admissão:");

        sistema.cadastrarColaborador(id,nome,cargo,salario,data);

        int idRecurso = inteiro("ID do recurso:");
        String nomeRecurso = texto("Nome do recurso:");
        String categoria = texto("Categoria:");
        double valor = real("Valor estimado:");

        sistema.cadastrarRecuros(idRecurso,nomeRecurso,categoria,true,valor);

        sistema.alocarRecurso(id,idRecurso,"11/03/2026","Alocação via sistema");

        JOptionPane.showMessageDialog(null,
                "Alocações registradas:\n" + sistema.listaAlocacoes
        );

        sistema.devolverRecurso(id,idRecurso);

        sistema.buscarRecursosDisponiveis();

        sistema.exibirRecursos();

        sistema.exibirColaborador(id);

        // ⭐ chama a inovação
        sistema.calcularCustoEquipamentosColaborador(id);
    }
}