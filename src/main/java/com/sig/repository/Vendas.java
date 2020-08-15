package com.sig.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sig.model.Venda;
import com.sig.repository.helper.venda.VendasQueries;

public interface Vendas extends JpaRepository<Venda, Long>, VendasQueries {

}
