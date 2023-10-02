
public class Event implements Comparable<Event> {
	private  String title;
	private  String date;
	private  String time;
	private  String location;
	private  Contact contact;
	public Event( String title, String date,String time, String location, Contact contact) {	
		this.title = title;
		this.date = date;
		this.time = time;
		this.location = location;
		this.contact = contact;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//sort by name
	@Override
	public int compareTo(Event otherEvent) {
		  
			  return this.title.compareToIgnoreCase(otherEvent.title);
		  
		   
			
		
	}	
}
