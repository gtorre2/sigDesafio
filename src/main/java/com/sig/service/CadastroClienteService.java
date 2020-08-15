package com.sig.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sig.model.Cliente;
import com.sig.repository.Clientes;
import com.sig.service.exception.CpfCnpjClienteJaCadastradoException;

@Service
public class CadastroClienteService {

	@Autowired
	private Clientes clientes;
	
	@Transactional
	public void salvar(Cliente cliente) {
		Optional<Cliente> clienteExistente = clientes.findByCpfOuCnpj(cliente.getCpfOuCnpjSemFormatacao());
		if (cliente.isNovo() && clienteExistente.isPresent()) {
			throw new CpfCnpjClienteJaCadastradoException("CPF/CNPJ já cadastrado");
		}
		
		clientes.save(cliente);
	}
	
	@Transactional
	public Cliente buscarClientePorCodigo(Cliente cliente) {
		Optional<Cliente> clienteExistente = clientes.findById(cliente.getCodigo());
		if(clienteExistente.isPresent()) {
			return clienteExistente.get();
		} else {
			return null;
		}
	}
	
	@Transactional
	public Cliente buscarDocumentoCliente(String documento) {
		Optional<Cliente> clienteExistente = clientes.findByCpfOuCnpj(documento);
		if(clienteExistente.isPresent()) {
			return clienteExistente.get();
		} else {
			return null;
		}
	}
	
	@Transactional
	public List<Cliente> buscarPorNome(String nome) {
		List<Cliente> clienteExistente = clientes.findByNomeStartingWithIgnoreCase(nome);
		if(!clienteExistente.isEmpty()) {
			return clienteExistente;
		} else {
			return new ArrayList<Cliente>();
		}
	}
	
	@Transactional
	public void alterarStatus(Long[] codigos, StatusCliente statusCliente) {
		statusCliente.executar(codigos, clientes);
	}
	
}
