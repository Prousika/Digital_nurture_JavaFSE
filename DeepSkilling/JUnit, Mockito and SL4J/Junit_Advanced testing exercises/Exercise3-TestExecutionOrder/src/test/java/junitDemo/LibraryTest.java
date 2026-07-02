package junitDemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LibraryTest {

    Library library;

    @BeforeEach
    void setup(){

        library=new Library();

    }

    @AfterEach
    void teardown(){

        library=null;

    }

    @Test
    @Order(1)
    @DisplayName("Add Book")
    void testAddBook(){

        library.addBook("Java");

        assertEquals(1,library.getBookCount());

    }

    @Test
    @Order(2)
    @DisplayName("Search Book")
    void testSearchBook(){

        library.addBook("Spring");

        assertTrue(library.searchBook("Spring"));

    }

    @Test
    @Order(3)
    @DisplayName("Remove Book")
    void testRemoveBook(){

        library.addBook("JUnit");

        assertTrue(library.removeBook("JUnit"));

    }

}
