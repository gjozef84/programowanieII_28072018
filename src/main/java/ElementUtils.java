/**
 * Created by Grzesiek on 2018-07-28
 */
public class ElementUtils {

    public static <T extends Object> T betterEntry(T s1, T s2, TwoElementPredicate<T> predicate) {
        return predicate.compare(s1, s2) ? s1 : s2;
    }
}
