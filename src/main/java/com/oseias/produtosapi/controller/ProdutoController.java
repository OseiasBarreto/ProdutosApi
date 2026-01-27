package com.oseias.produtosapi.controller;

import com.oseias.produtosapi.model.Produto;
import com.oseias.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

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


        //metodo publico que vai retornar um produto que recebe como parametro o id
        @GetMapping("{id}")
        public Produto buscarPorId (@PathVariable("id") String id){
            return produtoRepository.findById(id).orElse(null);

        }

        //metodo publico void que usa o id como parametro para deletar
        //a anotação define como id, o metodo especifica o caminho e o repository recebe o parametro.
        @DeleteMapping("{id}")
        public void deletePorId (@PathVariable("id")String id ){
            produtoRepository.deleteById(id);
        }
}
