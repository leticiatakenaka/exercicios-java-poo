package aulas.classes.exemplo_1;

public class ContaCorrente {
	private int numeroConta, agenciaConta;
	private double saldo;

	public void inicializarContaCorrente(int conta, int agencia) {
		numeroConta = conta;
		agenciaConta = agencia;
		saldo = 0;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
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
	public void exibe(int agencia, int conta, int saldo) {
		System.out.format("Agência:  %.3", agencia);
		System.out.format("Conta:  %.3", conta);
		System.out.format("Saldo:  %.3", saldo);
	}
}