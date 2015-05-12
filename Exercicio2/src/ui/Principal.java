package ui;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaCorrente jezreel = new ContaCorrente("1250-900505",100.f);
		ContaCorrente joao = new ContaCorrente("1250-800966",100.f);
		ContaCorrente alysson = new ContaCorrente("1250-300212",100.f);
		
		Map<String,ContaCorrente> conta = new TreeMap<>();
		Set<Map.Entry<String,ContaCorrente>> set = conta.entrySet();
		
		conta.put("gerente", jezreel);
		conta.put("diretor", joao);
		conta.put("chefe", alysson);
		
		for(Map.Entry<String, ContaCorrente> me : set){
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
	}

}
