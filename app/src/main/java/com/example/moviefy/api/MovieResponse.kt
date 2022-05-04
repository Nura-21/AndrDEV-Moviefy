package com.example.moviefy.api
import com.example.moviefy.data.model.Movie

data class MovieResponse(
    val results: List<Movie>
)