package com.sig.repository.filter;

import com.sig.model.TipoEmpresa;

public class EmpresaFilter {

	private String nome;
	private String cpfOuCnpj;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public Object getCpfOuCnpjSemFormatacao() {
		return TipoEmpresa.removerFormatacao(this.cpfOuCnpj);
	}
	
}