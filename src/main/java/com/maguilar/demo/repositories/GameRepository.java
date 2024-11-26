package com.maguilar.demo.repositories;

import com.maguilar.demo.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {



}
