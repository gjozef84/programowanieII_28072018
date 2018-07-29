package Human;

import DesignPaterns.Decorator.NormalWord;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class Marionetka extends Człowiek {

    WelcomeStrategy welcomeStrategy;

    protected Marionetka(String imie, String nazwisko, int wiek, WelcomeStrategy welcomeStrategy) {
        super(imie, nazwisko, wiek);
        this.welcomeStrategy = welcomeStrategy;
    }

    @Override
    public String przywitajSie() {
        return welcomeStrategy.przywitanie();
    }

    public static class MarionetkaBuilder {

        private String imie;
        private String nazwisko;
        private Integer wiek;
        WelcomeStrategy welcomeStrategy;

        public MarionetkaBuilder(String imie, String nazwisko, WelcomeStrategy welcomeStrategy) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.welcomeStrategy = welcomeStrategy;
        }

        public MarionetkaBuilder setWiek(Integer wiek) {
            this.wiek = wiek;
            return this;
        }

        public Marionetka build() {
            return new Marionetka(this.imie, this.nazwisko, this.wiek, this.welcomeStrategy);
        }
    }
}
