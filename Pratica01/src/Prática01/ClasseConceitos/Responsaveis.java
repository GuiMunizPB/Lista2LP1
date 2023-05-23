package Prática01.ClasseConceitos;

public class Responsaveis extends Pessoa{

        public Responsaveis(String nome, String email, long telefone) {
            super(nome, email, telefone);
        }

        public void mostrarResponsaveis(){
        System.out.println("Nome do responsável: " + this.getNome());
        System.out.println("Email do responsável: " + this.getEmail());
        System.out.println("Telefone do responsável: " + this.getTelefone());
        System.out.println("---------------------");
    }

    }

