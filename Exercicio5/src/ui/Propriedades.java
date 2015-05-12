package ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Propriedades{
	
	private Properties configBD;
	private InputStream input;
	private String caminho = "database/database.properties";
	private String url;
	private String database;
	private String usuario;
	private String senha;
	private int porta;
	
	public Propriedades() throws IOException{
		configBD = new Properties();
		input = getClass().getClassLoader().getResourceAsStream(caminho);
		configBD.load(input);		
	}
		
	public static void main(String[] args) throws IOException {
		
		Propriedades conexao = new Propriedades();
		conexao.carregarValores();
		System.out.println(conexao);
	}
	
	public void carregarValores(){
		this.url = configBD.getProperty("conexao.url");
		this.database = configBD.getProperty("conexao.database");
		this.usuario = configBD.getProperty("conexao.usuario");
		this.senha = configBD.getProperty("conexao.senha");
		this.porta = Integer.parseInt(configBD.getProperty("conexao.porta"));
	}
	
	public String toString(){
		return String.format(" url: %s\n database: %s\n usuario: %s\n senha: %s\n porta: %d",url,database,usuario,senha,porta);
	}
	
}
