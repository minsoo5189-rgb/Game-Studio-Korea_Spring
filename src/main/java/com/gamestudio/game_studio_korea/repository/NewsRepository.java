package com.gamestudio.game_studio_korea.repository;

import com.gamestudio.game_studio_korea.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {

    List<News> findAllByOrderByNewsDateDesc();
}