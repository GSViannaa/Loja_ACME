package com.LojaAcme;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AssinaturasService
{
    private Map<String,Assinatura> assinaturas =  new HashMap<String,Assinatura>();

    public void adicionarAssinatura(String nomeDoCliente,  Assinatura assinatura)
    {
        assinaturas.put(nomeDoCliente, assinatura);
    }

    public void cancelarAssinatura(String nomeDoCliente, LocalDate dataFim)
    {
        Assinatura assinatura = assinaturas.get(nomeDoCliente);

        if(assinatura != null )
        {
            assinatura.encerrar(dataFim);
        }
        else
        {
            System.out.println("Assinatura não encontrada");
        }
    }

}
