public class Node<T> {

	private T data;

	private Node next;

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public Node getNext() {
		return next;
	}

}
