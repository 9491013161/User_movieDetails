package io.sarath.movieinfoservice.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sarath.movieinfoservice.models.Movie;
@RestController
@RequestMapping("/movies")
class MovieResource {
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId ) {
		return new Movie(movieId,"test");}

}
