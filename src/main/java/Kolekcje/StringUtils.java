package Kolekcje;

import java.util.*;
import java.util.stream.Collector;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class StringUtils {

    HashMap<String, Integer> mapWords = new HashMap<>();

    public static Map<String, Integer> howManyWordsInString(String string) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) map.put(words[i], 1);
            else map.put(words[i], map.get(words[i]) + 1);
        }

        return map;
    }

    public int howManyLettersInWord(String word) {

        if (mapWords.containsKey(word)) {
            System.out.println("Posłuzyłem się mapą z pamięci");
            return mapWords.get(word);
        } else {
            String[] letters = word.split("");
            HashMap<String, Integer> mapLetters = new HashMap<>();

            for (int i = 0; i < letters.length; i++) {
                mapLetters.put(letters[i], 1);
            }

            mapWords.put(word, mapLetters.size());
            return mapLetters.size();
        }
    }

    public Map<Character, List<Integer>> concordateLetters(String inputString) {
        inputString = inputString.replace(" ", "");

        Map<Character, List<Integer>> result = new HashMap<>();
        char[] characters = inputString.toCharArray();


        for (int i = 0; i < characters.length; i++) {
            Character currentChar = characters[i];
            List<Integer> occurences;

            if (!result.containsKey(currentChar)) {
                occurences = new ArrayList<>();
                /*occurences.add(i);
                result.put(currentChar, occurences);*/
            } else {
                occurences = result.get(currentChar);
            }

            occurences.add(i);
            result.put(currentChar, occurences);
        }
        return result;
    }
}
