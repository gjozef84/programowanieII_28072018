package Human;

import DesignPaterns.Decorator.NormalWord;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class CzłowiekMarionetka extends Człowiek {

    NormalnePrzywitanie normalnePrzywitanie;

    public CzłowiekMarionetka(String imie, String nazwisko, int wiek, NormalnePrzywitanie normalnePrzywitanie) {
        super(imie, nazwisko, wiek);
        this.normalnePrzywitanie = normalnePrzywitanie;
    }

    @Override
    public String przywitajSie() {
        return normalnePrzywitanie.przywitanie();
    }
}
