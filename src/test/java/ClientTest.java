
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;
    ArrayList<Token> ZERO;
    ArrayList<Token> ONE;
    ArrayList<Token> MANY;
    ArrayList<Token> EXCEPTION;
    MalformedExpressionException malformedExpressionException;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client();
        ZERO = new ArrayList();
        MANY = new ArrayList();
        ONE = new ArrayList();
        EXCEPTION = new ArrayList();

        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        Operand operand3 = new Operand();
        Operator operator1 = new Operator();
        Operator operator2 = new Operator();
        operand1.setValue(12);
        operand2.setValue(14);
        operand3.setValue(2);

        operator1.setOperation(Operation.ADD);
        operator2.setOperation(Operation.DIV);

        ONE.add(operator1);

        MANY.add(operand1);
        MANY.add(operand2);
        MANY.add(operator1);
        MANY.add(operand3);
        MANY.add(operator2);

        EXCEPTION.add(operand1);
        EXCEPTION.add(operator1);
        EXCEPTION.add(operator2);
        EXCEPTION.add(operator1);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test
    void evaluateExpression() {

        try {
            assertTrue(client.evaluateExpression(MANY)==13);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }


    }

    @org.junit.jupiter.api.Test
    void evaluateExpressionOne() {
        assertThrows(MalformedExpressionException.class, ()->client.evaluateExpression(ONE));
    }

    @org.junit.jupiter.api.Test
    void evaluateExpressionZero() {
        assertThrows(MalformedExpressionException.class, ()->client.evaluateExpression(ZERO));

    }
    @org.junit.jupiter.api.Test
    void evaluateExpressionException() {
        assertThrows(MalformedExpressionException.class, ()->client.evaluateExpression(EXCEPTION));
    }

}