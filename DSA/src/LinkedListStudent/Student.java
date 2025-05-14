package LinkedListStudent;

public class Student {
	
	private int rollno;
	private String name;
	private int mark;
	private Student next;
	public Student(int rollno, String name, int mark) {
		
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
		next = null;
	}
	public Student() {
		rollno=0;
		name="null";
		mark=0;
		next=null;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Student getNext() {
		return next;
	}
	public void setNext(Student next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
	

}
