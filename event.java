package projec;

import java.time.LocalDate;
import java.time.LocalTime;

public class event extends contact {
	//Attribute
	private  String title;
	private LocalDate date;
	private LocalTime time;
	private String location;
	private contact contact;
	public event(String na, String p, String e, String a, String b, String no, String title, LocalDate date,
			LocalTime time, String location, projec.contact contact) {
		super(na, p, e, a, b, no);
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
