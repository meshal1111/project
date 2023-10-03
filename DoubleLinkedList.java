
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
	public boolean isconflict(Contact contact,String time) {
		current=head;
		while(current!=null) {
			if(current.data.getDateandtime().equalsIgnoreCase(time)&&current.data.getContact().equals(contact))
				return true;
			current=current.next;
		}
		return false;
	}
    public void Scheduleevent(String title, String dateandtime, String location, Contact contact) {
    	Event x=new Event(title,dateandtime,location,contact);
    	Nodes<T> tmp = new Nodes<T>(x);
		if(empty()) {
			current = head = tmp;
		}
		else { current=head;
		    if(x.compareTo(head.data)<0) { //the title is frist alphabetically
		    	head.previous=tmp;
		    	tmp.next=head;
		    	head=tmp;
		    }else {
		    while(current.next!=null&&x.compareTo(current.next.data)>0) 
			   current=current.next; //the title goes to its alphabetical place
			tmp.next = current.next;
			tmp.previous = current;
			if(current.next != null)
				current.next.previous = tmp;
			current.next = tmp;
			current = tmp;
		}}
    	
    	
    	
    }
	
    public void printAllEvents() {//for test only
         current = head;
        while (current != null) {
            Event event =  current.data;
            System.out.println("Title: " + event.getTitle());
            System.out.println("Date and Time: " + event.getDateandtime());
            System.out.println("Location: " + event.getLocation());
            System.out.println("Contact: " + event.getContact().getName());
            System.out.println("------------------------");
            current = current.next;
        }
    }
    public void printcontactshareevent(String title) {//for test only
        current = head;
        boolean x=false;//triggers
        boolean y=false;
       while (current != null) {
    	   if(current.data.getTitle().equalsIgnoreCase(title)) {
    		x=true;   
           Event event =  current.data;
           if(y==false) {
           System.out.print("all contacts that share event: " + event.getContact().getName() +" ");//frist time
           y=true;
           }else
        	   System.out.print( event.getContact().getName()+" ");
          
    	   }current = current.next;
       }if(x==false)
    	   System.out.println("there is no event with this title ");
       System.out.println();
   }
	
	
	
	
	}


