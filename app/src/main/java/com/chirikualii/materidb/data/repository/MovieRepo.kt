package com.chirikualii.materidb.data.repository

import com.chirikualii.materidb.data.model.Movie
import com.chirikualii.materidb.data.remote.SearchMovieResponse
import retrofit2.http.Query

interface MovieRepo {
    suspend fun getPopularMovie() : List<Movie>
    suspend fun getNowPlayingMovie() : List<Movie>
    suspend fun getPopularMovieLocal() : List<Movie>
    suspend fun getNowPlayingLocal() : List<Movie>
    suspend fun getSearchMovie(query: String) : List<Movie>
}