package com.sig.service;

import com.sig.repository.Clientes;

public enum StatusCliente {

	ATIVAR {
		@Override
		public void executar(Long[] codigos, Clientes clientes) {
			clientes.findByCodigoIn(codigos).forEach(u -> u.setAtivo(true));
		}
	},
	
	DESATIVAR {
		@Override
		public void executar(Long[] codigos, Clientes clientes) {
			clientes.findByCodigoIn(codigos).forEach(u -> u.setAtivo(false));
		}
	};
	
	public abstract void executar(Long[] codigos, Clientes clientes);
	
}
