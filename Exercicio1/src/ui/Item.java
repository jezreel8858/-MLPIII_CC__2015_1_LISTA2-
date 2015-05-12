package ui;

public class Item implements Comparable<Item> {

	private String codigo;
	private String descricao;
	
	public Item(String codigo,String descricao){
		this.codigo=codigo;
		this.descricao=descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean equals(String codigo){
		if(this.codigo.equals(codigo)){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return String.format("\nCodigo: %s\nDescrição: %s\n",this.codigo,this.descricao);
	}

	@Override
	public int compareTo(Item item) {
		return this.codigo.compareTo(((Item)item).codigo);
	}
	
}
