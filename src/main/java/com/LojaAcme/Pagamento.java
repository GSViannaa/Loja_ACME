package com.LojaAcme;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Pagamento
{
    private List<Produto> produtos;
    private LocalDate dataCompra;
    private Cliente cliente;

    @Override
    public String toString()
    {
        return "Pagamento{" + "produtos=" + produtos + ", DataCompra=" + dataCompra + ", cliente=" + cliente + '}';
    }

}
