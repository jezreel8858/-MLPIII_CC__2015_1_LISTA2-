package ui;


public class Professor {
	private String nome;
	private String especialidade;
	private int matricula;
	
	public Professor(String nome,String especialidade,int matricula) {
		this.nome=nome;
		this.especialidade=especialidade;
		this.matricula=matricula;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
