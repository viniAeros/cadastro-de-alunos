import java.util.ArrayList;

public class Alunos {
    
    float total = 0;
    String nome, cpf, situacao = "reprovado";
    ArrayList<Float> notasAluno = new ArrayList<>();
    
    public Alunos(){
        
    }
   
    
    public Alunos(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    void insereNotas(float nota){
        notasAluno.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    void listar(){
        
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        
        for(int i = 0; i < notasAluno.size(); i++){
            System.out.println("Nota " + (i + 1)+ ": " + this.notasAluno.get(i));
        }
    }
    
    void mostraSituacao(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Total: " + this.total);
            System.out.println("Situação: " + this.situacao);
            System.out.println("\n  \n");
    }
         
      
    void calculaNotas(){
        for(float nota:notasAluno){
            total+= nota;            
        }
        if(total >= 7){
        this.situacao = "Aprovado!";            
    }else{
            this.situacao = "Reprovado!";  
            System.out.println("\n \n");
        }
    }

    public ArrayList<Float> getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(ArrayList<Float> notasAluno) {
        this.notasAluno = notasAluno;
    }
    
    
    
    
    
}