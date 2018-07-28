import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by Grzesiek on 2018-07-28
 */

@AllArgsConstructor
@Setter
@Getter
public class Book {

    private String author;
    private String title;
    private int price;
    private int releaseDate;


}
