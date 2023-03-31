package aulas.classes.exercicio_1;

import java.util.Scanner;

public class CalculaAreaRetangulo_OO {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Retangulo objetoRetangulo = new Retangulo();

    System.out.print("Digite a altura do retângulo: ");
    float altura = sc.nextFloat();

    System.out.print("Digite a largura do retângulo: ");
    float largura = sc.nextFloat();

    objetoRetangulo.gravarAlturaLarguraRetangulo(altura, largura);

    objetoRetangulo.exibe(altura, largura, objetoRetangulo.calculaAreaRetangulo(),
        objetoRetangulo.calculaPerimetroRetangulo());

    sc.close();
  }
}