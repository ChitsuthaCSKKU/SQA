package sqa.lab.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

import sqa.lab.demo.api.BookCatalogueService;
import sqa.lab.demo.data.stub.BookCatalogueServiceStub;

class BookCatalogueImplTest {

          @Test
          void test_getCookingBook_withStub() {
                 BookCatalogueService bookcatalogueservice = new BookCatalogueServiceStub();
                 BookCatalogueImpl bookcatalogueimpl = new BookCatalogueImpl(bookcatalogueservice);
		
                 List<String> booklist = bookcatalogueimpl.getCookingBook("September");
		
                 assertEquals(3, booklist.size());		
           }
}
