package me.dio.service;

import me.dio.domain.model.Game;

import java.util.List;

public interface GameService {

    Game findById(Long id);

    Game create(Game gameToCreate);

    // Novo método para buscar todos os jogos
    List<Game> findAll();
}
