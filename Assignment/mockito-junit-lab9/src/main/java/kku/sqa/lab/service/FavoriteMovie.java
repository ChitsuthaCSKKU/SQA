package kku.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.lab.api.MovieService;

public class FavoriteMovie {
	
	private MovieService movieService;

	public FavoriteMovie(MovieService movieService) {
		super();
		this.movieService = movieService;
	}

	public List<String> getUser(String username, String playlistName) {
		List<String> movielist = new ArrayList<String>();
		List<String> playlistMovie = movieService.getMovieUser(username);
		
		for (String movie : playlistMovie) {
            if (isInPlaylist(movie,playlistName)) {
				movielist.add(movie);
			}
		}
		
		return movielist;
		
	}
	
	public boolean isInPlaylist(String movie, String playlistName) {
		if(playlistName.equalsIgnoreCase("datenight")) {
			return 
			   movie.equals("The Notebook")
			|| movie.equals("50 First Dates")
			|| movie.equals("A Walk to Remember")
			|| movie.equals("First Love")
			|| movie.equals("The Lucky One");
		}else if(playlistName.equalsIgnoreCase("Action")) {
			return 
			   movie.equals("The American Sniper")
			|| movie.equals("John Wick")
			|| movie.equals("Mad Max: Fury Road")
			|| movie.equals("Gladiator")
			|| movie.equals("Die Hard");
		}
		return false;

	}
	
}
