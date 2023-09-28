
import java.util.Collections;
public class LinkedList<T> {
public Node<Contact> head;
public Node<Contact> current;
public LinkedList() {
head=current=null;	
}
    public boolean empty () {
	return head == null;
	//big O(1)
	}
	public boolean last () {
	return current.next == null;//big O(1)
	}

	public boolean full () {
	return false;//big O(1)
	}


	public void findfirst () {
	current = head;//big O(1)
	}

	public void findnext () {
	current = current.next;//big O(1)
	}

	public Contact retrieve () {
	return current.data;//big O(1)
	}

	public void update (Contact val) {
	current.data = val;//big O(1)
	}

	public void insert(Contact val) {
		search(LinkedList <T>,val);
	if(empty()) {
		head=current=new Node<Contact>(val);
	}
	else {
		Node tmp=current.next;
		current.next=new Node<Contact>(val);
		current=current.next;
		current.next=tmp;
	}//big O(1)
	}
public boolean search(LinkedList <T> l,T val) {
	while(!l.last()) {
		if(l.retrieve().equals(val))
			return true;
		l.findnext();
	}
	if(l.retrieve().equals(val))
		return true;
	
	return false;
}
public boolean advancedSearch(LinkedList <T> l,T val) {
	while(!l.last()) {
		if(l.retrieve().equals(val))
			return true;
		l.findnext();
	}
	if(l.retrieve().equals(val))
		return true;
	
	return false;
}
public void remove() {	
	if(head==current)
		head=head.next;
	else {
		Node <Contact> tmp=head;
	while(tmp.next!=current) 
		tmp=tmp.next;
	
	tmp.next=current.next;
	if(current.next==null)
		current=head;
	else
		current=current.next;
}
}

