package ui;


public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {
	
	public ContaCorrente(String numero,double saldo){
		super(numero,saldo);
	}
	
	public boolean creditarTaxaConta(double valor){
		if(valor>0){			
			this.saldo +=  (((valor * 2)/100 * this.saldo));		
			return true;
		}
		return false;
	}
	
	public boolean creditarConta(double valor){
		if(valor>0){
			this.saldo += valor;
			this.saldo -= 0.10;
			return true;
		}
		return false;
	}
	
	public int compareTo(ContaCorrente conta){
		
		if(this.saldo > conta.getSaldo()){
			return 1;
		} else if(this.saldo < conta.getSaldo()){
			return -1;
		}
		return 0;
	}
	
	
}
