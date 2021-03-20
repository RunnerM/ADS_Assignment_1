import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    LinkedStack<Token> linkedStack;

    @BeforeEach
    void setUp() {
        linkedStack = new LinkedStack<>();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void isEmpty() {
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    void push()
    {
        linkedStack.push(15);
        assertFalse(linkedStack.isEmpty());
    }

    @Test
    void pop() throws EmptyStackException
    {
        linkedStack.push(15);
        linkedStack.pop();
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    void testExpectedException()
    {
        Assertions.assertThrows(EmptyStackException.class, () -> {
            linkedStack.push(15);
            linkedStack.pop();
            linkedStack.pop();
        });
    }

}