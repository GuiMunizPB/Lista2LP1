// A classe Televisão e ControleRemoto tem um relacionamento de Associação
package Prática03.ClasseConceitos;
public class ControleRemoto{
    private Televisão televisao;

    public ControleRemoto(Televisão televisao) {
        this.televisao = televisao;
    }

    public void aumentarVolume() {
        televisao.aumentarVolume();
    }

    public void diminuirVolume() {
        televisao.diminuirVolume();
    }

    public void trocarCanal(int novoCanal) {
        televisao.trocarCanal(novoCanal);
    }

    public int getVolume() {
        return televisao.getVolume();
    }

    public int getCanal() {
        return televisao.getCanal();
    }

    public void aumentarCanal(){
        televisao.aumentarCanal();
    }
    public void diminuirCanal(){
        televisao.diminuirCanal();
    }

}
