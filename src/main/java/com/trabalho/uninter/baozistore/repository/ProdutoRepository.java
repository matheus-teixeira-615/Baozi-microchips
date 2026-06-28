package com.trabalho.uninter.baozistore.repository;

import com.trabalho.uninter.baozistore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
