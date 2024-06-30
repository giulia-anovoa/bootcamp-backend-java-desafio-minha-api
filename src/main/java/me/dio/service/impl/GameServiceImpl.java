package me.dio.service.impl;

import me.dio.domain.model.Game;
import me.dio.domain.repository.GameRepository;
import me.dio.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game findById(Long id) {
        return gameRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Game not found"));
    }

    @Override
    public Game create(Game gameToCreate) {
        return gameRepository.save(gameToCreate);
    }

    // Implementação do método para buscar todos os jogos
    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
