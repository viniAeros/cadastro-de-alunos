import java.util.Scanner;
public class apspoo {
    public static void main(String[] args) {
        
        int opc, qtdNotas;
        float nota = 0;
        String nome, cpf;
        Scanner entrada;
        Alunos novoAluno = new Alunos();
        Sala novaSala = new Sala();
        
        
        entrada = new Scanner(System.in);
        
        do{
            
            System.out.println("| ------------------------ |");
            System.out.println("|           MENU           |");
            System.out.println("| ------------------------ |");
            System.out.println("| Escolha uma opção:       |");
            System.out.println("| 1 - Inserir aluno        |");
            System.out.println("| 2 - Listar alunos        |");
            System.out.println("| 3 - Situações dos alunos |");
            System.out.println("| 0 - Sair                 |");
            System.out.println("| ------------------------ |");
                
            opc = entrada.nextInt();
            entrada.nextLine();
            
            switch(opc){
                
                case 1:
                    System.out.println("\nNome: ");
                    nome = entrada.nextLine();
                    System.out.println("\nCPF: ");
                    cpf = entrada.nextLine();
                    
                    novoAluno = new Alunos(nome, cpf);
                    
                    System.out.println("\nQuantas notas?");
                    qtdNotas = entrada.nextInt();
                    
                    for(int i=0; i < qtdNotas; i++){
                        System.out.println("\nNota " + (i+1));
                        nota = entrada.nextFloat();
                        novoAluno.insereNotas(nota);                        
                    }
                    
                    novaSala.insereAluno(novoAluno);
                    
                    break;
                case 2:
                    novaSala.listarAlunos();
                    break;
                case 3:
                    novaSala.listarSituacoes();
                    break;
                case 0:
                    System.out.println("\nEncerrando menu...");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }while(opc !=0);
                
    }
    
}