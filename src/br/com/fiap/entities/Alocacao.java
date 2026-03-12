package br.com.fiap.entities;

public class Alocacao {

    int colaboradorId;
    int recursoId;
    String data;
    String observacao;

    public Alocacao(int colaboradorId, int recursoId, String data, String observacao){
        this.colaboradorId = colaboradorId;
        this.recursoId = recursoId;
        this.data = data;
        this.observacao = observacao;
    }

    public int getIdColaborador(){
        return colaboradorId;
    }

    public int getIdRecursos(){
        return recursoId;
    }

    @Override
    public String toString() {
        return "Colaborador ID: " + colaboradorId +
                " | Recurso ID: " + recursoId +
                " | Data: " + data +
                " | Observação: " + observacao;
    }
}