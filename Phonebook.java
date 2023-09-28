import java.util.Collections;
import java.util.Scanner;
public class Phonebook {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=0;
	
		while(x!=8) {
			//interface
		 System.out.println("Welcome to the Linked Tree Phonebook!\r\n"
		 		+ "Please choose an option:\r\n"
		 		+ "1. Add a contact\r\n"
		 		+ "2. Search for a contact\r\n"
		 		+ "3. Delete a contact\r\n"
		 		+ "4. Schedule an event\r\n"
		 		+ "5. Print event details\r\n"
		 		+ "6. Print contacts by first name\r\n"
		 		+ "7. Print all events alphabetically\r\n"
		 		+ "8. Exit");
		 //casting
		 
		  x=Integer.parseInt(input.nextLine());
		 
		}
		LinkedList<Contact> li = new LinkedList<Contact>();
		li.add(li,"asd", "a1", "a1", "a33", "a5", "a4");
		li.add(li,"ssd", "a10", "a30", "a40", "a10", "a30");
		li.add(li,"ss", "a1", "a1", "a33", "a22", "a77");
	    li.searchemail(li,"a1");
	    System.out.println("============");
	    li.searchBirthday(li, "a22");
	    System.out.println("============");
	    li.searchAddress(li, "a33");
		//System.out.println(li.searchname(li, "ssq"));
		//System.out.print(li.retrieve().getName());
	}//public static <T>  add(LinkedList<T> l){
		//System.out.print("Enter the contact's name:");
		//nam=input.nextLine();}
	

}
