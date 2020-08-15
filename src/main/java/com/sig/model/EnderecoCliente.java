package com.sig.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Embeddable
public class EnderecoCliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "cli_st_logradouro")
	private String logradouro;
	
	@Column(name = "cli_st_numero")
	private String numero;
	
	@Column(name = "cli_st_complemento")
	private String complemento;
	
	@Column(name = "cli_st_cep")
	private String cep;
	
	@Column(name = "cli_st_bairro")
	private String bairro;
	
	@Column(name = "cli_st_pais")
	private String pais;
	
	@ManyToOne
	@JoinColumn(name = "cid_in_codigo")
	private Cidade cidade;
	
	@Transient
	private Estado estado;
	
	public EnderecoCliente() {
	}

	public EnderecoCliente(String logradouro, String numero, String complemento, String cep, String bairro, String pais,
			Cidade cidade, Estado estado) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.pais = pais;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getNomeCidadeSiglaEstado() {
		if (this.cidade != null) {
			return this.cidade.getNome() + "/" + this.cidade.getEstado().getSigla();
		}
		
		return null;
	}
	
}