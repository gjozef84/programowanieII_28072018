package Human;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class MarionetkaTest {

    Marionetka marionetkaTest = new Marionetka.MarionetkaBuilder("Jan", "Marionetka", new BrzydkiePrzywitanie()).setWiek(25).build();

    @Test
    public void return_przywitajSie() {
        assertEquals("BRZYDKIE przywitanie", marionetkaTest.przywitajSie());
    }
}