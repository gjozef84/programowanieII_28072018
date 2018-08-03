package Human;

import java.util.List;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class CzłowiekRunner {

    public static void main(String[] args) {

        SpisLudnosci spisLudnosci = new SpisLudnosci("Adam, Kowalski, 21 ; Karol, Janiak,31 ; Anna, Marzanna,18;Kasia, Kowalska");
        List<Człowiek> listaCzłowiekow = spisLudnosci.splitStringToList(spisLudnosci.stringZlistaLudnosci);
        for (Człowiek i : listaCzłowiekow) {
            System.out.println(i.przedstawSie());}

        List<Człowiek> listaWithName = spisLudnosci.returnListHumanContainsSetName("Adam");
        //System.out.println(listaWithName.get(0));

        int age = 19;
        System.out.println("\nLista ludzi młodszych niż "+age+" lat");
        List<Człowiek> listYoungerThanAge = spisLudnosci.returnListHumanYoungerThanSetAge(age);

        for (Człowiek i : listYoungerThanAge) {
            System.out.println(i);
        }
    }
}
