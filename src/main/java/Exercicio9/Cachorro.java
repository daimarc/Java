package Exercicio9;

public class Cachorro {
    //Crie uma classe chamada "Exercicio9.Cachorro" com os atributos "nome" e "raca". Implemente um método chamado "latir"
    // que exiba na tela o nome do cachorro e a mensagem "Au au!". Crie dois objetos dessa classe com nomes e raças diferentes e chame
    // o método "latir" para ambos.

    public String nome;
    public String raca;

    public Cachorro (String nome, String raca){
        this.nome = nome;
        this.raca = raca;

    }

    public void latir(){

        System.out.println(nome + " au au!");
    }

}
