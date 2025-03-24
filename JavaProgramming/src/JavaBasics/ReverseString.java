package JavaBasics;

import java.lang.*;

public class ReverseString {

    // Program: Reverse the string using StringBuilder
    public static void Program3(String[] args) {

        String word = "hello";

        // Use StringBuilder to reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }

    // Program: Reverse the words in the input string using StringBuilder
    public static void Program4(String[] args) {

        String sentence = "Hello world";
        // Split the sentence into words
        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            // Reverse the word using StringBuilder
            String reversedWord = new StringBuilder(word).reverse().toString();

            // Add reversed word to the sentence
            reversedSentence.append(reversedWord).append(" ");
        }

        // Trim the trailing space and print the result
        System.out.println(reversedSentence.toString().trim());
    }

    // Program: Reverse the words in the input string
    public static void Program1(String[] args) {

        // Reverse the words in the input string
        String Str = "My name is Meenakshi";

        String[] words = Str.split(" ");

        //System.out.println(words.length); //Fetch the strings words length

        for (int j = 0; j < words.length; j++) {
            for (int i = words[j].length() - 1; i >= 0; i--) {
                System.out.print(words[j].charAt(i));
            }
            System.out.print(" ");
        }
    }

    // Program: Reverse the input string
    public static void Program2(String[] args) {

        // Reverse the input string
        String Str = "Hello World";
        for (int i = Str.length() - 1; i >= 0; i--) {
            System.out.print(Str.charAt(i));
        }
    }
}
