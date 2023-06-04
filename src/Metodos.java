import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    public static Scanner leia =new Scanner(System.in);

    private static ArrayList<Aluno> listaAluno = new ArrayList<>();

    public static void abreMenu() {
        System.out.println("=========MENU=========");
        System.out.println("(1) Listar Alunos");
        System.out.println("(2) Remover Aluno");
        System.out.println("(3) Sair do Programa");
    }

    public static int leiaInt(String prompt, int useChoice){
        int input;
        do{
            System.out.print(prompt);
            try{
                input = Integer.parseInt(leia.next());
            } catch(Exception e) {
                input = -1;
                System.out.println("Por favor ultilize um numero inteiro!");
            }
        }while(input < 1 || input > useChoice);
        return input;
    }

    public static ArrayList<Aluno> getListaAluno() {
        return listaAluno;
    }

    public static void adicionaLista(ArrayList<Aluno> listaAluno){
        listaAluno.add(new Aluno("Gabriel Pontes Bruzzi Portella Santos",22));
        listaAluno.add(new Aluno("Guilherme Esteves da Silva Mota",21));
        listaAluno.add(new Aluno("João Fellipe da Costa Amorim", 20));
        listaAluno.add(new Aluno("Andrey Albuquerque Leite", 19));
        listaAluno.add(new Aluno("Camille Vitória Dos Reis Silva", 18));
        listaAluno.add(new Aluno("Nathan Esteves Vieira", 17));
        listaAluno.add(new Aluno("Pedro Henrique da Silva Nascimento", 16));
        listaAluno.add(new Aluno("Sérgio de Souza Lima Sobrinho", 15));
        listaAluno.add(new Aluno("Carlos Leonardo Carvalho Otoline", 14));
        listaAluno.add(new Aluno("Cássia Vitória Vieira Palagi", 13));
        listaAluno.add(new Aluno("Christian Clemente da Silva", 12));
        listaAluno.add(new Aluno("Emanuel Leocadio Ramalho", 11));
        listaAluno.add(new Aluno("Davi de Almeida Silva", 10));
        listaAluno.add(new Aluno("Davi Maia Martins Bittencourt de Souza", 1));
        listaAluno.add(new Aluno("Thomás da Cruz Pinhero", 2));
        listaAluno.add(new Aluno("Vinícius Chagas Magro", 3));
        listaAluno.add(new Aluno("Eduardo da Silva Lima", 4));
        listaAluno.add(new Aluno("Jose Wanderson da Silva Pimentel", 5));
        listaAluno.add(new Aluno("Kesia do Amaral Mendes", 6));
        listaAluno.add(new Aluno("Leonardo de Oliveira Bianco de Figueiredo", 7));
        listaAluno.add(new Aluno("Luiz Felipe Vieira de Oliveira Ribeiro", 8));
        listaAluno.add(new Aluno("Vinícius Gabriel Neves Dutra", 9));
    }
}
