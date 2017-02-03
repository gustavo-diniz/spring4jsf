package br.com.gustavodiniz.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

@Component
@ManagedBean(name="exemploMB")
@SessionScoped
public class ExemploMB implements Serializable{

	private static final long serialVersionUID = 1L;
	private String textoResposta;
	private String textoNome;

	public void geraTexto() {
		textoResposta = "Olá, seja bem vindo "+textoNome;
	}

	public String getTextoResposta() {
		return textoResposta;
	}

	public void setTextoResposta(String textoResposta) {
		this.textoResposta = textoResposta;
	}

	public String getTextoNome() {
		return textoNome;
	}

	public void setTextoNome(String textoNome) {
		this.textoNome = textoNome;
	}

}