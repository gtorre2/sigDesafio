package com.sig.dto;

import java.math.BigDecimal;

public class ProdutoDTO {

	private Long codigo;
	private String sku;
	private String nome;
	private BigDecimal valor;
	
	public ProdutoDTO(Long codigo, String sku, String nome, BigDecimal valor) {
		this.codigo = codigo;
		this.sku = sku;
		this.nome = nome;
		this.valor = valor;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
