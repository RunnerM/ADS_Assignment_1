public class LinkedStack<T> implements Stack {

	private LinkedList linkedList;

	/**
	 * @see Stack#isEmpty()
	 */
	public boolean isEmpty() {
		if(linkedList == null){
			return true;
		}
		return linkedList.isEmpty();
	}


	/**
	 * @see Stack#push(T)
	 */
	@Override
	public void push(Object T) {
		if(linkedList== null){
			this.linkedList= new LinkedList();
		}
		linkedList.addToFront(T);
	}


	/**
	 * @see Stack#pop()
	 */
	public T pop() throws EmptyStackException {
		try{
			return (T) linkedList.removeFirst();
		}catch(EmptyListException e){
			throw new EmptyStackException();
		}
	}

}
