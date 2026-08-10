package sqa.lab.demo.data.stub;

import java.util.Arrays;
import java.util.List;

import sqa.lab.demo.api.BookCatalogueService;

public class BookCatalogueServiceStub implements BookCatalogueService{
	
	//Return static data (hard-coded)
    public List<String> getBookCatalogue(String month) {
    	return Arrays.asList("Cooking Thai Dishes", "Cooking                                   made easy", "Flirting through Cooking");
            }
}
