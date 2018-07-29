package Human;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class MarionetkaTest {

    @Test
    public void return_przywitajSieWithBrzydkiePrzywitanie() {
        Marionetka marionetkaTest = new Marionetka.MarionetkaBuilder("Jan", "Marionetka", new BrzydkiePrzywitanie()).setWiek(25).build();
        System.out.println(marionetkaTest.przedstawSie());
        assertEquals("Siema jestem Jan Marionetka mam 25 lat", marionetkaTest.przedstawSie());
    }

    @Test
    public void return_przywitajSieWithNormalnePrzywitanie() {
        Marionetka marionetkaTest2 = new Marionetka.MarionetkaBuilder("Jan", "Marionetka2", new NormalnePrzywitanie()).setWiek(45).build();
        System.out.println(marionetkaTest2.przedstawSie());
        assertEquals("Dzień dobry jestem Jan Marionetka2 mam 45 lat", marionetkaTest2.przedstawSie());
    }
}