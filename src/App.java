import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] choices = { "rock", "paper", "scissors" };
        String value;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to play rock, paper, scissors? (Y/N): ");
        value = scanner.nextLine();
        System.out.println("You chose: " + value);
        if(value.equals("Y") || value.equals("y")){
            int test = (int)Math.round(Math.random()*2);
            System.out.print("Choose one [rock, paper, scissors]: ");
            value = scanner.nextLine().toLowerCase();
            scanner.close();
            System.out.println("Opponent chose: " + choices[test]);
            if((value.equals("rock") && choices[test].equals("paper")) || (value.equals("paper") && choices[test].equals("scissors")) || (value.equals("scissors") && choices[test].equals("rock"))){
                //lose
                System.out.println("You Lose...");
            }else if((value.equals("paper") && choices[test].equals("rock")) || (value.equals("scissors") && choices[test].equals("paper")) || (value.equals("rock") && choices[test].equals("scissors"))){
                //win
                System.out.println("You Win!!!");
            }else if(value.equals(choices[test])){
                //tie
                System.out.println("You Tied.");
            }else{
                //error
                System.out.println("Invalid choice!");
            }
        };
        System.out.println("Game Over...");
    }
}
