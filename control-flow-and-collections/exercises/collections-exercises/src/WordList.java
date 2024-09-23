import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
    public static void main(String[] args) {
       ArrayList<String> words = new ArrayList<>();
       words.add("shoe");
        words.add("skirt");
        words.add("pants");
        words.add("jacket");
        words.add("earring");
        words.add("hat");
        words.add("shorts");
        words.add("coat");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word size you would like to return: ");
        int wordSize = input.nextInt();
        for(int i = 0; i < words.size(); i++) {
            if(words.get(i).length() == wordSize) {
                System.out.println(words.get(i));
            }
        }
    }
}
