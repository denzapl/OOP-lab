public class Main {
    public static void main(String[] args) {
        printstars(5);
        printstars(3);
        printstars(9);
    }

    public static void printstars(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}