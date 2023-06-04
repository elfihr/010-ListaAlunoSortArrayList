

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String imprimir(){
        return "Nome: "+nome+" Matricula: "+matricula;
    }


    @Override
    public int compareTo(Aluno outroAluno) {
        return this.getNome().compareTo(outroAluno.getNome());
    }
}
