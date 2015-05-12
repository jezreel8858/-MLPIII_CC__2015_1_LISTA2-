package ui;

import java.util.Set;
import java.util.TreeSet;

public class Iventario{

	private Set<Item> itens;
	
	public Iventario(){
		this.itens= new TreeSet<Item>();
	}

	public Set<Item> getItens() {
		return itens;
	}
	public boolean existe(Item item){
		return itens.contains(item);
	}
}
