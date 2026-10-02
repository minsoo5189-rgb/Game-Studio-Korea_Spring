package com.gamestudio.game_studio_korea.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate newsDate;

    @Column(nullable = false, length = 50)
    private String category;

    @Column(nullable = false, length = 200)
    private String titleKo;

    @Column(nullable = false, length = 200)
    private String titleJa;

    @Column(columnDefinition = "TEXT")
    private String contentKo;

    @Column(columnDefinition = "TEXT")
    private String contentJa;

    public News() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(LocalDate newsDate) {
        this.newsDate = newsDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitleKo() {
        return titleKo;
    }

    public void setTitleKo(String titleKo) {
        this.titleKo = titleKo;
    }

    public String getTitleJa() {
        return titleJa;
    }

    public void setTitleJa(String titleJa) {
        this.titleJa = titleJa;
    }

    public String getContentKo() {
        return contentKo;
    }

    public void setContentKo(String contentKo) {
        this.contentKo = contentKo;
    }

    public String getContentJa() {
        return contentJa;
    }

    public void setContentJa(String contentJa) {
        this.contentJa = contentJa;
    }
}