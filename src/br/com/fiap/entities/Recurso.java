package br.com.fiap.entities;

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
        this.disponivel = disponivel;
        this.valorEstimado = valorEstimado;
    }

    public int getId(){
        return id;
    }

    public double getValorEstimado(){
        return valorEstimado;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public String getNomeDoRecurso(){
        return nomeDoRecurso;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public boolean podeSerAlocado(){
        return disponivel;
    }
}