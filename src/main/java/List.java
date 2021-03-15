public interface List<T> {

	EmptyStackException emptyStackException = null;

	EmptyListException emptyListException = null;

	public abstract boolean isEmpty();

	public abstract int size();

	public abstract void addToFront(T data);

	public abstract T removeFirst() throws EmptyListException;

}
