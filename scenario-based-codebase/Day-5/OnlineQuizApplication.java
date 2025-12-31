/* 
Online Quiz Application 
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
            "1. Which keyword is used to create an object in Java?",
            "2. Which data type is used to store decimal values?",
            "3. Which loop is guaranteed to run at least once?",
            "4. Which keyword is used to inherit a class?",
            "5. Which method is the entry point of a Java program?"
        };

        // Options
        String[][] options = {
            {"a) class", "b) new", "c) void", "d) static"},
            {"a) int", "b) char", "c) float", "d) boolean"},
            {"a) for", "b) while", "c) do-while", "d) foreach"},
            {"a) this", "b) super", "c) extends", "d) implements"},
            {"a) main()", "b) start()", "c) run()", "d) execute()"}
        };

        int score = 0;

        // Loop through all questions
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char answer = sc.next().toLowerCase().charAt(0);

            // Answer checking using switch
            switch (i) {
                case 0:
                    if (answer == 'b') score++;
                    break;

                case 1:
                    if (answer == 'c') score++;
                    break;

                case 2:
                    if (answer == 'c') score++;
                    break;

                case 3:
                    if (answer == 'c') score++;
                    break;

                case 4:
                    if (answer == 'a') score++;
                    break;

                default:
                    System.out.println("Invalid question!");
            }
        }

        // Result
        System.out.println("\n==============================");
        System.out.println(" Quiz Completed Successfully ");
        System.out.println(" Your Score: " + score + " / " + questions.length);

        if (score == 5) {
            System.out.println(" Outstanding!");
        } else if (score >= 3) {
            System.out.println(" Good Job! Keep Practicing");
        } else {
            System.out.println(" Needs Improvement");
        }

        System.out.println("==============================");

        sc.close();
    }
}
