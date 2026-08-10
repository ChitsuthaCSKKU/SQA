package sqa.lab.demo.api;

import java.util.List;

//Interface to External service, e.g., KKU library

public interface BookCatalogueService {
	
	public List<String> getBookCatalogue(String month);
	
}