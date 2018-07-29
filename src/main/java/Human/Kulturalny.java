package Human;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class Kulturalny extends Człowiek {


    protected Kulturalny(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }

    public static class KulturalnyBuilder {

        private String imie;
        private String nazwisko;
        private Integer wiek;

        public KulturalnyBuilder(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public KulturalnyBuilder setWiek(Integer wiek) {
            this.wiek = wiek;
            return this;
        }

        public Kulturalny build() {
            return new Kulturalny(this.imie, this.nazwisko, this.wiek);
        }
    }

    @Override
    public String przywitajSie() {
        return "Uszanowanko";
    }
}
