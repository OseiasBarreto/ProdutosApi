package com.oseias.produtosapi.repository;

import com.oseias.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


//extender a interface para JPA, informando qual a entidade e qual o tipo do id
public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
