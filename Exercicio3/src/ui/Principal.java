package ui;

import java.util.Scanner;

public class Principal {

	private static Scanner scanf;

	public static void main(String[] args) {
		
		scanf = new Scanner(System.in);
		CursoCapacitacao curso = new CursoCapacitacao("Java Avançado",101,new Professor("Jefferson","Programação",1030));
		int opcao;
		
		do{
			System.out.println(" [1] - Incluir alunos\n [2] - Remover aluno\n"
					+ " [3] - Verificar se um aluno está matriculado\n [4] - Listar todos os alunos aprovados por Média\n"
					+ " [5] - Listar todos os alunos reprovados por falta\n [6] - Listar por ordem alfabética\n [0] - Sair\n Opção: ");
			opcao = scanf.nextInt();
			scanf.nextLine();
			switch (opcao){
				case 1 :{
						System.out.print("\tCadastro Aluno\n Insira o Nome: ");
						String nome = scanf.nextLine();
						System.out.print(" Insira a Matricula: ");
						int matricula = scanf.nextInt();
						System.out.print(" Insira a Média: ");
						float media = scanf.nextFloat();
						System.out.print(" Insira quantidade Falta: ");
						int falta = scanf.nextInt();
						curso.cadastraAluno(new Aluno(nome,matricula,media,falta));
						scanf.nextLine();
						break;
				}	case 2 :{
						int opcao2;
						do{
							System.out.print("\tRemover Aluno\n [1] - pelo Nome\n [2] - pela Matricula\n Opção: ");
							opcao2 = scanf.nextInt();
						}while(opcao2<1||opcao2>2);
						scanf.nextLine();
						if(opcao2==1){
							System.out.print(" Informe o Nome: ");
							String nome = scanf.nextLine();
							curso.removerAluno(nome);
						} else if(opcao2==2){
							System.out.print(" Informe a Matricula: ");
							int matricula = scanf.nextInt();
							curso.removerAluno(matricula);
							scanf.nextLine();
						}
						break;
				} 	case 3 :{
						System.out.print(" Informe a Matricula: ");
						int matricula = scanf.nextInt();
						if(curso.existeAluno(matricula)){
							System.out.println("Aluno está Matriculado");
						} else {
							System.out.println("Aluno não Matriculado");
						}
						scanf.nextLine();
						break;
				} 	case 4 :
						System.out.println(curso.listarAprovados());						
						break;
				case 5 :
						System.out.println(curso.listarReprovados());
						break;
				case 6 :						
						System.out.println(curso.listarAlunos());
						break;
				case 0 :
						break;
				default : 
						System.out.println("Opção Invalida!");
						break;
			}
			System.out.println("Pressione [Enter] para continuar");
			scanf.nextLine();
		}while(opcao!=0);
	}

}
