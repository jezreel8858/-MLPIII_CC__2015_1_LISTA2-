package ui;

import java.util.Collection;
import java.util.Set;

public class PerformanceEstrutura {

	private Collection<Integer> teste;
	
	public PerformanceEstrutura(Set<Integer> colecao){
		teste = colecao;
	}
	
	public long testarPerformance(){
		
		long inicio = System.currentTimeMillis();
		int	 total = 5000;
		
		for(int x = total; x>=1 ; x--){
			teste.add(x);
		}
		for(int x=1;x<=total;x++){
			teste.contains(x);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		return tempo;
	}
}
