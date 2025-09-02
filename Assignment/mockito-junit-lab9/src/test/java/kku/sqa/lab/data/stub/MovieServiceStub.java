package kku.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.MovieService;

public class MovieServiceStub implements MovieService {

	public List<String> getMovieUser(String username) {
		return Arrays.asList(
				"The Notebook",
				"50 First Dates",
				"A Walk to Remember",
				"First Love",
				"The Lucky One");
	}

}
