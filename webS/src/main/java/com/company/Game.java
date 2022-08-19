package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Game {
    public static void main(String[] args) throws IOException {
        Pokemon pokemon = new Pokemon();

        List<Pokemon> pokemonList = pokemon.pokemonList();

        int indexU = (int) (Math.random() * pokemonList.size());
        int indexC = (int) (Math.random() * pokemonList.size());

        Pokemon userp = pokemonList.get(indexU);
        Pokemon compp = pokemonList.get(indexC);

        int userA = Integer.parseInt(userp.getBaseStats().get(0).getAtt());
        int compA = Integer.parseInt(compp.getBaseStats().get(0).getAtt());

        System.out.println(userp.getName());
        System.out.println(userp.getAbilities());
        System.out.println("Attack: " + userA);

        System.out.println();

        System.out.println(compp.getName());
        System.out.println(compp.getAbilities());
        System.out.println("Attack: " + compA);

        System.out.println();

        if (userA > compA) {
            System.out.println("You win!");
        } else if (userA < compA) {
            System.out.println("You lose!");
        } else {
            System.out.println("Its a draw!");
        }


    }
}
