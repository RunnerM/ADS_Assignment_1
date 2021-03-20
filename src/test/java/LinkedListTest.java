import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList linkedList;


    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();


    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void isEmpty() {

        assertTrue(linkedList.isEmpty());
    }

    @Test
    void size() {

        linkedList.addToFront(7);
        linkedList.addToFront(5);
        assertEquals(2,linkedList.size());

    }

    @Test
    void addToFront() throws EmptyListException
    {

        linkedList.addToFront(1);
        linkedList.addToFront(3);
        assertEquals(3, linkedList.removeFirst());
    }

    @Test
    void removeFirst() throws EmptyListException
    {
        linkedList.addToFront(10);
        linkedList.addToFront(5);
        linkedList.removeFirst();
       assertEquals( 10,linkedList.removeFirst());
    }
    @Test
    void testExpectedException()
    {
        Assertions.assertThrows(EmptyListException.class, () -> {
            linkedList.addToFront(20);
            linkedList.removeFirst();
            linkedList.removeFirst();
        });
    }

}