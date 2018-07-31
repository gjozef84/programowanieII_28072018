package Human;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class Człowiek {

    protected String imie;
    protected String nazwisko;
    protected Integer wiek;

    protected Człowiek(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public static class Builder {

        private String imie;
        private String nazwisko;
        private Integer wiek;

        public Builder(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public Builder setWiek(int wiek){
            this.wiek = wiek;
            return this;
        }

        public Człowiek build(){
            return new Człowiek(this.imie, this.nazwisko, this.wiek);
        }

    }

    public String przywitajSie(){
        return "";
    }

    public String przedstawSie(){
        String result= przywitajSie() + " jestem "+this.imie + " "+ this.nazwisko;
        if(this.wiek!=null) result = result + " mam " +this.wiek + " lat";

        return result;
    }

    @Override
    public String toString() {
        return "Człowiek{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
