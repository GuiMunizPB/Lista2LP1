// A classe Televisão e ControleRemoto tem um relacionamento de Associação
package Prática03.ClasseConceitos;
public class Televisão {
    private int volume;
    private int canal;

    public Televisão(){
        volume = 0;
        canal = 1;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }
    public void aumentarVolume() {
        volume += 1;
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume-=1;
        }
        else{
            System.out.println("Operação inválida");
        }
    }

    public void aumentarCanal(){
        canal+=1;
    }
    public void diminuirCanal(){
        if(canal>1){
            canal -=1;
        }
        else{
            System.out.println("Operação inválida");
        }
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
