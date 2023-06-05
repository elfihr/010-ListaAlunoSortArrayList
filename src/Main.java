import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Metodos.adicionaLista(Metodos.getListaAluno());

        int input = 1;

        do{
            Metodos.abreMenu();
            input = Metodos.leiaInt("=>",3);

            if(input == 1){
                System.out.println("---------Listar ALunos----------");
                System.out.println("(1) por Nome\n(2) por Matricula");
                input = Metodos.leiaInt("=>",2);
                if(input ==1) {
                    Metodos.getListaAluno().sort(null);
                    for (Aluno abreLista : Metodos.getListaAluno()) {
                        System.out.println(abreLista.imprimir());
                    }
                } else if (input == 2) {
                    Metodos.getListaAluno().sort(new Comparador());
                    Metodos.getListaAluno().forEach(a -> System.out.println(a.imprimir)); //For-each utilizando lambda
                }
            } else if (input == 2) {
                System.out.println("---------Remover Alunos----------");
                System.out.println("Digite o nome do Aluno a ser removido");
                System.out.print("Nome: ");
                String nome = leia.nextLine();
                Boolean removeu = Metodos.getListaAluno().removeIf(a -> a.getNome().contains(nome));
                if (removeu) {
                    System.out.println("Alunos removidos!");
                } else {
                    System.out.println("Nenhum aluno encontrado!");
                }
            }
        }while(input != 3);
        System.out.println("Fim do Programa");
    }




}