// A classe Televisão e ControleRemoto tem um relacionamento de Associação
package Prática03.ClassePrincipal;
import java.util.Locale;
import java.util.Scanner;
import Prática03.ClasseConceitos.Televisão;
import Prática03.ClasseConceitos.ControleRemoto;

public class Main {
    public static void main(String[] args) {
        Televisão televisao = new Televisão();
        ControleRemoto controleRemoto = new ControleRemoto(televisao);
        Scanner sc = new Scanner(System.in);
        boolean tv_ligada = true;

        while (tv_ligada) {
            clearScreen();
            System.out.println("---Controle Remoto---");
            System.out.println("Bem-vindo ao sistema de televisão GuiLua!");
            System.out.println("Digite 1 para aumentar ou diminuir o volume da sua TV");
            System.out.println("Digite 2 para aumentar ou diminuir o canal da sua TV");
            System.out.println("Digite 3 para escolher um canal específico");
            System.out.println("Digite 4 para consultar o volume do som e o canal atual");
            System.out.println("Digite 0 para desligar a TV");
            
            try {
                int escolha = sc.nextInt();
                sc.nextLine();

                switch (escolha) {
                    case 1:
                        System.out.println("Qual a função desejada? 'aumentar' ou 'diminuir'?");
                        String funcao = sc.nextLine().toLowerCase(Locale.ROOT);

                        switch (funcao) {
                            case "aumentar":
                                controleRemoto.aumentarVolume();
                                break;
                            case "diminuir":
                                controleRemoto.diminuirVolume();
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Qual a função desejada? 'aumentar' ou 'diminuir'?");
                        funcao = sc.nextLine().toLowerCase(Locale.ROOT);

                        switch (funcao) {
                            case "aumentar":
                                controleRemoto.aumentarCanal();
                                break;
                            case "diminuir":
                                controleRemoto.diminuirCanal();
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("Qual o canal desejado?");
                        int canal_desejado = sc.nextInt();
                        sc.nextLine(); // Consumir a quebra de linha pendente
                        controleRemoto.trocarCanal(canal_desejado);
                        break;

                    case 4:
                        System.out.println("O volume atual é: " + televisao.getVolume());
                        System.out.println("O canal atual é: " + televisao.getCanal());
                        Thread.sleep(8000);
                        break;
                    case 0:
                        System.out.println("Desligando...");
                        tv_ligada = false;
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: opção inválida. Tente novamente.");
                sc.nextLine();
            }
        }
        sc.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}