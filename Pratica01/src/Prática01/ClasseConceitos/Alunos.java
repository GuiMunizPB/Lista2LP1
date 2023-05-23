package Prática01.ClasseConceitos;

public class Alunos extends Pessoa {
    private long matricula;

    public Alunos(String nome, String email, long telefone, long matricula) {
        super(nome,email,telefone); // Chama o construtor da classe pai para inicializar os atributos herdados
        this.matricula = matricula;
    }

    public void mostrarInfos(){
            System.out.println("Nome do aluno: " + this.getNome());
            System.out.println("Email do aluno: " + this.getEmail());
            System.out.println("Telefone do aluno: " + this.getTelefone());
            System.out.println("Matrícula do aluno: " + this.getMatricula());


    }

    public void mostrarAlunos(){
            System.out.println("Nome do aluno: " + this.getNome());
            System.out.println("Email do aluno: " + this.getEmail());
            System.out.println("Telefone do aluno: " + this.getTelefone());
            System.out.println("Matrícula do aluno: " + this.getMatricula());
            System.out.println("---------------------");
    }




    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
