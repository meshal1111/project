
public class LinkedList<T> {
public Node<T> head;
public Node<T> current;
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

	public T retrieve () {
	return current.data;//big O(1)
	}

	public void update (T val) {
	current.data = val;//big O(1)
	}

	public void insert(T val) {
	if(empty()) {
		head=current=new Node <T>(val);
	}
	else {
		Node tmp=current.next;
		current.next=new Node<T>(val);
		current=current.next;
		current.next=tmp;
	}//big O(1)
	}








}
