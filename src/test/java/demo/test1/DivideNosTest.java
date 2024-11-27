package demo.test1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideNosTest {

    DivideNos divideNos;

    @BeforeAll
    public static void beforeAll() {

        System.out.println("All Tests for DivideNos");

    }

    @BeforeEach
    public void BeforeEach() {
        divideNos = new DivideNos();
    }

    @Test
    void divideNumbers() {
        assertEquals(5, divideNos.divideNumbers(25, 5));
    }

    @Test
    void divideNumbers2() {

        assertEquals(4, divideNos.divideNumbers(20, 5));

    }

    @Test
    void divideNumbers1() {

        assertThrows(ArithmeticException.class, () -> {
            divideNos.divideNumbers(1, 0);
        });

    }

}