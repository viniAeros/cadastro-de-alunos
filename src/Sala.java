import java.util.ArrayList;

public class Sala {
    
    ArrayList<Alunos> listaDeAlunos;
    
    public Sala(){
        this.listaDeAlunos = new ArrayList<>();
    }
    
    void insereAluno(Alunos novoAluno){
        novoAluno.calculaNotas();
        listaDeAlunos.add(novoAluno);     
    }
    
    void listarAlunos(){
        System.out.println("\nLista de alunos: \n");
        
        for(Alunos a:listaDeAlunos){
            a.listar();
        }
    }
    
    void listarSituacoes(){
        System.out.println("\nSituações: ");
        
        for(Alunos alunoNaLista:listaDeAlunos){
            alunoNaLista.mostraSituacao();
        }
    }
    
}