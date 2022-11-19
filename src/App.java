import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        if(running){
            openMenu(running, scanner);
        }
        scanner.close();
        System.out.println("App Exited.");
    }

    public static void openMenu(boolean running, Scanner scanner){
        System.out.println("Main Menu");
        System.out.println("Continue By Selecting An Option In The Parenthesis ");
        System.out.println("Choose one: Play Game(play)| Quit(quit)");

        String value = scanner.next();

        if(value.equals("play")){
            gameMenu(running, scanner);
        }else if(value.equals("quit")){
            running = false;
        }else{
            System.out.println("Invalid Selection");
            openMenu(running, scanner);
        }
    }

    public static void gameMenu(boolean running, Scanner scanner){
        System.out.println("Current Games Available: ");
        System.out.println("Rock Paper Scissors(rps)");
        System.out.println("Select A Game Or Go Back To Main Menu(back)");

        String value = scanner.next();

        if(value.equals("rps")){
            rpsGame(running, scanner);
        }else if(value.equals("back")){
            openMenu(running, scanner);
        }else if(value.equals("quit")){
            running = false;
        }else{
            System.out.println("Invalid Selection");
            gameMenu(running, scanner);
        }
    }

    public static void rpsGame(boolean running, Scanner scanner){
        String[] choices = { "rock", "paper", "scissors" };
        String value;

        System.out.println("Currently Playing: Rock Paper Scissors");
        System.out.print("Ready(y) Or Go back(n)");
        value = scanner.next().toLowerCase();
        if(value.equals("y")){
            int test = (int)Math.round(Math.random()*2);
            System.out.print("Choose one (rock/paper/scissors): ");
            value = scanner.next().toLowerCase();
            checkWinner(running, value, choices[test]);
            rpsGame(running, scanner);
        }else if(value.equals("n")){
            gameMenu(running, scanner);
        }
    }

    public static void checkWinner(boolean running, String a, String b){
        if((a.equals("rock") && b.equals("paper")) || (a.equals("paper") && b.equals("scissors")) || (a.equals("scissors") && b.equals("rock"))){
            //lose
            System.out.println("Opponent chose: " + b);
            System.out.println("You Lose...");
        }else if((a.equals("paper") && b.equals("rock")) || (a.equals("scissors") && b.equals("paper")) || (a.equals("rock") && b.equals("scissors"))){
            //win
            System.out.println("Opponent chose: " + b);
            System.out.println("You Win!!!");
        }else if(a.equals(b)){
            //tie
            System.out.println("Opponent chose: " + b);
            System.out.println("You Tied.");
        }else if(a.equals("quit")){
            running = false;
        }else{
            //error
            System.out.println("Invalid choice!");
        }
    }
}
