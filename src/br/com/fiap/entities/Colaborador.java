package br.com.fiap.entities;

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
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public void promover(String novoCargo, double novoSalario){
        this.cargo = novoCargo;
        this.salario = novoSalario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }
}