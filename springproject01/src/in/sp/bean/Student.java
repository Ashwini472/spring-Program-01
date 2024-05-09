package in.sp.bean;

public class Student {
	private String name;
	private String email;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display()
	{
		System.out.println("rollno"+rollno);
		System.out.println("name"+name);

		System.out.println("email"+email);

	}
}
