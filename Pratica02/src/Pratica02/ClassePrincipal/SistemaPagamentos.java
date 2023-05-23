package Pratica02.ClassePrincipal;

import java.util.Scanner;
import Pratica02.Interface.Pagamento;
import Pratica02.ClassesConceituais.CartaoCredito;
import Pratica02.ClassesConceituais.TransferenciaBancaria;
import Pratica02.ClassesConceituais.BoletoBancario;

public class SistemaPagamentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double limiteCredito = 0.0;
        double saldoCorrente = 0.0;

        while (true) {
            clearScreen();
            exibirMenu();

            try {
                int opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        clearScreen();
                        if (limiteCredito == 0.0) {
                            System.out.println("========= CARTÃO DE CRÉDITO ========");
                            System.out.print("Informe o limite de crédito: ");
                            limiteCredito = sc.nextDouble();
                            sc.nextLine();
                        }
                        else{
                            System.out.println("========= CARTÃO DE CRÉDITO ========");
                            System.out.println("Limite de crédito atual: " + limiteCredito);
                        }
                    
                        Pagamento cartaoCredito = new CartaoCredito(limiteCredito);
                        cartaoCredito.realizarPagamento();
                        limiteCredito = ((CartaoCredito) cartaoCredito).getLimiteCredito();
                        String reciboCartaoCredito = cartaoCredito.gerarRecibo();
                        System.out.println("\n============== RECIBO ==============");
                        System.out.println("Recibo: " + reciboCartaoCredito);
                        System.out.println("====================================");
                        Thread.sleep(10000);
                        break;
                    case 2:
                        clearScreen();
                        if (saldoCorrente == 0.0) {
                            System.out.println("======= TRANSFERÊNCIA BANCÁRIA ======");
                            System.out.print("Informe o valor do saldo corrente: ");
                            saldoCorrente = sc.nextDouble();
                            sc.nextLine();
                        }
                        else{
                            System.out.println("====== TRANSFERÊNCIA BANCÁRIA ========");
                            System.out.println("Saldo corrente atual: " + saldoCorrente);
                        }
                        
                        Pagamento transBancaria = new TransferenciaBancaria(saldoCorrente);
                        transBancaria.realizarPagamento();
                        saldoCorrente = ((TransferenciaBancaria) transBancaria).getSaldoCorrente();
                        String reciboTransBancaria = transBancaria.gerarRecibo();
                        System.out.println("\n============== RECIBO ==============");
                        System.out.println("Recibo: " + reciboTransBancaria);
                        System.out.println("====================================");
                        Thread.sleep(10000);
                        clearScreen();
                        break;
                    case 3:
                        clearScreen();
                        if (saldoCorrente == 0.0) {
                            System.out.println("======== BOLETO BANCÁRIO ========");
                            System.out.print("Informe o valor do saldo corrente: ");
                            saldoCorrente = sc.nextDouble();
                            sc.nextLine();
                        }
                        else{
                            System.out.println("======== BOLETO BANCÁRIO =========");
                            System.out.println("Saldo corrente atual: " + saldoCorrente);
                        }
                        
                        Pagamento boletoBancario = new BoletoBancario(saldoCorrente);
                        boletoBancario.realizarPagamento();
                        saldoCorrente = ((BoletoBancario) boletoBancario).getSaldoCorrente();
                        String reciboBoletoBancario = boletoBancario.gerarRecibo();
                        System.out.println("\n============== RECIBO ===========");
                        System.out.println("Recibo: " + reciboBoletoBancario);
                        System.out.println("=================================");
                        Thread.sleep(10000);
                        break;
                    case 4:
                        System.out.println("Encerrando o sistema...");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        Thread.sleep(2000);
                }
            } catch (Exception e) {
                System.out.println("Erro: opção inválida. Tente novamente.");
                sc.nextLine();
            }
            
        }
    }

    public static void exibirMenu() {
        System.out.println("===== Bem-vindo ao Sistema de Pagamentos =====");
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - Realizar pagamento com Cartão de Crédito");
        System.out.println("2 - Realizar pagamento com Transferência Bancária");
        System.out.println("3 - Realizar pagamento com Boleto Bancário");
        System.out.println("4 - Sair");
        System.out.println("==============================================");
        System.out.print("Opção: ");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
