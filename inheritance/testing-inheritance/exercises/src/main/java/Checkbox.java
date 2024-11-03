import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{

    private ArrayList<Integer> answer;
    private ArrayList<String> possibleAnswers;

    public Checkbox(String text, int points, ArrayList<Integer> answer, ArrayList<String> possibleAnswers) {
        super(text, points);
        this.answer = answer;
        this.possibleAnswers = possibleAnswers;
        setPoints(this.answer.size());
    }

    @Override
    public void displayAnswers() {
for(int i = 0; i < possibleAnswers.size(); i++) {
    System.out.println(possibleAnswers.get(i));
}
    }

    public int checkAnswers(ArrayList<Integer> check) {
      int answersCorrect = 0;
      for(int i = 0; i < check.size(); i++) {
          if(answer.contains(check.get(i))) {
              answersCorrect++;
          }
      }
      return answersCorrect;
    }

    @Override
    public int getAnswers() {
       ArrayList<Integer> userResponse = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers. To begin answering, select y.");
        Scanner userContinue = new Scanner(System.in);
        String toContinue = userContinue.nextLine();
        while(toContinue.indexOf('y') >= 0 && userResponse.size() <= possibleAnswers.size()) {
            System.out.println("Enter the number of the option you believe is correct: ");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            userResponse.add(option);
            System.out.println("For this question, there are multiple correct answers. To continue answering, select y. To finish answering select n.");
            toContinue = userContinue.nextLine();
        }
        return checkAnswers(userResponse);
    }
}
