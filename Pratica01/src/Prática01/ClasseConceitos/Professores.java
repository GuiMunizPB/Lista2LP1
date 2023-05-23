package Prática01.ClasseConceitos;

public class Professores extends Pessoa{
    private String Disciplina;
    private long matricula;

    public Professores(String nome, String email, long telefone, String disciplina, long matricula) {
        super(nome, email, telefone);
        this.matricula = matricula;
        this.Disciplina = disciplina;
    }
    public void mostraProfessor(){
        System.out.println("Nome do professor: " + this.getNome());
        System.out.println("Email do professor: " + this.getEmail());
        System.out.println("Telefone do professor: " + this.getTelefone());
        System.out.println("Matrícula do professor: " + this.getMatricula());
        System.out.println("Disciplina do professor: " + this.getDisciplina());
        System.out.println("---------------------");


    }
    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
