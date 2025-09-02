package kku.sqa.lab.service;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.BookCatalogueService;

class BookCatalogueImplMockitoTest {

	@Test
	void testUsingMockito() {
		BookCatalogueService bookcatalogueservice = mock(BookCatalogueService.class);
		List<String> booklist = Arrays.asList("Cooking Thai Dishes", "Cooking made easy", "Cooking with dogs");
		
		when(bookcatalogueservice.getBookCatalogue("September", "Cooking")).thenReturn(booklist);
		
		BookCatalogueImpl bookcatalogueimpl = new BookCatalogueImpl(bookcatalogueservice);
		List<String> cookingbooklist = bookcatalogueimpl.getBook("September", "Cooking");
		
		assertEquals(3, cookingbooklist.size());		
	}

}
