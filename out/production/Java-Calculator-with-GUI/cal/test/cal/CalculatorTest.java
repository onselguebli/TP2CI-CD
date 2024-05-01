package cal;

import static org.junit.jupiter.api.Assertions.*;

import cal.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        calculator.text.setText("5");
        calculator.functionBtn[0].doClick();
        calculator.text.setText("3");
        calculator.functionBtn[4].doClick();
        assertEquals("8.0", calculator.text.getText());
    }

    @Test
    public void testSubtraction() {
        calculator.text.setText("10");
        calculator.functionBtn[1].doClick();
        calculator.text.setText("7");
        calculator.functionBtn[4].doClick();
        assertEquals("3.0", calculator.text.getText());
    }

    @Test
    public void testMultiplication() {
        calculator.text.setText("5");
        calculator.functionBtn[2].doClick();
        calculator.text.setText("4");
        calculator.functionBtn[4].doClick();
        assertEquals("20.0", calculator.text.getText());
    }

    @Test
    public void testDivision() {
        calculator.text.setText("10");
        calculator.functionBtn[3].doClick();
        calculator.text.setText("2");
        calculator.functionBtn[4].doClick();
        assertEquals("5.0", calculator.text.getText());
    }

    @Test
    public void testDecimal() {
        calculator.text.setText("3");
        calculator.functionBtn[7].doClick();
        calculator.functionBtn[7].doClick();
        assertEquals("3.", calculator.text.getText());
    }

    @Test
    public void testClearEntry() {
        calculator.text.setText("123");
        calculator.functionBtn[5].doClick();
        assertEquals("", calculator.text.getText());
    }

    @Test
    public void testClearAll() {
        calculator.text.setText("123");
        calculator.functionBtn[6].doClick();
        assertEquals("", calculator.text.getText());
        assertEquals(0.0, calculator.result, 0.0001);
        assertEquals(0, calculator.getX());
        assertEquals(0.0, calculator.temp, 0.0001);
        assertEquals(0.0, calculator.number, 0.0001);
        assertEquals(' ', calculator.operator);
    }

    @Test
    public void testMultipleOperations() {
        calculator.text.setText("5");
        calculator.functionBtn[0].doClick(); // +
        calculator.text.setText("3");
        calculator.functionBtn[1].doClick(); // -
        calculator.text.setText("2");
        calculator.functionBtn[2].doClick(); // *
        calculator.text.setText("4");
        calculator.functionBtn[3].doClick(); // /
        calculator.text.setText("2");
        calculator.functionBtn[4].doClick(); // =
        assertEquals("12.0", calculator.text.getText());
    }
}
