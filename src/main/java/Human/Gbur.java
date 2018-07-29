package Human;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class Gbur extends Człowiek {

    public Gbur(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }

    public static class GburBuilder extends Człowiek.Builder {
        public GburBuilder(String imie, String nazwisko) {
            super(imie, nazwisko);
        }
    }

    @Override
    public String przywitajSie() {
        return "Nie przeszkadzaj mi";
    }
}
