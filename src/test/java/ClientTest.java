
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;
    ArrayList<Token> ZERO;
    ArrayList<Token> ONE;
    ArrayList<Token> MANY;
    ArrayList<Token> EXCEPTION;// Todo: this.

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

        MANY.add(operand1);
        MANY.add(operand2);
        MANY.add(operator1);
        MANY.add(operator1);
        MANY.add(operator2);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test
    void evaluateExpression() {
        assertTrue(client.evaluateExpression(MANY)==13);


    }
    //Todo: MARTON OG ANETT
}