import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String correctanswer = "carrot";
        while (true) {
            System.out.println("Type the password: ");
            String userpassword = reader.nextLine();
            if (userpassword.equals(correctanswer)) {
                System.out.println("Right!");
                System.out.println("The secret message is jjry qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}