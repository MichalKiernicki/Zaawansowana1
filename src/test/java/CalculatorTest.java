import Basics.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.platform.commons.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    static Logger LOGGER = (Logger) LoggerFactory.getLogger(CalculatorTest.class); // dodawanie info do każdego testu

    @BeforeAll // odpali sie tylko raz przed odpaleniem wszystkiego
    static void setupAll() {
        LOGGER.info(() -> "SetupAll launched");
    }

    @BeforeEach // wykona się przed każdym testem osobno
    void setupEach() {
        LOGGER.info(() -> "setupEach Lunched");
        calculator = new Calculator();
    }

    @Test
    void testAddMethodTrue() {
        LOGGER.info(() -> "test ADD");
        //given
        calculator = new Calculator();
        double a = 3.0;
        double b = 5.0;

        //when
        double result = calculator.add(a, b);

        //then
        assertEquals(8.0, result);

        assertThat(result).as("wynik większy niż 9").isGreaterThan(7.0);
        assertNotEquals(9,8);
    }
        @Test
        void testMinMethodTrue() {
        LOGGER.info(() -> "Test MIN");

        double a = 4.0;
        double b = 1.0;

        double result = calculator.min(a,b);

        assertEquals(3.0,result);
        }
    @Test
    void testMultiMethodTrue() {
        LOGGER.info(() -> "Test Multi");

        double a = 4.0;
        double b = 4.0;

        double result = calculator.multi(a,b);

        assertEquals(16.0,result);
    }
    @Test
    void testDivMethodTrue() {
        LOGGER.info(() -> "Test Div");
        try {
            calculator.div(4,0);
            fail("Division by 0");
        } catch (ArithmeticException e) {
            assertThat(4).as("divide by 0").isNotEqualTo(4); // obsługa wyjątku dzielenia przez zero
        }

        double a = 4.0;
        double b = 0.5;

        double result = calculator.div(a,b);

        assertEquals(8.0,result);

    }

    }
