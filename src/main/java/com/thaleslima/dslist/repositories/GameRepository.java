package com.thaleslima.dslist.repositories;

import com.thaleslima.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
