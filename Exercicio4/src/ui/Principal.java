package ui;

import java.util.LinkedHashSet;
import java.util.TreeSet;

	/*
	 								PARECER AO FACEBOOK SOBRE ESTRUTURAS TREESET E LINKEDHASHSET
	 	
		Como consultor e com base nos conhecimentos que adquiridos, devo informa que a estrutura de dados (TreeSet), 
		utilizada no envio de mensagens do sistema do facebook � muito lento,pois tem complexidade de O(log(n)), 
		com isso o tempo de inser��o de 10 mensagens � diferente de inserir 1000 mensagens sendo o tempo muito maior,
		isso porque essa estrutura possui ordena��o na inser��o.
		Recomendo que utilize a estrutura de dados LinkedHashSet,
		pois algumas opera��es possuem o tempo constante,sendo assim o tempo de inserir 10 mensagens e 1000 mensagens tem uma diferen�a muito pequena,
		para melhor explica��o sobre as estruturas irei colocar um c�digo que mostrar� o tempo gasto para inserir em cada uma delas.

	*/
public class Principal {

	public static void main(String[] args) {		
			
		PerformanceEstrutura testeTree = new PerformanceEstrutura(new TreeSet<Integer>());
		long tempoTree = testeTree.testarPerformance();
		PerformanceEstrutura testeLinked = new PerformanceEstrutura(new LinkedHashSet<Integer>());
		long tempoLinked = testeLinked.testarPerformance();
		
		System.out.println("Tempo gasto do TreeSet: "+ tempoTree +" mils\nTempo gasto do LinkedHashSet: "+tempoLinked+" mils");
		
	}

}
