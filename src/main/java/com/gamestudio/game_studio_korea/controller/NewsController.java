package com.gamestudio.game_studio_korea.controller;

import com.gamestudio.game_studio_korea.entity.News;
import com.gamestudio.game_studio_korea.service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
@CrossOrigin(origins = "*")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/{id}")
    public News getNews(@PathVariable Long id) {
        return newsService.getNewsById(id);
    }
}