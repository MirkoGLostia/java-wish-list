package org.exercise.java.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainWordCounter {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        // array and variables
        String userWord;
        Map<Character, Integer> listOfLetters = new HashMap<>();


        System.out.println("gimme a word");
        userWord = userinput.nextLine();

        for (int i = 0; i < userWord.length(); i++) {
            int n = 1;
            char userLetter = userWord.charAt(i);
            if (listOfLetters.containsKey(userLetter)){
                n = listOfLetters.get(userLetter);
                listOfLetters.replace(userLetter, n, n+1);
            }else {
            listOfLetters.put(userLetter, n);
            }
        }

        System.out.println(listOfLetters);

    }
}
