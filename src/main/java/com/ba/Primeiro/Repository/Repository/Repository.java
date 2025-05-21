package com.ba.Primeiro.Repository.Repository;

import com.ba.Primeiro.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Produto,String> {
  List<Produto> findByName(String name);

}
