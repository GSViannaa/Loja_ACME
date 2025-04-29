package com.LojaAcme;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Cliente
{
    private String nome;

    @Override
    public  String toString()
    {
        return "Cliente{" + "nome=" + nome + '\'' + '}';
    }

    public Pagamento realizarCompra(List<Produto> produto)
    {
        LocalDate dataCompra = LocalDate.now();

        return new Pagamento(produto, dataCompra, this);
    }

    public Assinatura realizarAssinatura(BigDecimal mensalidade, Cliente cliente)
    {
        LocalDate inicio =  LocalDate.now();
       return new Assinatura(mensalidade, inicio, this);
    }

}
