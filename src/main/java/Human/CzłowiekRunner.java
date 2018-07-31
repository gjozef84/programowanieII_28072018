package Human;

import java.util.List;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class CzłowiekRunner {

    public static void main(String[] args) {

        SpisLudnosci spisLudnosci = new SpisLudnosci("Adam, Kowalski, 21 ; Karol, Janiak,31 ; Anna, Marzanna,18;Kasia, Kowalska,0");
        List<Człowiek> listaCzłowiekow = spisLudnosci.splitStringToList(spisLudnosci.stringZlistaLudnosci);
        for (Człowiek i: listaCzłowiekow
             ) {
            System.out.println(i.przedstawSie());
        }
        List<Człowiek> listaWithName = spisLudnosci.returnListHumanContainsName("Dupa");
        System.out.println(listaWithName.get(0));

    }
}
