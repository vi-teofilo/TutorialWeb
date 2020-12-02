package br.com.tutorial.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped // chama essas informa��es na web
@ManagedBean // objeto de controle 
public class Hello {

	private String nome="Vit�ria";
	private String dataNascimento="20/08/1999";
	private String idade="20";
	private String informacao = "Exemplo de passagem de par�metro";
	
	
	
	
	@PostConstruct // primeira instru��o ap�s a contru��o 
	public void init() {
		System.out.println("Bean iniciado!");
	}
	public  String getMessage() {
		return "Hello World!";
	}
	
	public String getInformacao() {
		return informacao;
	}
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getIdade() {
		return idade;
	}
	
	
}
