package kku.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.lab.api.BookCatalogueService;

public class BookCatalogueImpl {
	
	private BookCatalogueService bookcatalogueservice;
	
	public BookCatalogueImpl(BookCatalogueService bookcatalogueservice) {
		super();
		this.bookcatalogueservice = bookcatalogueservice;
	}
	
	//get only books relative to the keyword in the catalog of a certain month
	public List<String> getBook(String month, String keyword) {
		List<String> booklist = new ArrayList<String>();
		List<String> allbooklist = bookcatalogueservice.getBookCatalogue(month, keyword);
			
		for (String book: allbooklist) {
			if (book.contains(keyword)) {
				booklist.add(book);
			}
		}
		return booklist;
	}
}
