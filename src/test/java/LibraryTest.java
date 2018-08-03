import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-28
 */

@RunWith(JUnitParamsRunner.class)
public class LibraryTest {

    List<Book> booksList = new ArrayList<>();
    Library library;

    @Before
    public void setUp() {
        Book a = new Book("John Steinbeck", "Tortilla Flat", 25, 2000);
        Book b = new Book("Philip K. Dick", "Człowiek z wysokiego zamku", 35, 2000);
        Book c = new Book("William Faulkner", "Wściekłość i wrzask", 15, 2010);
        Book d = new Book("Antoine de Saint-Exupery", "Ziemia, planeta ludzi", 55, 2001);
        Book e = new Book("Stephen King", "Misery", 20, 2018);
        Book f = new Book("John R.R. Tolkien", "Władca Pierścieni", 99, 2005);
        Book g = new Book("Michaił Bułhakow", "Mistrz i Małgorzata", 10, 2009);

        booksList = Arrays.asList(a, b, c, d, e, f, g);
        library = new Library(booksList);

        //library.setBooksList(booksList);
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
        Book testBook = new Book("John Steinbeck", "Tortilla Flat", 25, 2000);
        List<Book> getJohnSteinbeck = Arrays.asList(testBook);

        assertEquals(getJohnSteinbeck.get(0).getAuthor(), library.getOneAuthorBook("John Steinbeck").get(0).getAuthor());
    }

    @Test

    public void getBookWithTitle() {
        List<Book> testListBook1 = Arrays.asList( new Book("John Steinbeck", "Tortilla Flat", 25, 2000), new Book("Philip K. Dick", "Człowiek z wysokiego zamku", 35, 2000));

        assertEquals(testListBook1.get(0).getTitle(), library.getBookWithTitle("Tortilla Flat").get(0).getTitle());
        assertEquals(testListBook1.get(1).getTitle(), library.getBookWithTitle("Człowiek z wysokiego zamku").get(0).getTitle());
    }

    @Test
    @Parameters({"John Steinbeck, 25",
            "Philip K. Dick,35"})
    public void getBooksGivenPrice(String expected, int b) {

       //List<Book> testListBook1 = Arrays.asList( new Book("John Steinbeck", "Tortilla Flat", 25, 2000), new Book("Philip K. Dick", "Człowiek z wysokiego zamku", 35, 2000));

        assertEquals(expected, library.getBooksGivenPrice(b).get(0).getAuthor());
        assertEquals(expected, library.getBooksGivenPrice(b).get(0).getAuthor());
    }

    @Test
    public void getBooksFromPriceRange() {
        List<Book> testListBook1 = Arrays.asList( new Book("John Steinbeck", "Tortilla Flat", 25, 2000), new Book("Philip K. Dick", "Człowiek z wysokiego zamku", 35, 2000));

        assertEquals(testListBook1.get(0).getTitle(), library.getBooksFromPriceRange(21,25).get(0).getTitle());
        assertEquals(testListBook1.get(1).getTitle(), library.getBooksFromPriceRange(32,35).get(0).getTitle());
    }

    @Test
    public void getSumAllPrices() {
        assertEquals(259, library.getSumAllPrices());
    }

    @Test
    public void getListBooksPublishedInYear(){

        assertEquals(booksList.get(6), library.getListBooksPublishedInYear(2009).get(0));
    }

    @Test
    public void getListBooksPublishedInYearAndPriceLessThenValue(){
        assertEquals(booksList.get(0), library.getListBooksPublishedInYearAndPriceLessThenValue(2000, 25).get(0));
    }

    @Test
    public void getBooksList() {
    }

    @Test
    public void setBooksList() {
    }

    @Test
    public void getPriceSumForAuthorExcludeTitle() {
        assertEquals(0, library.getPriceSumForAuthorExcludeTitle("John Steinbeck", "Tortilla Flat"));
    }

    @Test
    public void upperCase() {
        List<String> stringListTest = Arrays.asList("Ania", "Iwona", "Dupa");

        assertEquals(Arrays.asList("ANIA", "IWONA", "DUPA"), library.upperCase(stringListTest));
    }

    @Test
    public void returnStringStartWithSandOnly4Letters(){
        List<String> stringListTest = Arrays.asList("Ania", "smok", "Iwona", "Dupa", "stop", "Ssak", "Super");

        assertEquals(Arrays.asList("smok", "stop", "Ssak"), library.searchSstring(stringListTest));
    }

    @Test
    public void getIntergerReturnString() {
        List<Integer> listIntegerTest = Arrays.asList(1,5,10,21,99);
        assertEquals("n1,n5,p10,n21,n99", library.getIntergerReturnString(listIntegerTest));
    }
}