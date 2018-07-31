package Human;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Grzesiek on 2018-07-29
 */

@Getter
@Setter
public class SpisLudnosci {

    protected List<Człowiek> listaLudnosci;// = new ArrayList<>();;
    protected String stringZlistaLudnosci;

    public SpisLudnosci(String InputStringZlistaLudnosci) {
        this.stringZlistaLudnosci = InputStringZlistaLudnosci;
    }

    public List<Człowiek> splitStringToList(String stringZlistaLudnosci) {
        //List<Człowiek> list = new ArrayList<>();
        listaLudnosci = new ArrayList<>();
        stringZlistaLudnosci = stringZlistaLudnosci.replaceAll(" ", "");
        String[] tabHumans = stringZlistaLudnosci.split(";");
        String[] tabHuman;

        for (String s : tabHumans) {
            tabHuman = s.split(",");
            Człowiek czlowiekToList;

            if (tabHuman[2].isEmpty()) {
                czlowiekToList = new Człowiek.Builder(tabHuman[0], tabHuman[1]).build();
            } else {
                czlowiekToList = new Człowiek.Builder(tabHuman[0], tabHuman[1]).setWiek(Integer.parseInt(tabHuman[2])).build();
            }

            listaLudnosci.add(czlowiekToList);
        }
        return listaLudnosci;
    }

    public List<Człowiek> returnListHumanContainsName(String name){
        return listaLudnosci.stream()
                .filter(x -> x.imie.equals(name))
                .collect(Collectors.toList());
    }


}
