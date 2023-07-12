package com.matheusdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
