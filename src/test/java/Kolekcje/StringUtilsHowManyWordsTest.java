package Kolekcje;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-29
 */

@RunWith(JUnitParamsRunner.class)
public class StringUtilsHowManyWordsTest {

    HashMap<String, Integer> mapTest = new HashMap<>();
    HashMap<String, Integer> mapTest2words = new HashMap<>();
    HashMap<String, Integer> mapTest3words = new HashMap<>();

    StringUtils stringUtils = new StringUtils();


    @Before
    public void setUp(){
        mapTest.put("Grzesiek", 1);
        mapTest2words.put("Grzesiek", 1);
        mapTest3words.put("Grzesiek", 1);
        mapTest2words.put("Józefowicz", 1);
        mapTest3words.put("Józefowicz", 2);
    }

    @Test
    public void howManyWords_return1(){
        assertEquals(mapTest, StringUtils.howManyWordsInString("Grzesiek"));
    }

    @Test
    public void howManyWords_return_whenTwoWords(){
        assertEquals(mapTest2words, StringUtils.howManyWordsInString("Grzesiek Józefowicz"));
    }

    @Test
    public void howManyWords_return_whenWords2times(){
        assertEquals(mapTest3words, StringUtils.howManyWordsInString("Grzesiek Józefowicz Józefowicz"));
    }

    @Parameters({"dupa, 4", "dupa, 4", "cos, 3", "dupa, 4"})
    @Test
    public void countLetterInWords_return4(String a, int expected){
        assertEquals(expected, stringUtils.howManyLettersInWord(a));
        assertEquals(expected, stringUtils.howManyLettersInWord(a));
    }

    @Test
    public void concordateLetter(){
        String expected = "{r=[7], d=[9], e=[1], W=[5], H=[0], l=[2, 3, 8], o=[4, 6]}";
        assertEquals(expected, stringUtils.concordateLetters("Hello World"));
    }

}