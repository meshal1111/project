
public class DoubleLinkedList<T> extends Nodes<T>{
	private Nodes<T> head;
	private Nodes<T> current;

	public DoubleLinkedList() {
		head = current = null;
	}

	public boolean empty() {
		return head == null;
	}// big O(1)

	public boolean last() {
		return current.next == null;
	}// big O(1)

	public boolean first() {
		return current.previous == null;
	}// big O(1)

	public boolean full() {
		return false;
	}// big O(1)

	public void findFirst() {
		current = head;
	}// big O(1)

	public void findNext() {
		current = current.next;
	}// big O(1)

	public void findPrevious() {
		current = current.previous;
	}// big O(1)

	public Event retrieve() {
		return current.data;
	}// big O(1)

	public void update(Event val) {
		current.data = val;
	}// big O(1)

	public boolean isconflict(Contact contact, String time) {
		current = head;
		while (current != null) {
			if (current.data.getDateandtime().equalsIgnoreCase(time) && current.data.getContact().equals(contact))
				return true; // check if contact have conflict or not
			current = current.next;
		}
		return false;
	}

	public void Scheduleevent(String title, String dateandtime, String location, Contact contact) {
		Event x = new Event(title, dateandtime, location, contact);
		Nodes<T> tmp = new Nodes<T>(x);
		if (empty()) {
			current = head = tmp;
		} else {
			current = head;
			if (x.compareTo(head.data) < 0) { // the title is frist alphabetically
				head.previous = tmp;
				tmp.next = head;
				head = tmp;
			} else {
				while (current.next != null && x.compareTo(current.next.data) > 0)
					current = current.next; // the title goes to its alphabetical place
				tmp.next = current.next;
				tmp.previous = current;
				if (current.next != null)
					current.next.previous = tmp;
				current.next = tmp;
				current = tmp;
			}
		}

	}// big O(n)

	public void removeEvent(DoubleLinkedList<T> l, String name) {
		if (l.empty()) {
			return;
		}
		current = head;
		// Remove the head node
		if (head.data.getContact().getName().equalsIgnoreCase(name)) {
			head = head.next;
			head.previous = null;
			return;
		}

		// Remove a node other than the head
		Nodes<T> prev = head;
		Nodes<T> current = head.next;

		while (current != null) {
			if (current.data.getContact().getName().equalsIgnoreCase(name)) {
				prev.next = current.next;
				if (current.next != null)
					current.next.previous = prev;

				return;
			}
			prev = current;
			current = current.next;
		}

	}

	public void printalphabetically() {
		if (this.empty()) {
			System.out.println("The linked list is empty.");
			return;
		}
		current = head;

		while (current != null) {
			if (current == head) {
				System.out.println("Title: " + current.data.getTitle());
			}else if (current.data.getTitle().equalsIgnoreCase(current.previous.data.getTitle()));  // if title repeted
				
			else
				System.out.println("Title: " + current.data.getTitle());

			current = current.next;
		}
	}

	public void printcontactshareevent(String title) {// for test only
		current = head;
		boolean x = false; // check if event existing or not
		boolean y = false; // printing in a different way for the frist time
		while (current != null) {
			if (current.data.getTitle().equalsIgnoreCase(title)) { // if he find the name
				x = true;
				Event event = current.data;
				if (y == false) {
					System.out.print("all contacts that share event: " + event.getContact().getName() + " ");// frist
																												// time
					y = true;
				} else
					System.out.print(event.getContact().getName() + " ");

			}
			current = current.next;
		}
		if (x == false)
			System.out.println("there is no event with this title ");
		System.out.println();
	}// big O(n)

	public void searchEventByContactName(String name) {
		current = head;
		boolean x = true; // check if is event with this contact
		while (current != null) {
			if (current.data.getContact().getName().equalsIgnoreCase(name)) { // search for contact
				x = false;
				Event event = current.data;
				System.out.println("Title: " + event.getTitle());
				System.out.println("Date and Time: " + event.getDateandtime());
				System.out.println("Location: " + event.getLocation());
				System.out.println("Contact: " + event.getContact().getName());
				System.out.println("------------------------");
			}
			current = current.next;
		}
		if (x)
			System.out.println("there is no event with this contact");

	}

	public void searchEventByEventName(String name, DoubleLinkedList<T> l) {
		current = head;
		boolean x = true; // check if is event with this title
		while (current != null) {
			if (current.data.getTitle().equalsIgnoreCase(name)) { // search for title
				Event event = current.data;
				x = false;
				System.out.println("Title: " + event.getTitle());
				System.out.println("Date and Time: " + event.getDateandtime());
				System.out.println("Location: " + event.getLocation());
				System.out.println("Contact: " + event.getContact().getName());
				System.out.println("------------------------");
				
			}
			current = current.next;
		}
		if (x)
			System.out.println("there is no event with this title");
	}
	}


