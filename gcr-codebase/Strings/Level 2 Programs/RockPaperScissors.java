import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "Rock";
        if (n == 1) return "Paper";
        return "Scissors";
    }

    static String findWinner(String user, String comp) {

        if (user.equals(comp))
            return "Draw";

        if (user.equals("Rock") && comp.equals("Scissors") ||
            user.equals("Paper") && comp.equals("Rock") ||
            user.equals("Scissors") && comp.equals("Paper"))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[] userChoice = new String[games];
        String[] compChoice = new String[games];
        String[] winner = new String[games];

        // Input first
        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice for game " + (i + 1) + ": ");
            String input = sc.next();

            userChoice[i] =
                input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

            compChoice[i] = computerChoice();
            winner[i] = findWinner(userChoice[i], compChoice[i]);
        }

        // Print table after all inputs
        System.out.println("\nGame  User       Computer    Winner");
        System.out.println("------------------------------------");

        for (int i = 0; i < games; i++) {
            System.out.println(
                (i + 1) + "     " +
                userChoice[i] + "       " +
                compChoice[i] + "    " +
                winner[i]
            );
        }

        sc.close();
    }
}
