package com.devsuperior.deslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.deslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long>{
	 
}
