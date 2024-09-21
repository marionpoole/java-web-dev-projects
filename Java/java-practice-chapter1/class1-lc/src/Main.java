import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
    String result = input.nextLine();
        System.out.println("Hello " + result);

        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println(result + " is " + age);
        int ageIn2049 = getLaterAge(age);
        System.out.println("In 2049, Minnie will be " + ageIn2049);

        System.out.println("Half of Minnie's age is " + divideAge(age));
    }

    public static int getLaterAge(int age) {
        return age + 25;
    }

    public static double divideAge(int age) {
        return age / 2;
    }
}