import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-28
 */
public class LibraryTest {

    List<Book> booksList = new ArrayList<>();
    public Library library = new Library(booksList);

    @BeforeClass
    public void setUp() {
        Book a = new Book("John Steinbeck", "Tortilla Flat", 25, 2000);
        Book b = new Book("Philip K. Dick", "Człowiek z wysokiego zamku", 35, 2000);
        Book c = new Book("William Faulkner", "Wściekłość i wrzask", 15, 2010);
        Book d = new Book("Antoine de Saint-Exupery", "Ziemia, planeta ludzi", 55, 2001);
        Book e = new Book("Stephen King", "Misery", 20, 2018);
        Book f = new Book("John R.R. Tolkien", "Władca Pierścieni", 99, 2005);
        Book g = new Book("Michaił Bułhakow", "Mistrz i Małgorzata", 10, 2009);

        booksList = Arrays.asList(a, b, c, d, e, f, g);

        library.setBooksList(booksList);
    }

    @Test
    public void getAuthors() {
        List<String> testListAuthors = Arrays.asList("John Steinbeck", "Philip K. Dick", "William Faulkner", "Antoine de Saint-Exupery", "Stephen King", "John R.R. Tolkien", "Michaił Bułhakow" );
        assertEquals(testListAuthors, library.getAuthors());
    }

    @Test
    public void getTitles() {
        List<String> testListTitles = Arrays.asList("Tortilla Flat","Człowiek z wysokiego zamku", "Wściekłość i wrzask", "Ziemia, planeta ludzi", "Misery", "Władca Pierścieni","Mistrz i Małgorzata");
        assertEquals(testListTitles, library.getTitles());
    }

    @Test
    public void getPrices() {
        List<Integer> testListPrices = Arrays.asList(25,35,15,55,20,99,10);
        assertEquals(testListPrices, library.getPrices());
    }

    @Test
    public void getOneAuthorBook() {
        //List<Book> getJohnSteinbeck = Arrays.asList(a);
        //assertEquals(getJohnSteinbeck, library.getOneAuthorBook("John Steinbeck"));
    }

    @Test
    public void getBookWithTitle() {
    }

    @Test
    public void getBooksGivenPrice() {
    }

    @Test
    public void getBooksFromPriceRange() {
    }

    @Test
    public void getSumAllPrices() {
        assertEquals(244, library.getSumAllPrices());
    }

    @Test
    public void getBooksList() {
    }

    @Test
    public void setBooksList() {
    }
}