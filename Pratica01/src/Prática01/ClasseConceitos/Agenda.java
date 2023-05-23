package Prática01.ClasseConceitos;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Agenda {
    Responsaveis[] responsavel = new Responsaveis[10];
    Alunos[] aluno = new Alunos[10];
    Scanner sc = new Scanner(System.in);
    Professores[] professor = new Professores[5];

    public void mostraMenu(){
        System.out.println("---Menu de Acesso ---");
        System.out.println("Digite 'cadastros' para acessar todas as informações das pessoas cadastradas");
        System.out.println("Digite 'responsaveis' para acessar somente as informações dos responsáveis");
        System.out.println("Digite 'alunos' para acessar somente as informações dos alunos");
        System.out.println("Digite 'especifico' caso queira acessar as informações de um aluno específico");
        System.out.println("Digite 'professores' caso queira acessar as informações dos professores");
        System.out.println("Digite 'sair' para fechar a agenda");
    }
    public void registraAlunos() {
        System.out.println("Por favor, registre as informações dos 10 alunos para a Gincana do Nono Ano!");
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Insira o email do aluno: ");
            String email = sc.nextLine();
            System.out.println("Insira o telefone do aluno: ");
            long telefone = sc.nextLong();
            sc.nextLine();

            long matricula = 0;
            boolean isValidInput = false;

            while (!isValidInput) {
                try {
                    System.out.println("Insira o número de matrícula do aluno: ");
                    matricula = sc.nextLong();
                    sc.nextLine();
                    isValidInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um valor numérico válido para a matrícula.");
                    sc.nextLine();
                }
            }

            aluno[i] = new Alunos(nome, email, telefone, matricula);

            System.out.println("Insira o nome do responsável: ");
            String nomeResponsavel = sc.nextLine();
            System.out.println("Insira o email do responsável: ");
            String emailResponsavel = sc.nextLine();
            System.out.println("Insira o telefone do responsável: ");
            long telefoneResponsavel = sc.nextLong();
            sc.nextLine();
            clearScreen();

            responsavel[i] = new Responsaveis(nomeResponsavel, emailResponsavel, telefoneResponsavel);
        }
    }


    public void registraProfessor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o nome do professor: ");
            String nome = sc.nextLine();
            System.out.println("Insira o email do professor: ");
            String email = sc.nextLine();
            System.out.println("Insira o telefone do professor: ");
            long telefone = sc.nextLong();
            sc.nextLine();

            long matricula = 0;
            boolean isValidInput = false;

            while (!isValidInput) {
                try {
                    System.out.println("Insira o número de matrícula do professor: ");
                    matricula = sc.nextLong();
                    sc.nextLine();
                    isValidInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um valor numérico válido para a matrícula.");
                    sc.nextLine();
                }
            }

            System.out.println("Insira a disciplina do professor: ");
            String disciplina = sc.nextLine();
            clearScreen();

            professor[i] = new Professores(nome, email, telefone, disciplina, matricula);
        }
    }


    public void mostraCadastrosAgenda() {
        for (int i = 0; i < 10; i++) {
            aluno[i].mostrarInfos();
            responsavel[i].mostrarResponsaveis();
        }
    }
    public void mostraAlunosAgenda(){
        for (int i = 0; i < 10; i++) {
                aluno[i].mostrarAlunos();
            }
        }
    public void mostraResponsaveisAgenda(){
        for (int i = 0; i < 10; i++) {
            responsavel[i].mostrarResponsaveis();
        }
    }
    public void mostraBuscaNome(String busca_nome, int sem_aluno){
        for (int i = 0; i < 10; i++) {
            if (aluno[i].getNome().equalsIgnoreCase(busca_nome)) {
                aluno[i].mostrarInfos();
                responsavel[i].mostrarResponsaveis();
            }
            else{
                sem_aluno +=1;
            }
            if(sem_aluno == 10){
                System.out.println("Aluno não encontrado");
            }

        }
    }
    public void mostraBuscaIndice(int busca_indice, int sem_aluno){
        for (int i = 0; i < 10; i++) {
            if (i == busca_indice - 1) {
                aluno[i].mostrarInfos();
                responsavel[i].mostrarResponsaveis();
            } else{
                sem_aluno +=1;
            }
        }
        if(sem_aluno == 10){
            System.out.println("Aluno não encontrado");
        }}

    public void mostraProfessoresAgenda() {
        for (int i = 0; i < 5; i++) {
            professor[i].mostraProfessor();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
