package ui;


public class ContaPoupanca extends Conta {

	public ContaPoupanca(String numero,double saldo){
		super(numero,saldo);
	}
	
	public boolean creditarTaxaConta(double valor){
		if(valor>0){			
			this.saldo +=  (valor * this.saldo)*3;		
			return true;
		}
		return false;
	}

}
