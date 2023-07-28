package Exercicio8;

import Exercicio8.pessoa;

public class main {
    public static void main(String[] args) {
        //Criando dois objetos (Exercicio8.pessoa e pessoa2) da classe Exercicio8.pessoa
        pessoa pessoa = new pessoa("Daimar", 37);
        pessoa pessoa2 = new pessoa("Ana", 23);
        //Chamando o método da classe Exercicio8.pessoa, para os 2 objetos
        pessoa.mostrarInformacoes();
        pessoa2.mostrarInformacoes();
    }

}
