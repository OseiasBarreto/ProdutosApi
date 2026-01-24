package com.oseias.produtosapi.controller;

import com.oseias.produtosapi.model.Produto;
import com.oseias.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    //definir essa propriedade dentro da classe controller
    private ProdutoRepository produtoRepository;

    //gerar um contrutor para poder injetar a propriedade
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
        public Produto salvar(@RequestBody Produto produto){
            System.out.println( "Produto recebido: " + produto);

        //var que armazena um uuid gerado pelo próprio java
        var id = UUID.randomUUID().toString();
        produto.setId(id);

            produtoRepository.save(produto);
            return produto;


        }
}
