package aulas.classes.exercicio_2;

import java.util.Scanner;

public class BancoUna {

	public static void main(String[] args) {
		// Instânciando a classe Scanner e transformando em um objeto.
		Scanner inputTerminal = new Scanner(System.in);

		// Instânciando a classe ContaCorrente e transformando em um objeto.
		ContaCorrente minhaConta = new ContaCorrente();

		double valorDeposito = 0.0, valorSaque = 0.0;
		int agencia, conta;

		// Define o número da conta e da agência
		System.out.print("Digite o numero da conta: ");
		conta = inputTerminal.nextInt();
		System.out.print("Digite o numero da agência: ");
		agencia = inputTerminal.nextInt();

		minhaConta.inicializarContaCorrente(conta, agencia);

		// Permite que o usuário realize um depósito na conta
		System.out.print("Digite o valor do deposito: ");
		valorDeposito = inputTerminal.nextDouble();
		minhaConta.depositar(valorDeposito);

		// Permite que o usuário realize um saque na conta
		System.out.print("Digite o valor do saque: ");
		valorSaque = inputTerminal.nextDouble();
		minhaConta.sacar(valorSaque);

		// Imprime dados da conta
		minhaConta.exibe();

		inputTerminal.close();

	}

}