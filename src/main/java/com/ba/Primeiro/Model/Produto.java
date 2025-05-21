package com.ba.Primeiro.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Produtos")
public class Produto {
    @Id
    @Column(name = "id")
    private String id ;
    @Column
    private String name;
    @Column
    private String descricao;
    @Column
    private double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
