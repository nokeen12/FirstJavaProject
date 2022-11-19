public class App {
    public static void main(String[] args) throws Exception {
        String[] choices = { "rock", "paper", "scissors" };
        int test = (int)Math.round(Math.random()*2);
        System.out.println(choices[test]);
    }
}
