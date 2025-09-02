package kku.sqa.lab.service;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.BookCatalogueService;
import kku.sqa.lab.data.stub.BookCatalogueaServiceStub;

class BookCatalogueImplTest {

	@Test
	void test_getCookingBook_withStub() {
		BookCatalogueService bookcatalogueservice = new BookCatalogueaServiceStub();
		BookCatalogueImpl bookcatalogueimpl = new BookCatalogueImpl(bookcatalogueservice);
		
		List<String> booklist = bookcatalogueimpl.getBook("September", "Cooking");
		
		assertEquals(3, booklist.size());		
	}
}
