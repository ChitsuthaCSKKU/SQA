package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.BookCatalogueService;

class BookCatalogueImplMockitoTest {

	@Test
	void testUsingMockito() {
		BookCatalogueService bookcatalogueservice = mock(BookCatalogueService.class);
		List<String> booklist = Arrays.asList("Cooking Thai Dishes", "Cooking made easy", "Flirting through Cooking");
		
		when(bookcatalogueservice.getBookCatalogue("September")).thenReturn(booklist);
		
		BookCatalogueImpl bookcatalogueimpl = new BookCatalogueImpl(bookcatalogueservice);
		List<String> cookingbooklist = bookcatalogueimpl.getCookingBook("September");
		
		assertEquals(3, cookingbooklist.size());		
	}
}
