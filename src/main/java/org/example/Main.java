package org.example;

public class Tasks {
    public static void main(String[] args) {




        import java.util.Random;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

            }
        }



        public class passwordProgram {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                String password = "carrot";


                System.out.println("Welcome to my password game!");
                System.out.print("Type the password: ");
                String userguess = scanner.next();

                while (true) {
                    if (userguess.equals(password)) {
                        System.out.println("Correct! ");
                        System.out.println("The secret is : jryy qbar! ");
                        break;
                    } else {
                        System.out.println("Wrong! ");
                        System.out.print("Type the password again : ");
                        userguess = scanner.next();
                    }
                }
            }
        }



        public class sumOfThree {
            public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
                int sum = 0;
                int read;

                System.out.println("Enter the first number : ");
                int number1 = reader.nextInt();
                sum += number1;

                System.out.println("Enter the second number : ");
                int number2 = reader.nextInt();
                sum += number2;

                System.out.println("Enter the third number : ");
                int number3 = reader.nextInt();
                sum += number3;

                System.out.println("Sum: " + sum);
            }
        }



        public class sumAddUntil0 {
            public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
                int sum = 0;

                while (true) {
                    int read = reader.nextInt();
                    if (read == 0) {
                        break;
                    }
                    sum += read;
                    System.out.println("The sum now is : " + sum);
                }
                System.out.println("Sum in the end : " + sum);
            }
        }



        public class numbersBetween {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("First: ");
                int firstNum = scanner.nextInt();

                System.out.print("Last : ");
                int lastNum = scanner.nextInt();

                while (firstNum <= lastNum) {
                    System.out.println(firstNum);
                    firstNum++;
                }
            }
        }



        public class powerOf {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Type a number : ");
                int n = scanner.nextInt();
                int sum = 0;


                for (int i = 0; i <= n; i++) {
                    int power = (int) Math.pow(2, i);
                    sum += power;
                }
                System.out.println("SUM IS " + sum);
            }
        }



        public class printSomething {
            public static void main(String[] args) {
                printText();
            }

            public static void printText() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("How many times should printText be utilized? ");
                int timesToPrint = scanner.nextInt();

                for (int i = 1; i <= timesToPrint; i++) {
                    System.out.println("In the beginning there were the swamp, the hoe and Java");
                }
            }
        }



        public class Main {
            public static void main(String[] args) {
                printStars(5);
                printStars(3);
                printStars(9);

            }

            private static void printStars(int amount) {
                for (int i = 1; i <= amount; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }


        public class printStarsPyramid {
            public static void main(String[] args) {
                drawStarsPyramid(3);
                reversePyramid(3);
                currentRowCount(3);
                currentColumnCount(3);

            }


            public static void drawStarsPyramid(int amount) {
                for (int i = 0; i <= amount; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
            }


            public static void reversePyramid(int amount) {
                for (int i = amount; i >= 1; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
            }



            public static void currentRowCount(int amount) {
                for (int i = 0; i <= amount; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            // What if I want it to print
            // 1
            // 1 2
            // 1 2 3
            // 1 2 3 4
            // 1 2 3 4 5


            public static void currentColumnCount(int amount) {
                for (int i = 0; i <= amount; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }



        public class randomNumber {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                int drawNumber = random.nextInt(10);
                System.out.print("Guess a number : ");

                int guess = scanner.nextInt();
                int guesscount = 1;

                while (true) {
                    if (guess == drawNumber) {
                        System.out.println("You guessed correctly !");
                        break;
                    } else if (drawNumber > guess) {
                        System.out.println("The number is bigger, guesses made : " + guesscount);
                        guesscount++;
                        System.out.print("Enter your guess : ");
                        guess = scanner.nextInt();
                        continue;
                    } else if (guess > drawNumber) {
                        System.out.println("The number is lesser, guesses made : " + guesscount);
                        guesscount++;
                        System.out.print("Enter your guess ");
                        guess = scanner.nextInt();
                        continue;
                    }
                }
            }
        }
    }
}