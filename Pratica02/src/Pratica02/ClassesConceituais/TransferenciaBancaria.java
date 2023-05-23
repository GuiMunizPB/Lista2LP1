package Pratica02.ClassesConceituais;

import java.util.Scanner;
import Pratica02.Interface.Pagamento;

public class TransferenciaBancaria implements Pagamento {
    private double valorTransferencia;
    private String cpfDestino;
    private double saldoCorrente;

    public TransferenciaBancaria(double saldoCorrente) {
        this.saldoCorrente = saldoCorrente;
    }

    public void realizarPagamento() {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Valor da transferência: ");
        valorTransferencia = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer de entrada

        if (valorTransferencia <= saldoCorrente) {
            System.out.print("Informe o CPF de destino: ");
            cpfDestino = sc.nextLine();
        } 
    }
    
    public String gerarRecibo() {
        if (valorTransferencia <= saldoCorrente) {
                return "Transferência Bancária no valor de $" + valorTransferencia + " para a conta de CPF " + cpfDestino;
        } else {
            return "Transferência não realizada. Saldo insuficiente";
        }
    }

    public double getSaldoCorrente() {
        if(valorTransferencia <= saldoCorrente){
            return saldoCorrente-valorTransferencia;
        }
        else{
            return saldoCorrente;
        }
    }    
}