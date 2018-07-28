import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Grzesiek on 2018-07-28
 */
public class StringUtilsTest {

    String s1 = "Grzesiek";
    String s2 = "Józefowicz";
    /*Integer i1 = 1;
    Integer i2 = 11;*/

    @Test
    public void returnFirstString() {
        assertEquals("Grzesiek", ElementUtils.betterEntry(s1, s2, (s1, s2) -> true));
    }

    @Test
    public void returnLongerString() {
        assertEquals("Józefowicz", ElementUtils.betterEntry(s1, s2, (x, y) -> x.length() > y.length()));
    }
}
