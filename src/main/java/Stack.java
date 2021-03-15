public interface Stack<T> extends List {

	public abstract boolean isEmpty();

	public abstract void push(T elm);

	public abstract T pop();

}
