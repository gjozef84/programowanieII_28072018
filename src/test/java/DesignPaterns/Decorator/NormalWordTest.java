package DesignPaterns.Decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class NormalWordTest {

    NormalWord normalWord = new NormalWord();
    Prefix prefix = new Prefix(normalWord);
    Sufix sufix = new Sufix(prefix);

    WordDecorator word = new Prefix(new Sufix(new NormalWord()));

    @Test
    public void show_NormalWord_with_Prefix(){
        assertEquals("PREFIX Zwykłe słowo", prefix.display());
    }

    @Test
    public void show_NormalWord_with_Sufix(){
        Sufix sufix = new Sufix(normalWord);
        assertEquals("Zwykłe słowo SUFIX", sufix.display());
    }

    @Test
    public void show_NormalWord_with_Prefix_and_Sufix(){
        assertEquals("PREFIX Zwykłe słowo SUFIX", word.display());
    }

}