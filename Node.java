
public class Node<T> {
	protected Contact data;
	protected Node<T> next;

	public Node() {
		data = null;
		next = null;
	}

	public Node(Contact val) {
		data = val;
		next = null;
	}
}
