import java.util.Scanner;

public class TrueFalse extends Question{
private boolean answer;

    public TrueFalse(String text, int points, boolean answer) {
        super(text, points);
        setPoints(1);
        this.answer = answer;
    }

    public boolean correctAnswer(boolean possibleAnswer) {
        if(possibleAnswer == answer) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void displayAnswers() {
        System.out.println("True or False");
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Is it true or false? Type t for true or f for false.");
String userResponse = answer.nextLine();
        if (userResponse.indexOf('t')>=0) {
            if (correctAnswer(true)) {
                return 1;
            } else {
                return 0;
            }
        } else {
     if(correctAnswer(false)) {
        return 1;
     } else {
         return 0;
     }
    }
}
}