package com.atividadeapp.atividadeapp.modells;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 9125277018717732648L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id_cliente;
	
	private String nome;
	private String email;
	private String telefone;
	
	
	
	public long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
