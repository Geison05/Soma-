import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new  Scanner (System.in);
    //Decalarção de Variavel
    int primeiraParcela = 0;
    int segundaParcela = 0;
    int soma = 0;
    //Entrada de dados
    System.out.print("Digite o primeiro número inteiro :");
    primeiraParcela = leitor.nextInt();
    System.out.print("\nDigite o segundo número inteiro :");
    segundaParcela = leitor.nextInt();
    //Processamento
    soma = primeiraParcela + segundaParcela;
    //Saida
    System.out.print("\nSoma = "+soma);
  }
}