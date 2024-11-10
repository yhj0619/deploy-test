package com.movie.MovieReview.movie.dto;

import lombok.Data;

import java.util.List;

@Data
public class MovieDto {
    private Long id; //movie id
    private String title; //movie제목
    private String overview; //movie 줄거리
    private String poster_path; //movie 포스터 url https://image.tmdb.org/t/p/w500/poster_path
    private List<Integer> genre_ids; // movie 장르 ID들
}
