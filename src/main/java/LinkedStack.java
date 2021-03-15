public abstract class LinkedStack<T> extends LinkedList implements Stack {

	private LinkedList list;

	private LinkedList linkedList;


	/**
	 * @see Stack#isEmpty()
	 */
	public boolean isEmpty() {
		return false;
	}


	/**
	 * @see Stack#push(T)
	 */
	@Override
	public void push(T elm) {

	}


	/**
	 * @see Stack#pop()
	 */
	public T pop() {
		return null;
	}

}
