
public class DoubleLinkedList<T> extends Nodes<T>{
	private Nodes<T> head;
	private Nodes<T> current;
	
	public DoubleLinkedList() {
		head = current = null;
	}

	public boolean empty() {
		return head == null;
	}
	
	public boolean last() {
		return current.next == null;
	}
	public boolean first() {
		return current.previous == null;
	}
	public boolean full() {
		return false;
	}
	public void findFirst() {
		current = head;
	}
	public void findNext() {
		current = current.next;
	}
	public void findPrevious() {
		current = current.previous;
	}
	public Event retrieve() {
		return current.data;
	}
	public void update(Event val) {
		current.data = val;
	}
	public void insert(Event val) {
		Nodes<T> tmp = new Nodes<T>(val);
		if(empty()) {
			current = head = tmp;
		}
		else {
			tmp.next = current.next;
			tmp.previous = current;
			if(current.next != null)
				current.next.previous = tmp;
			current.next = tmp;
			current = tmp;
		}}
		public void remove() {
			if(current == head) {
				head = head.next;
				if(head != null)
				   head.previous = null;
			}
			else {
				current.previous.next = current.next;
				if(current.next != null)
				   current.next.previous = current.previous;
			}

			if(current.next == null)
				current = head;
			else
				current = current.next;
		}
	

	}


