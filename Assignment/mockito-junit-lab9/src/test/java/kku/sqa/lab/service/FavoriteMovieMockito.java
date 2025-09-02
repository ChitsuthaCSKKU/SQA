package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.MovieService;

class FavoriteMovieMockito {

	//Main Test Case For Action Movie
	@Test
	void testUsingMockito() {
		MovieService movieService = mock(MovieService.class);
		List<String> Isaacmovielist = Arrays.asList(
				"Mad Max: Fury Road",      // Action
		        "50 First Dates",          // Romance
		        "The American Sniper",     // Action
		        "John Wick",               // Action
		        "Die Hard"       		   // Action
		        );
		
		when(movieService.getMovieUser("Isaac")).thenReturn(Isaacmovielist);
		
		
		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		List<String> movielist = favoriteMovie.getUser("Isaac","Action");
		
		assertEquals(4, movielist.size());
	}
	
	
	
	
	
	@Test 
	void testAllRomance(){
		MovieService movieService = mock(MovieService.class);
		List<String> Annmovielist = Arrays.asList(
				"The Notebook",            // Romance
		        "50 First Dates",          // Romance
		        "A Walk to Remember",      // Romance
		        "First Love",              // Romance
		        "The Lucky One"            // Romance
		        );
		
		when(movieService.getMovieUser("Ann")).thenReturn(Annmovielist);
		
		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		List<String> movielist = favoriteMovie.getUser("Ann","datenight");
		
		assertEquals(5, movielist.size());
	}
	
	@Test
	void testAllAction() {
		MovieService movieService = mock(MovieService.class);
		List<String> Bobmovielist = Arrays.asList(
				"The American Sniper",     // Action
		        "John Wick",               // Action
		        "Mad Max: Fury Road",      // Action
		        "Gladiator",               // Action
		        "Die Hard"                 // Action
		        );
		
		when(movieService.getMovieUser("Bob")).thenReturn(Bobmovielist);
		
		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		List<String> movielist = favoriteMovie.getUser("Bob","Action");
		
		assertEquals(5, movielist.size());
	}
	
	@Test
	void testNoAction() {
		MovieService movieService = mock(MovieService.class);
		List<String> Carlmovielist = Arrays.asList(
				"The Notebook",            // Romance
		        "50 First Dates",          // Romance
		        "A Walk to Remember",      // Romance
		        "First Love",              // Romance
		        "The Lucky One"            // Romance
		        );
		
		when(movieService.getMovieUser("Carl")).thenReturn(Carlmovielist);
		
		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		List<String> movielist = favoriteMovie.getUser("Carl","Action");
		
		assertEquals(0, movielist.size());
	}
	
	@Test 
	void testNoRomance() {
		MovieService movieService = mock(MovieService.class);
		List<String> Davidmovielist = Arrays.asList(
				"The American Sniper",     // Action
		        "John Wick",               // Action
		        "Mad Max: Fury Road",      // Action
		        "Gladiator",               // Action
		        "Die Hard"                 // Action
		        );
		
		when(movieService.getMovieUser("David")).thenReturn(Davidmovielist);
		
		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		List<String> movielist = favoriteMovie.getUser("David","datenight");
		
		assertEquals(0, movielist.size());
	}
	

}
