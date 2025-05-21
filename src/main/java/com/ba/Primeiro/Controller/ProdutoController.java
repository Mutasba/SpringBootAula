package com.ba.Primeiro.Controller;


import com.ba.Primeiro.Model.Produto;
import com.ba.Primeiro.Repository.Repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private Repository repository;

    public ProdutoController(Repository repository) {
        this.repository = repository;
    }
    @PostMapping
    public Produto salvar (@RequestBody Produto produto){

     String id = UUID.randomUUID().toString();
     produto.setId(id);

    repository.save(produto);
    return  produto;
    }
   @GetMapping("/{id}")
   public Produto buscar (@PathVariable("id") String id){
        return repository.findById(id).orElse(null);
    };
    @GetMapping("all")
   public List <Produto> BuscarTodos(){
       return repository.findAll();
   };
    @PutMapping("/{id}")
   public void update(@PathVariable("id") String id ,@RequestBody Produto produto){
        produto.setId(id);
     repository.save(produto);
   };
    @GetMapping("/name")
    public  List<Produto>buscarPorNOme(@RequestParam("name") String name){
        return repository.findByName(name);
    }
}
