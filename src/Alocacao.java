public class Alocacao {
    int colaboradorid;
    int recursosid;
    String data;
    String observacao;

    public Alocacao(int colaboradorint, int recursosid, String data, String observacao){
        this.colaboradorid = colaboradorint;
        this.recursosid =  recursosid;
        this.data = data;
        this.observacao = observacao;

    }

    @Override
    public String toString() {
        return "Colaborador ID: " + colaboradorid +
                " | Recurso ID: " + recursosid +
                " | Data: " + data +
                " | Observação: " + observacao;
    }

    public int getIdColaborador(){
        return colaboradorid;
    }

    public int getIdRecursos(){
        return recursosid;
    }

    public void alocarRecurso(int colaboradorint, int recursosid){




    }
}
