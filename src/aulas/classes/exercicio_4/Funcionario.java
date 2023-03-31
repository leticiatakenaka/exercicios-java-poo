package aulas.classes.exercicio_4;

public class Funcionario {

  // ❖ Crie uma classe Funcionário que possua os seguintes atributos:
  // ➢ Nome,
  // ➢ Idade,
  // ➢ Cargo,
  // ➢ Salário
  // ➢ Endereço.
  private String nomeFuncionario, cargoFuncionario, enderecoFuncionario;
  private int idadeFuncionario;
  private double salarioFuncionario;

  public void cadastrarFuncionario(String nome, int idade, String cargo, double salario, String endereco) {
    nomeFuncionario = nome;
    idadeFuncionario = idade;
    cargoFuncionario = cargo;
    salarioFuncionario = salario;
    enderecoFuncionario = endereco;
  }

  public void exibe() {
    System.out.format("\nNome: %s\nIdade: %s\nCargo: %s\nSalario: %s\nEndereço: %s", nomeFuncionario, idadeFuncionario,
        cargoFuncionario, salarioFuncionario,
        enderecoFuncionario);
  }

}
