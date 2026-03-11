import java.util.ArrayList;
public class SistemaERS {
    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador(1,"Joao","Desenvolvedor", 15000, "01/6/2020");
        Colaborador colaborador2 = new Colaborador(1,"Carlos","Desenvolvedor", 20000, "06/2/2017");
        Colaborador colaborador3 = new Colaborador(1,"Rodrigo","Estagiário", 2000, "10/2/2026");

        ArrayList<String> listaColaboladores = new ArrayList<>();

        listaColaboladores.add(colaborador1.nome);
        listaColaboladores.add(colaborador2.nome);
        listaColaboladores.add(colaborador3.nome);


        Recurso recurso1 = new Recurso(1,"Computador","Aparelho",true,10000);
        Recurso recurso2 = new Recurso(2,"LapTop","Aparelho",true,8000);

        ArrayList<String> listaRecursos = new ArrayList<>();

        listaColaboladores.add(recurso1.nomeDoRecurso);
        listaColaboladores.add(recurso2.nomeDoRecurso);

    }
}
