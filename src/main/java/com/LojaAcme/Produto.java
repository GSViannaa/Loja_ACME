package com.LojaAcme;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor

public class Produto
{
    private String nome;
    private String pathFile;
    private BigDecimal preco;


    @Override
    public String toString()
    {
        return "Produtos{" + "nome=" + nome + ", pathFile=" + pathFile + ", preco=" + preco + '}';
    }
}
