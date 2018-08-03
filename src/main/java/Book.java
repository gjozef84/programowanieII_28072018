import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Created by Grzesiek on 2018-07-28
 */

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

    private String author;
    private String title;
    private int price;
    private int releaseDate;
}
