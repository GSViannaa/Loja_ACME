package com.LojaAcme;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class LojaAcme
{
    public static void main(String[] args)
    {
        Faker faker = new Faker();

        Map<String, Assinatura> assinaturas = new HashMap<String, Assinatura>();

       Produto musicaRock = new Produto("Rock Metal", "/musicas/RockMetal.mp3", new BigDecimal("50.0"));
       Produto videoEsporte = new Produto("Celtics X Magic", "/videos/CelticsXMagic.mp4", new BigDecimal("19.9"));
       Produto fotoAutografada = new Produto("Foto Autográfada", "/fotos/fotoAutografada.png", new BigDecimal("5.0"));


       Cliente cliente= new Cliente(faker.name().fullName());


    }

}