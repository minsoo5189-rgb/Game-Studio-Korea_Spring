package com.gamestudio.game_studio_korea.service;

import com.gamestudio.game_studio_korea.entity.News;
import com.gamestudio.game_studio_korea.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<News> getAllNews() {
        return newsRepository.findAllByOrderByNewsDateDesc();
    }

    public News getNewsById(Long id) {
        return newsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("News not found: " + id));
    }
}