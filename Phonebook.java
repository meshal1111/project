import java.util.Scanner;

public class Phonebook {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		Scanner phonenumber = new Scanner(System.in);
		Scanner email = new Scanner(System.in);
		Scanner address = new Scanner(System.in);
		Scanner birthday = new Scanner(System.in);
		Scanner note = new Scanner(System.in);
		Scanner choose = new Scanner(System.in);
		Scanner test = new Scanner(System.in);
		Scanner title = new Scanner(System.in);
		Scanner dateandtime = new Scanner(System.in);
		Scanner location = new Scanner(System.in);
		int x = 0;
		LinkedList<Contact> li = new LinkedList<Contact>();
		DoubleLinkedList<Event> dli = new DoubleLinkedList<Event>();
		while (x != 9) {
			// interface
			System.out.println("Welcome to the Linked Tree Phonebook!\r\n" + "Please choose an option:\r\n"
					+ "1. Add a contact\r\n" + "2. Search for a contact\r\n" + "3. Delete a contact\r\n"
					+ "4. Schedule an event\r\n" + "5. Print event details\r\n" + "6. Print contacts by first name\r\n"
					+ "7. Print all events alphabetically\r\n" + "8. print contacts that share event\r" + "9. Exit");
              // casting
			boolean validInput = false;
			 while (!validInput) {
			try {
				x = Integer.parseInt(input.nextLine());
				validInput = true; // Exit the loop if input is valid
			} catch (Exception e) {
				System.out.println("Invalid input enter number");
				
			}}
			String n, p, e, a, b, N, t, T, dt, l, sn, sp, se, sa, sb, re, en;
			int q=0, ei=0;
			switch (x) {
			case 1:
				System.out.println("enter the name:");
				n = name.nextLine();
				System.out.println("enter your phonenumber:");
				p = phonenumber.nextLine();
				System.out.println("enter your email:");
				e = email.nextLine();
				System.out.println("enter your address:");
				a = address.nextLine();
				System.out.println("enter your birthday and play include it like that YY/MM/DD:");
				b = birthday.nextLine();
				System.out.println("enter the note if you want:");
				N = note.nextLine();
				System.out.println("  the name: " + n + "\r  the phonenumber: " + p + "\r  the email: " + e
						+ "\r  the address: " + a + "\r  the birthday: " + b + "\r  the note: " + N + "\r ");
				System.out.println("\r");
				if (li.searchnameBoolean(li, n) || li.searchphoneBoolean(li, p)) {
					System.out.println("this name/phone already added");
					break;
				}
				li.add(li, n, p, e, a, b, N);
				System.out.println("all has been succefully added!");
				break;
			case 2:
				System.out.println("Enter search criteria:\r\n" + "1. Name\r\n" + "2. Phone Number\r\n"
						+ "3. Email Address\r\n" + "4. Address\r\n" + "5. Birthday");
				boolean validInput2 = false;
				 while (!validInput2) {
				try {
				q = Integer.parseInt(input.nextLine());
				validInput2 = true; // Exit the loop if input is valid
				} catch (Exception s) {
					System.out.println("Invalid input enter number");
					
				}}
				switch (q) {
				case 1:
					System.out.println("enter the name you want to search: ");
					sn = name.nextLine();

					Contact contact = li.searchname(li, sn);
					if (contact == null)
						System.out.println("there is no name in the list");
					else
						System.out.println("the contact is found!\r the name is: " + contact.getName()
								+ "\rthe phonenumber is: " + contact.getPhonenumber() + "\rthe email is: "
								+ contact.getEmail() + "\rthe address is: " + contact.getAddress()
								+ "\rthe birth day is: " + contact.getBirthday() + "\rthe Note you wrote is: "
								+ contact.getNotes() + "\r");

					break;
				case (2):
					System.out.println("enter the phone number you want to search: ");
					sp = name.nextLine();

					Contact contact1 = li.searchphone(li, sp);
					if (contact1 == null)
						System.out.print("there is no name in the list");
					else
						System.out.println("the contact is found!\r the name is: " + contact1.getName()
								+ "\rthe phonenumber is: " + contact1.getPhonenumber() + "\rthe email is: "
								+ contact1.getEmail() + "\rthe address is: " + contact1.getAddress()
								+ "\rthe birth day is: " + contact1.getBirthday() + "\rthe Note you wrote is: "
								+ contact1.getNotes() + "\r");
					break;
				case (3):
					System.out.println("enter the email you want to search: ");
					se = name.nextLine();
					li.searchemail(li, se);
					System.out.println("\r");
					break;
				case (4):
					System.out.println("enter the address you want to search: ");
					sa = name.nextLine();
					li.searchAddress(li, sa);
					System.out.println("\r");
					break;
				case (5):
					System.out.println("enter the birthday you want to search: ");
					sb = name.nextLine();
					li.searchBirthday(li, sb);
					System.out.println("\r");
					break;
				default:

				}
				break;

			case (3):
				System.out.println("what name do you want to remove?");
				re = name.nextLine();
				li.remove(li, re, dli);
				break;
			case (4):
				System.out.println("enter the the contact to participate in the event:");
				en = name.nextLine();
				Contact contact = li.searchname(li, en);
				if (contact == null) {
					System.out.println("we are sorry there is no name in the list");
					break;
				} else {
					System.out.println("enter the title:");
					T = title.nextLine();
					System.out.println("enter the date and time(MM/DD/YYYY HH:MM):");
					dt = dateandtime.nextLine();
					System.out.println("enter the location:");
					l = location.nextLine();
					if (dli.isconflict(contact, dt)) {
						System.out.println("there is a conflict with other event");
						break;
					}
					dli.Scheduleevent(T, dt, l, li.searchname(li, en));
				}
				System.out.println("the event has been succefully scheduled!");
				break;
			case (5):
				System.out.println("enter search critiria\r1.contact name\r2.event title");
			boolean validInput5 = false;
			 while (!validInput5) {
			try {
				ei = Integer.parseInt(input.nextLine());
				validInput5 = true; // Exit the loop if input is valid
			} catch (Exception m) {
				System.out.println("Invalid input enter number");
				
			}}
				if (ei == 1) {
					System.out.println("enter the contact: ");
					t = test.nextLine();
					Contact contact2 = li.searchname(li, t);
					if (contact2 == null)
						System.out.println("we are sorry there is no name in the list\r");
					else {
						System.out.println("the contact has been found!");
						dli.searchEventByContactName(t);
						System.out.println("\r");
						break;
					}
				} else if (ei == 2) {
					System.out.println("enter the event title: ");
					t = test.nextLine();
					dli.searchEventByEventName(t, dli);
					System.out.println("\r");
					break;
				} else
					System.out.println("wrong number");
				    break;
			case (6):
				System.out.println("enter the contact frist name: ");
				t = test.nextLine();
				li.findByFirstName(t);
				System.out.println("\r");
				break;
			case (7):
				dli.printalphabetically();
				break;
			case (8):
				System.out.println("what event you want to see?");
				T = title.nextLine();
				dli.printcontactshareevent(T);
				break;
			case (9):
				System.out.println("thank you for using our code!");
				break;
			default:
				System.out.println("wrong number try again!");

			}
		}

	}
	

}
