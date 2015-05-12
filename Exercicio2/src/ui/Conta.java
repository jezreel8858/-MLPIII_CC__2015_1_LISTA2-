package ui;

public abstract class Conta {

	protected String numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(String numero,double saldo){
		this.numero = numero;
		creditarConta(saldo);
	}
	
	public boolean creditarConta(double valor){
		if(valor>0){
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean debitarConta(double valor){
		if(valor>0){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public boolean creditarTaxaConta(double valor){
		if(valor>0){			
			this.saldo +=  (valor * this.saldo);		
			return true;
		}
		return false;
	}
	
	public String toString(){
		return String.format("Numero: %s\tSaldo: %.2f",numero,saldo);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	public boolean equals(Conta conta){
		return this.numero.equals(conta.getNumero());
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
