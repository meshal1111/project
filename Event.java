
public class Event implements Comparable<Event> {
	// Attibute
	private String title;
	private String dateandtime;
	private String location;
	private Contact contact;

	// Constructor
	public Event(String title, String dateandtime, String location, Contact contact) {
		this.title = title;
		this.dateandtime = dateandtime;
		this.location = location;
		this.contact = contact;
	}

	// setters and getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	// sort by title
	@Override
	public int compareTo(Event otherEvent) {

		return this.title.compareToIgnoreCase(otherEvent.title);

	}	
}
