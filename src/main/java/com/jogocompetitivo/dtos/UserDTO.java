package com.jogocompetitivo.dtos;

import com.jogocompetitivo.domain.EloType;

public record UserDTO(String firstName, String lastName, String document, String email, EloType elo, int balance) {

}
