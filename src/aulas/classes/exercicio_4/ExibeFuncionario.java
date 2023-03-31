package aulas.classes.exercicio_4;

import java.util.Scanner;

public class ExibeFuncionario {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Funcionario funcionario = new Funcionario();
    Scanner scanner = new Scanner(System.in);

    String nome, cargo, endereco;
    double salario;
    int idade;

    System.out.print("Digite o nome do funcionário: ");
    nome = scanner.nextLine();

    System.out.print("Digite a idade do funcionário: ");
    idade = scanner.nextInt();

    System.out.print("Digite o cargo do funcionário: ");
    cargo = scanner.next();

    System.out.print("Digite o salario do funcionário: ");
    salario = scanner.nextDouble();

    System.out.print("Digite o endereço do funcionário: ");
    endereco = scanner.next();

    funcionario.cadastrarFuncionario(nome, idade, cargo, salario, endereco);
    funcionario.exibe();

    scanner.close();
  }

}
