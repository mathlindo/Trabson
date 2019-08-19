
public class Main {

public static void main(String[] args) {


Pessoa pessoa1 = new Pessoa(1, "Maria", 9, "F");
Pessoa pessoa2 = new Pessoa(2, "João", 19, "M");

//////////////////////////////////////////////////////////////////////////////////////

Endereco endereco1 = new Endereco(1, "Verônica Maria da Luz", "Barra", 12);
Endereco endereco2 = new Endereco(2, "João de Barro", "Quadrinhos", 80);

/////////////////////////////////////////////////////////////////////////////////

System.out.println("O nome da pessoa 1 " + pessoa1.getNome() + ".");
System.out.println("Idade da pessoa 1 " + pessoa1.getIdade() + " anos.");
System.out.println("Sexo da pessoa 1 " + pessoa1.getSexo() + ".");
System.out.println("Rua da pessoa 1 " + endereco1.getRua() + ".");
System.out.println("Bairro da pessoa 1 " + endereco1.getBairro() + ".");
System.out.println("O numero da casa da pessoa 1 " + endereco1.getNumero() + ". \n");

////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("O nome da pessoa 2 " + pessoa2.getNome() + ".");
System.out.println("Idade da pessoa 2 " + pessoa2.getIdade() + " anos.");
System.out.println("Sexo da pessoa 2 " + pessoa2.getSexo() + ".");
System.out.println("Rua da pessoa 2" + endereco2.getRua() + ".");
System.out.println("Bairro da pessoa 2 " + endereco2.getBairro() + ".");
System.out.println("O numero da casa da pessoa 2 " + endereco2.getNumero() + ".");



}
}