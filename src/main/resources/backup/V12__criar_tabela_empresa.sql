CREATE TABLE glo_empresa (
	emp_in_codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	cid_in_codigo BIGINT(20) NOT NULL,
	emp_st_nome VARCHAR(50) NOT NULL,
	emp_st_tipo VARCHAR(15) NOT NULL,
	emp_st_apelido VARCHAR(50) NOT NULL,
	emp_st_cpf_cnpj VARCHAR(30) NOT NULL,
	emp_st_logradouro VARCHAR(50) NOT NULL,
	emp_st_numero VARCHAR(15) NULL,
	emp_st_complemento VARCHAR(20) NULL,
	emp_st_bairro VARCHAR(50) NOT NULL,
	emp_st_cep VARCHAR(15) NOT NULL,
	emp_st_pais VARCHAR(50) NOT NULL,
	emp_st_telefone VARCHAR(20) NOT NULL,
	emp_st_email VARCHAR(50) NOT NULL,
	emp_st_inscricao_estadual VARCHAR(20) NOT NULL,
	emp_st_regime_tributario VARCHAR(50) NULL,
	emp_st_observacao VARCHAR(255) NULL,
	FOREIGN KEY (cid_in_codigo) REFERENCES cidade(codigo)
);