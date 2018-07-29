package DesignPaterns.Decorator;

/**
 * Created by Grzesiek on 2018-07-29
 */

public abstract class WordDecorator implements Word {
    protected Word word;

    public WordDecorator(Word word) {
        this.word = word;
    }
}
