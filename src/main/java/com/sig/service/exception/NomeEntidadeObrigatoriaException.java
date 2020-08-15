package com.sig.service.exception;

public class NomeEntidadeObrigatoriaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public NomeEntidadeObrigatoriaException(String message) {
		super(message);
	}

}
