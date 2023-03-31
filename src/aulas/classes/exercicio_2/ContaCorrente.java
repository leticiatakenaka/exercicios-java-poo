package aulas.classes.exercicio_2;

public class ContaCorrente {
	private int numeroConta, agenciaConta;
	private double saldo;

	public void inicializarContaCorrente(int conta, int agencia) {
		numeroConta = conta;
		agenciaConta = agencia;
		saldo = 0;
	}

	public void sacar(double valor) {
		if (valor < saldo) {
			saldo = saldo - valor;
			return;
		}
		System.out.println("Não é possível sacar um valor maior do que o saldo!");
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double consultarSaldo() {
		return saldo;
	}

	// Implemente o método exibe() na classe ContaCorrente que retorne os dados da
	// conta:
	// ➢ Agência: agencia
	// ➢ Conta: conta
	// ➢ Saldo: R$ saldo.
	public void exibe() {
		System.out.format("Agência:  %s | Conta: %s\nSaldo: R$ %.2f", agenciaConta, numeroConta, saldo);
	}
}