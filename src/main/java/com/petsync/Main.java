package com.petsync;

import com.petsync.util.ConnectionFactory;

public class Main {

    public static void main(String[] args) {

        try {

            ConnectionFactory.getConnection();

            System.out.println("Conexão realizada com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro ao conectar!");
            e.printStackTrace();
        }
    }
}