public abstract class Question {
private int points;
private String text;

    public Question(String text, int points) {
        this.text = text;
        this.points = points;
    }

    public void displayQuestion() {
        System.out.println(text);
    }

    public void setPoints(int x) {
        this.points = x;
    }

    public int getPoints() {
        return this.points;
    }

    public abstract void displayAnswers();

    public abstract int getAnswers();
}
