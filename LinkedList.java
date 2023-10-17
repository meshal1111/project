
public class LinkedList<T> extends Node<T>{
	private Node<T> head;
	private Node<T> current;

	public LinkedList() {
		head = current = null;
	}

	public boolean empty() {
		return head == null;
		// big O(1)
	}

	public boolean last() {
		return current.next == null;// big O(1)
	}

	public boolean full() {
		return false;// big O(1)
	}

	public void findfirst() {
		current = head;// big O(1)
	}

	public void findnext() {
		current = current.next;// big O(1)
	}

	public Contact retrieve() {
		return current.data;// big O(1)
	}

	public void update(Contact val) {
		current.data = val;// big O(1)
	}

	public void add(LinkedList<T> l, String name, String phone, String email, String address, String birth,
			String note) {
		Contact x = new Contact(name, phone, email, address, birth, note);
		if (empty()) { // frist add
			head = current = new Node<T>(x);
		} else {
			current = head;
			if (x.compareTo(head.data) < 0) { // the name is frist alphabetically
				Node tmp = head;
				head = new Node<T>(x);
				head.next = tmp;
			} else {
				while (current.next != null && x.compareTo(current.next.data) > 0)
					current = current.next; // the name goes to its alphabetical place
				Node tmp = current.next;
				current.next = new Node<T>(x);
				current = current.next;
				current.next = tmp;

			}
		} // big O(n)
	}

	public void remove(LinkedList<T> l, String name, DoubleLinkedList<Event> s) {

		if (this.empty()) {
			System.out.println("The linked list is empty.");
			return;
		}
		current = head;
		// Case 1: Remove the head node
		if (head.data.getName().equalsIgnoreCase(name)) {
			head = head.next;
			System.out.println("the name " + name + " is removed!");
			s.removeEvent(s, name);
			return;
		}
		if(current.next==null)
			current=head
		else
			current=current.next

		// Case 2: Remove a node other than the head
		Node<T> prev = head;
		Node<T> curr = head.next;
                
		while (curr != null) {
			if (curr.data.getName().equalsIgnoreCase(name)) {
				prev.next = curr.next;
				System.out.println("the name " + name + " is removed!");
				if(current.next==null)
			              current=head
		                else
			           current=current.next
				s.removeEvent(s, name);
				return;
			}
			prev = curr;
			curr = curr.next;
		}
		

		System.out.println("The name is not found in the linked list.");
	}

	public boolean searchnameBoolean(LinkedList<T> l, String val) { // if he find the name return true
		l.findfirst();
		if (l.empty())
			return false;
		while (!l.last()) {
			if (l.retrieve().getName().equals(val)) // if he find the name
				return true;
			l.findnext();
		}
		if (l.retrieve().getName().equals(val)) // if the name in the last
			return true;

		return false;
	}

	public boolean searchphoneBoolean(LinkedList<T> l, String val) { // if he find the phone return true
		l.findfirst();
		if (l.empty())
			return false;
		while (!l.last()) {
			if (l.retrieve().getPhonenumber().equals(val)) // if he find the phone
				return true;
			l.findnext();
		}
		if (l.retrieve().getPhonenumber().equals(val)) // if the phone in the last
			return true;

		return false;
	}

	public Contact searchname(LinkedList<T> l, String val) { // if he find the name return the object
		if (l.empty())
			return null;
		l.findfirst();
		while (!l.last()) {
			if (l.retrieve().getName().equals(val)) // if he find the name
				return l.retrieve();
			l.findnext();
		}
		if (l.retrieve().getName().equals(val)) // if the name in the last
			return l.retrieve();

		else
			return null;

	}

	public Contact searchphone(LinkedList<T> l, String val) { // if he find the phone return the object
		if (l.empty())
			return null;
		l.findfirst();
		while (!l.last()) {
			if (l.retrieve().getPhonenumber().equals(val)) // if he find the phone
				return l.retrieve();
			l.findnext();
		}
		if (l.retrieve().getPhonenumber().equals(val)) // if the phone in the last
			return l.retrieve();

		else
			return null;
	}

	public void searchemail(LinkedList<T> l, String val) { // print all contact with this email
		l.findfirst();
		Boolean temp = false; // check if he find one email at least
		while (l.current != null) {
			if (l.retrieve().getEmail().equals(val)) { // if he find the email
				temp = true;
				System.out.println("Contact found!\r\n" + "Name:" + l.retrieve().getName() + " \r\n" + "Phone Number: "
						+ l.retrieve().getPhonenumber() + "\r\n" + "Email Address: " + l.retrieve().getEmail() + "\r\n"
						+ "Address: " + l.retrieve().getAddress() + "\r\n" + "Birthday: " + l.retrieve().getBirthday()
						+ "\r\n" + "Notes: " + l.retrieve().getNotes());
			}
			l.findnext();
		}
		if (!temp)
			System.out.println("ther is no one with this emil");
	}

	public void searchAddress(LinkedList<T> l, String val) { // print all contact with this address
		l.findfirst();
		Boolean temp = false; // check if he find one address at least
		while (l.current != null) {
			if (l.retrieve().getAddress().equals(val)) { // if he find the address
				temp = true;
				System.out.println("Contact found!\r\n" + "Name:" + l.retrieve().getName() + " \r\n" + "Phone Number: "
						+ l.retrieve().getPhonenumber() + "\r\n" + "Email Address: " + l.retrieve().getEmail() + "\r\n"
						+ "Address: " + l.retrieve().getAddress() + "\r\n" + "Birthday: " + l.retrieve().getBirthday()
						+ "\r\n" + "Notes: " + l.retrieve().getNotes());
			}
			l.findnext();
		}
		if (!temp)
			System.out.println("ther is no one with this address");
	}

	public void searchBirthday(LinkedList<T> l, String val) { // print all contact with this birthday
		l.findfirst();
		Boolean temp = false; // check if he find one birthday at least
		while (l.current != null) {
			if (l.retrieve().getBirthday().equals(val)) { // if he find the birthday
				temp = true;
				System.out.println("Contact found!\r\n" + "Name:" + l.retrieve().getName() + " \r\n" + "Phone Number: "
						+ l.retrieve().getPhonenumber() + "\r\n" + "Email Address: " + l.retrieve().getEmail() + "\r\n"
						+ "Address: " + l.retrieve().getAddress() + "\r\n" + "Birthday: " + l.retrieve().getBirthday()
						+ "\r\n" + "Notes: " + l.retrieve().getNotes());
			}
			l.findnext();
		}
		if (!temp)
			System.out.println("ther is no one with this birthday");
	}

	public void findByFirstName(String name) {
		current = head;
		boolean x = true; // check if frist name exist
		while (current != null) {
			String words[] = current.data.getName().split(" "); // split name
			if (words[0].equalsIgnoreCase(name)) {
				x = false;
				System.out.println("contacts found\nName: " + current.data.getName() + "\nPhone Number: "
						+ current.data.getPhonenumber() + "\nEmail Address: " + current.data.getAddress()
						+ "\nBirthday: " + current.data.getBirthday());
			}
			current = current.next;
		}
		if (x)
			System.out.println("there is no contact with this frist name");
	}
}

