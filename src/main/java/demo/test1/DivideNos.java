package demo.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DivideNos {

    public static void main(String[] args) {
        SpringApplication.run(DivideNos.class, args);
        DivideNos divideNos = new DivideNos();

        divideNos.divideNumbers(25, 5);
        divideNos.divideNumbers(5, 0);

    }

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