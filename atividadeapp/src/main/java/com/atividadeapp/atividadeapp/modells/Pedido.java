package com.atividadeapp.atividadeapp.modells;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigoNotaFiscal;
	
	private String data;
	private float valorTotal;
	private String fk_func;
	private String fk_cliente;
	
	
	
	
	public long getCodigoNotaFiscal() {
		return codigoNotaFiscal;
	}
	public void setCodigoNotaFiscal(long codigoNotaFiscal) {
		this.codigoNotaFiscal = codigoNotaFiscal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getFk_func() {
		return fk_func;
	}
	public void setFk_func(String fk_func) {
		this.fk_func = fk_func;
	}
	public String getFk_cliente() {
		return fk_cliente;
	}
	public void setFk_cliente(String fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
	
	

}
