import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "orb";
        System.out.println("Guess password : ");
        String guess = input.nextLine();
        if (guess.equals(password)){
            System.out.println("CORRECT !!!");
        } else if(!(guess.equals(password))) {
            System.out.println("WRONG !!!");
        }
    }
}