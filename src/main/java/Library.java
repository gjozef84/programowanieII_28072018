import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Grzesiek on 2018-07-28
 */

@Getter
@Setter
public class Library {

    private List<Book> booksList;

    public Library(List<Book> booksList) {
        if (booksList == null || booksList.isEmpty()) throw new IllegalArgumentException();

        this.booksList = booksList;
    }

    public List<String> getAuthors() {

        return booksList.stream()
                .map(book -> book.getAuthor())
                .collect(Collectors.toList());
    }

    public List<String> getTitles() {
        return booksList.stream()
                .map(x -> x.getTitle())
                .collect(Collectors.toList());
    }

    public List<Integer> getPrices() {

        return booksList.stream()
                .map(x -> x.getPrice())
                .collect(Collectors.toList());
    }

    public List<Book> getOneAuthorBook(String author) {
        return booksList.stream()
                .filter(x -> x.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> getBookWithTitle(String title) {
        return booksList.stream()
                .filter(x -> x.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksGivenPrice(int price) {
        return booksList.stream()
                .filter(x -> x.getPrice() == price)
                .collect(Collectors.toList());
    }

    public List<Book> getBooksFromPriceRange(int from, int to) {
        return booksList.stream()
                .filter(x -> (x.getPrice() >= from && x.getPrice() <= to))
                .collect(Collectors.toList());
    }

    public int getSumAllPrices() {
        return booksList.stream()
                .map(book -> book.getPrice())
                .reduce(0, (e1, e2) -> e1 + e2);

        //lub moze byc tak
        //.mapToInt(book -> book.getPrice())
        //.sum();
    }

    public int getPriceSumForAuthorExcludeTitle(String author, String title) {
        return getOneAuthorBook(author).stream()
                .filter(book -> !book.getTitle().equals(title))
                .mapToInt(book -> book.getPrice())
                .sum();
    }


    public List<Book> getListBooksPublishedInYear(int year) {
        return booksList.stream()
                .filter(x -> x.getReleaseDate() == year)
                .collect(Collectors.toList());
    }

    public List<Book> getListBooksPublishedInYearAndPriceLessThenValue(int year, int price) {
        return getListBooksPublishedInYear(year).stream()
                .filter(x -> x.getPrice() <= price)
                .collect(Collectors.toList());
    }

    public List<String> upperCase(List<String> listToUpper) {
        List<String> returnList = new ArrayList<>();
        for (String str : listToUpper) {
            returnList.add(str.toUpperCase());
        }

        return returnList;
    }

    public List<String> searchSstring(List<String> stringListTest) {
        List<String> returnList = new ArrayList<>();

        for (String str : stringListTest) {
            if ((str.startsWith("s") || str.startsWith("S") && str.length() == 4)) {
                returnList.add(str);
            }
        }

        return returnList;
    }

    public String getIntergerReturnString(List<Integer> listIntegers) {
        String str = "";

        for (int i = 0; i < listIntegers.size(); i++) {
            if (listIntegers.get(i) % 2 == 0) {
                str += "p" + listIntegers.get(i) + (i < listIntegers.size()-1 ? "," : "");
            } else if (listIntegers.get(i) % 2 == 1) {
                str += "n" + listIntegers.get(i) + (i < listIntegers.size()-1 ? "," : "");
            }
        }
        System.out.println(str);
        return str;
    }
}
