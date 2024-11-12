package com.paulao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulao.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
