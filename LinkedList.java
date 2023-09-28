
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

		public Contact retrieve () {
		return current.data;//big O(1)
		}

		public void update (Contact val) {
		current.data = val;//big O(1)
		}
/*
		public void insert(T val) {
		if(empty()) {
			head=current=new Node <T>(val);
		}
		else {
			Node tmp=current.next;
			current.next=new Node<T>(val);
			current=current.next;
			current.next=tmp;
		}	}//big O(1)*/
		public  void  add(LinkedList <T> l,String na,String p,String e,String a,String b,String no) {
			Contact x =new Contact(na,p,e,a,b,no);
			if(empty()) {
				head=current=new Node<T>(x);
			}
			else {
				
				Node tmp=current.next;
				current.next=new Node <T>(x);
				current=current.next;
				current.next=tmp;
				
				}//big O(1)
		}
		public boolean searchnameB(LinkedList <T> l,String val) {
			l.findfirst();
			while(!l.last()) {
				if(l.retrieve().getName().equals(val))
					return true;
				l.findnext();
			}
			if(l.retrieve().getName().equals(val))
				return true;
			
			return false;
		}
		public boolean searchphoneB(LinkedList <T> l,String val) {
			l.findfirst();
			while(!l.last()) {
				if(l.retrieve().getPhonenumber().equals(val))
					return true;
				l.findnext();
			}
			if(l.retrieve().getPhonenumber().equals(val))
				return true;
			
			return false;
		}
		public Contact searchname(LinkedList <T> l,String val) {
			l.findfirst();
			while(!l.last()) {
				if(l.retrieve().getName().equals(val))
					return l.retrieve();
				l.findnext();
			}
			if(l.retrieve().getName().equals(val))
				return l.retrieve();
			
			else return null;
			
		}
		public Contact searchphone(LinkedList <T> l,String val) {
			l.findfirst();
			while(!l.last()) {
				if(l.retrieve().getPhonenumber().equals(val))
					return l.retrieve();
				l.findnext();
			}
			if(l.retrieve().getPhonenumber().equals(val))
				return l.retrieve();
			
			else return null;
		}
		
		public void searchemail(LinkedList <T> l,String val) {
			l.findfirst();
			Boolean temp=false;
			while(l.current!=null) {
				if(l.retrieve().getEmail().equals(val)) {
					temp=true;
					System.out.println("Contact found!\r\n"
							+ "Name:"+l.retrieve().getName()+" \r\n"
							+ "Phone Number: "+l.retrieve().getPhonenumber()+"\r\n"
							+ "Email Address: "+l.retrieve().getEmail()+"\r\n"
							+ "Address: "+l.retrieve().getAddress()+"\r\n"
							+ "Birthday: "+l.retrieve().getBirthday()+"\r\n"
							+ "Notes: "+l.retrieve().getNotes());}
				l.findnext();
			}
			if(!temp)
			System.out.println("ther is no one with this emil");}
		
		
		public void searchAddress(LinkedList <T> l,String val) {
			l.findfirst();
			Boolean temp=false;
			while(l.current!=null) {
				if(l.retrieve().getAddress().equals(val)) {
					temp=true;
					System.out.println("Contact found!\r\n"
							+ "Name:"+l.retrieve().getName()+" \r\n"
							+ "Phone Number: "+l.retrieve().getPhonenumber()+"\r\n"
							+ "Email Address: "+l.retrieve().getEmail()+"\r\n"
							+ "Address: "+l.retrieve().getAddress()+"\r\n"
							+ "Birthday: "+l.retrieve().getBirthday()+"\r\n"
							+ "Notes: "+l.retrieve().getNotes());}
				l.findnext();
			}if(!temp)
			 System.out.println("ther is no one with this address");}
		
		public void searchBirthday(LinkedList <T> l,String val) {
			l.findfirst();
			Boolean temp=false;
			while(l.current!=null) {
				if(l.retrieve().getBirthday().equals(val)) {
					temp=true;
					System.out.println("Contact found!\r\n"
							+ "Name:"+l.retrieve().getName()+" \r\n"
							+ "Phone Number: "+l.retrieve().getPhonenumber()+"\r\n"
							+ "Email Address: "+l.retrieve().getEmail()+"\r\n"
							+ "Address: "+l.retrieve().getAddress()+"\r\n"
							+ "Birthday: "+l.retrieve().getBirthday()+"\r\n"
							+ "Notes: "+l.retrieve().getNotes());}
				l.findnext();
			}if(!temp)
			System.out.println("ther is no one with this birthday");}
}

