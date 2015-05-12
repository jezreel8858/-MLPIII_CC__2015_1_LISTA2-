package ui;

public class Aluno implements Comparable<Aluno> {

	protected String nome;
	protected int matricula;
	protected float  media;
	protected int qtd_falta;
	
	public Aluno(String nome,int matricula,float media,int qtd_falta) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
		this.qtd_falta = qtd_falta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public int getQtd_falta() {
		return qtd_falta;
	}

	public void setQtd_falta(int qtd_falta) {
		this.qtd_falta = qtd_falta;
	}
	
	
	public String toString(){
		return String.format("Nome: %s\nMatricula: %d\nMedia: %.2f\nFalta: %d\n\n",nome,matricula,media,qtd_falta);
	}

	@Override
	public int compareTo(Aluno aluno) {
		return this.getNome().compareTo(aluno.getNome());
	}

}
