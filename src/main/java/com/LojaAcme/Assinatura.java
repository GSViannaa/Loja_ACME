package com.LojaAcme;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor

public class Assinatura
{

    private BigDecimal mensalidade;
    private LocalDate inicio;
    private Cliente cliente;
    private LocalDate fim;

    public Assinatura(BigDecimal mensalidade, LocalDate inicio, Cliente cliente)
    {
        this.mensalidade = mensalidade;
        this.inicio = inicio;
        this.cliente = cliente;
    }


    @Override
    public String toString()
    {
        return "Assinatura{" + "mensalidade=" + mensalidade + ", inicio=" + inicio + ", fim=" + fim + ", cliente=" + cliente + '}';
    }

}
