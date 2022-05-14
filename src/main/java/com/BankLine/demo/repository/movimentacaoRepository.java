package com.BankLine.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankLine.demo.model.Movimentacao;

public interface movimentacaoRepository  extends JpaRepository<Movimentacao, Integer>{

}
