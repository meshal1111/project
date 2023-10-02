
public class Nodes<T> {
	protected Event data;
	protected Nodes<T> next;
	protected Nodes<T> previous;

	public Nodes () {
		data = null;
		next = null;
		previous = null;
	}

	public Nodes (Event val) {
		data = val;
		next = null;
		previous= null;
	}

}
