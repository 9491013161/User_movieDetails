package io.sarath.moviecatalogservice.resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.sarath.moviecatalogservice.models.Movie;
import io.sarath.moviecatalogservice.models.Rating;
import io.sarath.moviecatalogservice.models.catalogItem;
@RestController
@RequestMapping("/catalog")
class moviecatalogResource {
	@RequestMapping("/{userId}")
public List<catalogItem> getCatalog(@PathVariable("userId") String userId){
	RestTemplate restTemplate=new RestTemplate();
	List<Rating> ratings=Arrays.asList(
			new Rating("1234",4),
			new Rating("2589",3)
			);
	
	 return ratings.stream().map(rating ->{
	 Movie movie =restTemplate.getForObject("http://localhost:8082/movies/foo"+rating.getMovieId(),Movie.class);
	return new catalogItem(movie.getName(),"desc",rating.getRating());
	})
			 .collect(Collectors.toList());
	
}
}
