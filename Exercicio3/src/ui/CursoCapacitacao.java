package ui;

import java.util.Set;
import java.util.TreeSet;

public class CursoCapacitacao {

	private Set<Aluno> alunos;
	private Professor professor;
	private String nome;
	private int num_iden;
	
	public CursoCapacitacao(String nome,int iden,Professor professor){
		this.nome = nome;
		this.num_iden = iden;
		this.alunos = new TreeSet<>();
		this.professor = professor;
	}
	
	public void cadastraAluno(Aluno aluno){
		if(!existeAluno(aluno.getMatricula())){
			System.out.println(" Aluno Cadastrado com Sucesso");
			alunos.add(aluno);
		} else {
			System.out.println(" Erro!\nAluno já Cadastrado");
		}
		
	}
	public void removerAluno(Object cod){
		Aluno aluno = buscarAluno(cod);
		if(aluno!=null){
			alunos.remove(aluno);
		}
	}
	private Aluno buscarAluno(Object cod){
		if(cod instanceof String){
			for(Aluno aluno : alunos){
				if(aluno.getNome().equals(cod)){
					return aluno;
				}
			}
		} else if(cod instanceof Integer){
			for(Aluno aluno : alunos){
				if(aluno.getMatricula()==(int)cod){
					return aluno;
				}
			}
		}
		return null;
	}
	public boolean existeAluno(int matricula){
		Aluno aluno = buscarAluno(matricula);
		if(aluno!=null){
			return true;
		} 
		return false;
	}
	public String listarAprovados(){
		String strAprovados = "";
		for(Aluno aluno:alunos){
			if(aluno.getMedia()>=7){
				strAprovados += aluno;
			}
		}
		return strAprovados;
	}
	public String listarReprovados(){
		String strReprovados = "";
		for(Aluno aluno:alunos){
			if(aluno.getQtd_falta()>=15){
				strReprovados += aluno;
			}
		}
		return strReprovados;
	}
	public String listarAlunos(){
		if(alunos.isEmpty()){
			return "Não contem Alunos";
		}
		String strAprovados = "";
		for(Aluno aluno:alunos){
				strAprovados += aluno;
		}
		return strAprovados;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum_iden() {
		return num_iden;
	}

	public void setNum_iden(int num_iden) {
		this.num_iden = num_iden;
	}
	
	public String toString(){
		return String.format("\t Curso\nNome: %s\n Numero de Identificação: %d\n",this.nome,this.num_iden );
	}
	
}
