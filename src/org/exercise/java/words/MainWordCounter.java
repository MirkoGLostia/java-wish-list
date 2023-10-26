package org.exercise.java.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainWordCounter {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        // array and variables
        String userWord;
        Map<Integer, Character> listOfLetters = new HashMap<>();


        System.out.println("gimme a word");
        userWord = userinput.nextLine();

        for (int i = 0; i < userWord.length(); i++) {
            char userLetter = userWord.charAt(i);
            listOfLetters.put(i, userLetter);
        }

        System.out.println(listOfLetters);

    }
}
