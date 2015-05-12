package ui;

public class Principal {

	public static void main(String[] args) {
		
		Iventario colecao = new Iventario();
		
		Item treloso = new Item("03", "biscoito");
		Item pipos = new Item("01", "pipoca");
		Item caju = new Item("07", "fruta");
		Item arroz = new Item("04", "urbano");
		Item teste = new Item("010","teste");
		
		colecao.getItens().add(treloso);
		colecao.getItens().add(pipos);
		colecao.getItens().add(caju);
		colecao.getItens().add(arroz);		
		
		if(colecao.getItens().isEmpty()){
			System.out.println("Coleção Vazia!");
		} else {
			System.out.println(colecao.getItens());
		}
		
		if(!colecao.existe(teste)){
			System.out.println("Item não pertence ao Iventario");
		}
		
	}

}
