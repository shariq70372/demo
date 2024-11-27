package demo.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication

public class DivideNos {

    public static void main(String[] args) {
        SpringApplication.run(DivideNos.class, args);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, Enter your Name.");
        String name = scanner.nextLine();

        System.out.println("Enter First Int.");
        int a = scanner.nextInt();
        System.out.println("Enter Second Int.");
        int b = scanner.nextInt();

        DivideNos divideNos = new DivideNos();
        divideNos.divideNumbers(a, b);
        //divideNos.divideNumbers(5, 0);



        User user = new User();
        user.setUserInfo(name);
        user.displayUserInfo();
        showMessage("You Made it Limpdick ")
    }


    public static void showMessage(String message) {
        System.out.println("Message: " + message);
    }
    /**
     * divideNumbers method provides basic arithmetic Division.
     * @author Maaz
     * @param a the first integer
     * @param b the second integer
     * @return the result of division from a and b.
     * @throws ArithmeticException if result is Zero.
     */
    public int divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Enter Non Zero Number.");

        }
        return a / b;
    }

}

