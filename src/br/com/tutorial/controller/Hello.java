package br.com.tutorial.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped // chama essas informações na web
@ManagedBean // objeto de controle 
public class Hello {

	private String nome="Vitória";
	private String dataNascimento="20/08/1999";
	private String idade="20";
	private String informacao = "Exemplo de passagem de parâmetro";
	
	
	
	
	@PostConstruct // primeira instrução após a contrução 
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
