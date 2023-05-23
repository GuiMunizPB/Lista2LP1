package Pratica02.ClassesConceituais;

import java.util.Scanner;
import Pratica02.Interface.Pagamento;

public class CartaoCredito implements Pagamento {
    private double limiteCredito;
    private double valorPagamento;
    private int numParcelas;
    private double valorParcela;
    private String opcaoParcelamento;

    public CartaoCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void realizarPagamento() {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Valor do pagamento: ");
        valorPagamento = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer de entrada
    
        if (valorPagamento <= limiteCredito) {
            String opcaoParcelamento;
            boolean respostaValida = false;
    
            while (!respostaValida) {
                System.out.print("Deseja parcelar o pagamento? (S/N): ");
                opcaoParcelamento = sc.nextLine();
    
                if (opcaoParcelamento.equalsIgnoreCase("S")) {
                    numParcelas = 0;
    
                    while (numParcelas <= 0 || numParcelas > 12) {
                        System.out.print("Quantidade de parcelas (entre 1 e 12): ");
                        numParcelas = sc.nextInt();
                        sc.nextLine(); // Limpar o buffer de entrada
                    }
    
                    valorParcela = valorPagamento / numParcelas;
                    respostaValida = true;
                } else if (opcaoParcelamento.equalsIgnoreCase("N")) {
                    numParcelas = 1;
                    valorParcela = valorPagamento;
                    respostaValida = true;
                } else {
                    System.out.println("Resposta inválida. Por favor, responda apenas com 'S' ou 'N'.");
                }
            }
        }
    }
    
    public String gerarRecibo() {
        if (valorPagamento <= limiteCredito) {
            if (numParcelas > 1) {
                return "Pagamento com cartão de crédito no valor de R$" + valorPagamento + " parcelado em " + numParcelas + " vezes de R$" + valorParcela + " cada.";
            } else {
                return "Pagamento com cartão de crédito no valor de R$" + valorPagamento;
            }
        } else {
            return "Pagamento não realizado. Limite de crédito insuficiente";
        }
    }

    public double getLimiteCredito() {
        if(valorPagamento <= limiteCredito){
            return limiteCredito-valorPagamento;
        }
        else{
            return limiteCredito;
        }
    }    
}


