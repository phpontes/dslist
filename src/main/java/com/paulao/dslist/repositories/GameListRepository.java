package com.paulao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulao.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
