package com.matheusdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
