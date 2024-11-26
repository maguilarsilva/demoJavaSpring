package com.maguilar.demo.services;

import com.maguilar.demo.dto.GameMinDTO;
import com.maguilar.demo.entities.Game;
import com.maguilar.demo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){

       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dtoGame = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dtoGame;
    }
}
