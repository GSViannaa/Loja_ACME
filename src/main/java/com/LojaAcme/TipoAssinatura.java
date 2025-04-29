package com.LojaAcme;

import java.math.BigDecimal;

public enum TipoAssinatura
{
    PADRAO(new BigDecimal("99.98")),
    PLUS(new BigDecimal("110.99")),
    PREMIUM(new BigDecimal("149.99"));

    private final BigDecimal ValorMensalidade;

    TipoAssinatura(BigDecimal valorMensalidae)
    {
        this.ValorMensalidade = valorMensalidae;
    }

    public BigDecimal getValorMensalidade()
    {
        return ValorMensalidade;
    }
}
