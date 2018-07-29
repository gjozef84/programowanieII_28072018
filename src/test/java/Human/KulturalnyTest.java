package Human;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class KulturalnyTest {

    Człowiek kulturalny2 = new Kulturalny.KulturalnyBuilder("Jan", "Kowalski").setWiek(25).build();

    @Test
    public void createKulturalnyCzłowiek(){
        System.out.println(kulturalny2.przedstawSie());
        assertEquals("Uszanowanko", kulturalny2.przywitajSie());
    }

}