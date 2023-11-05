package com.jogocompetitivo.domain;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        // Comparação com base no elo
        int eloComparison = user1.getElo().compareTo(user2.getElo());

        // Se os elos forem iguais, use o critério de pdl
        if (eloComparison == 0) {
            return Integer.compare(user1.getBalance(), user2.getBalance());
        }

        return eloComparison;
    }
}