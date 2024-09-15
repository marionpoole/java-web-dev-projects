package org.launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
                Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for within the text in the first sentence of 'Alice in Wonderland'?");
     String term = input.nextLine();
        String firstSentenceLowerCase = firstSentence.toLowerCase();
        String searchTerm = term.toLowerCase();
  System.out.println(firstSentenceLowerCase.contains(searchTerm));
  Integer index = firstSentenceLowerCase.indexOf(searchTerm);
  Integer length = searchTerm.length();
  System.out.println("Your search term is at index: " + index + ". The length of your term is " + length + " letters long.");
    String modifiedFirstSentence = firstSentence.replace(term, "");
    System.out.println(modifiedFirstSentence);
    }
}
