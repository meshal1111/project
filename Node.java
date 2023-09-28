
public class Node<T> {
	public Contact data;
	public Node<T> next;

	public Node() {
		data = null;
		next = null;
	}

	public Node(Contact val) {
		data = val;
		next = null;
	}
}
