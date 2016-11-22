package com.example.mateus.gestaoautonomia.DAO;

import com.example.mateus.gestaoautonomia.Modelo.Abastecimento;

import java.util.ArrayList;

/**
 * Created by Mateus on 20/11/2016.
 */

public class RegistroDAO {

    private static ArrayList <Abastecimento> listaAbastecimentos;

    private static void inicializarLista(){
        if (RegistroDAO.listaAbastecimentos == null){
            RegistroDAO.listaAbastecimentos = new ArrayList<>();
        }
    }

    public static void salvar (Abastecimento abastecimento){
        inicializarLista();
        listaAbastecimentos.add(0, abastecimento);
    }

    public static ArrayList<Abastecimento> obterLista(){
        inicializarLista();
        return listaAbastecimentos;
    }

}
