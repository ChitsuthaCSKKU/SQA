package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.data.stub.MovieServiceStub;

class FavoriteMovieTest {

	@Test
	void testgetMovieUser_withStub() {
		MovieService movieService = new MovieServiceStub();
		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		
		List<String> movielist = favoriteMovie.getUser("Isaac","datenight");
		
		assertEquals(5, movielist.size());
	}

}
