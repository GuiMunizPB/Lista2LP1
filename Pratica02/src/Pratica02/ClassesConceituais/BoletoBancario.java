package Pratica02.ClassesConceituais;
import Pratica02.Interface.Pagamento;
import java.util.Scanner;

public class BoletoBancario implements Pagamento {
    private double valorTransferencia;
    private String cnpjDestino;
    private double saldoCorrente;

    public BoletoBancario(double saldoCorrente) {
        this.saldoCorrente = saldoCorrente;
    }

    public void realizarPagamento() {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Valor do boleto: ");
        valorTransferencia = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer de entrada

        if (valorTransferencia <= saldoCorrente) {
            System.out.print("Informe o CNPJ de destino: ");
            cnpjDestino = sc.nextLine();
        } 
    }
    
    public String gerarRecibo() {
        if (valorTransferencia <= saldoCorrente) {
                return "Boleto bancário no valor de $" + valorTransferencia + " pago com sucesso para a empresa de CNPJ " + cnpjDestino;
        } else {
            return "Não foi possível pagar o boleto bancário. Saldo insuficiente";
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