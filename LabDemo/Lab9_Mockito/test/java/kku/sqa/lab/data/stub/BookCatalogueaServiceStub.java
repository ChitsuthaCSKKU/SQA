package kku.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.BookCatalogueService;

public class BookCatalogueaServiceStub implements BookCatalogueService{
	
	//Return static data (hard-coded)
	public List<String> getBookCatalogue(String month) {
		return Arrays.asList("Cooking Thai Dishes", "Cooking made easy", "Flirting through Cooking");
	}
}
