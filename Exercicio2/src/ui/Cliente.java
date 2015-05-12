package ui;

public class Cliente extends Pessoa{

	protected ContaPoupanca contaPoupanca;
	protected ContaCorrente contaCorrente;
	
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
	}	
	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
}