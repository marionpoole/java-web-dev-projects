import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{
    private int answer;
private ArrayList<String> possibleAnswers;

    public MultipleChoice(String text, int points, int answer, ArrayList<String> possibleAnswers) {
        super(text, points);
        this.answer = answer;
        this.possibleAnswers = possibleAnswers;
setPoints(1);
    }

    @Override
    public void displayAnswers() {
for(int i = 0; i < possibleAnswers.size(); i++) {
    System.out.println(possibleAnswers.get(i));
}
    }

   public boolean correctAnswer(int possibleAnswer) {
       if (possibleAnswer == answer) {
           return true;
       } else {
           return false;
       }
   }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What is the correct answer? Enter the number that corresponds to the correct answer: ");
        String userResponse = answer.nextLine();
        int result = Integer.parseInt(userResponse);

        if (correctAnswer(result)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}