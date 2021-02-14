package com.segundoblogpessoal.blognoticias.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity /*cria a sua tabela*/
@Table (name = "postagem")  /* da o nome para sua tabela */
public class Postagem {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*define como primary key*/
	private long id;
	
	@NotNull	/*nao aceita nem um caracter*/
	@Size(min = 5, max = 100) /*minimo e total de caracter permitido porem nao é nescessario*/
	private String titulo;
	
	@NotNull
	@Size(min = 10, max = 500) /*minimo e total de caracter permitido porem nao é nescessario*/

	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis()); /* sempre importar java.util.Date */
																		/* sempre que passar um dado pela classe capitura o horario exato*/
	@ManyToOne  /*muitos para um*/
	@JsonIgnoreProperties("postagem")  /*quando chegar em postagem para de apresentar informação*/
	private Tema tema;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}
