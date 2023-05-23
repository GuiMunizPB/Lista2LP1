//Existe uma relação de herança da classe Pessoa(Pai) para as classes Aluno, Responsaveis e Professores
//A classe Agenda tem um relacionamento de composição com as outras

package Prática01.ClassePrincipal;
import Prática01.ClasseConceitos.Agenda;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        try{
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean menu = true;
        
        clearScreen();
        agenda.registraAlunos();
        
        clearScreen();
        System.out.println("Gostaria de cadastrar professor? Sim ou Não");
        String escolha_professor = sc.nextLine();
        if (escolha_professor.equalsIgnoreCase("Sim")) {
            agenda.registraProfessor();
        }


        while (menu) {
            int sem_aluno = 0;

            clearScreen();
            agenda.mostraMenu();
            String escolha = sc.nextLine().toLowerCase();

            switch(escolha){
                case "cadastros":
                    clearScreen();
                    agenda.mostraCadastrosAgenda();
                    Thread.sleep(10000);
                    break;
                case "responsaveis":
                    clearScreen();
                    agenda.mostraResponsaveisAgenda();
                    Thread.sleep(10000);
                    break;
                case "alunos":
                    clearScreen();
                    agenda.mostraAlunosAgenda();
                    Thread.sleep(10000);
                    break;
                case "especifico":
                    clearScreen();
                    System.out.println("A busca será por nome ou índice?");
                    String busca = sc.nextLine();
                    if (busca.equalsIgnoreCase("nome")) {
                        System.out.println("Digite o nome desejado: ");
                        String busca_nome = sc.nextLine();
                        clearScreen();
                        agenda.mostraBuscaNome(busca_nome, sem_aluno);
                        Thread.sleep(10000);
                    } else if (busca.equalsIgnoreCase("índice")) {
                        System.out.println("Digite o índice desejado: ");
                        int busca_indice = sc.nextInt();
                        sc.nextLine();
                        clearScreen();
                        agenda.mostraBuscaIndice(busca_indice, sem_aluno);
                        Thread.sleep(10000);
                    }
                    break;
                case "professores":
                    if (escolha_professor.equalsIgnoreCase("Sim")){
                        clearScreen();
                        agenda.mostraProfessoresAgenda();
                        Thread.sleep(10000);
                    }
                    else{
                        System.out.println("Não foram cadastrados professores");
                        Thread.sleep(10000);
                    }
                    break;
                case "sair":
                    menu = false;
                    break;

                default:
                    break;

            }
        }
        sc.close();
    } catch (Exception e) {
        System.out.println("Ocorreu um erro: " + e.getMessage());
    }
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}










