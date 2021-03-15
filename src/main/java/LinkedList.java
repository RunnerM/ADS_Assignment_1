public class LinkedList<T> implements List {

    private Node head;

    private int size;

    /**
     * @see List#isEmpty()
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * @see List#size()
     */
    public int size() {
        return size;
    }


    /**
     * @see List#addToFront(T)
     */
    public void addToFront(Object T) {
        if (head == null) {
            head = new Node();
            head.setData(T);
            size = 1;
        } else {
            Node temp = new Node();
            temp.setData(T);
            temp.setNext(head);
            head = temp;
            size++;
        }
    }


    /**
     * @see List#removeFirst()
     */
    public T removeFirst() throws EmptyListException {
        if (head == null) {
            throw new EmptyListException();
        } else {
            Node temp = head;
            head = head.getNext();
            size--;
            return (T) temp.getData();

        }
    }

}
