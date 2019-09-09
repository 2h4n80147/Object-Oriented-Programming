class Student {
	
	private String name;
	private String id;
	private int year;
	Student(String name, String id) 
	{
		this.name = name;
		this.id = id;
		year = 1;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public void incYear() {
		year++;
	}
	public void print() {
		System.out.println("Id: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Year: " + getYear());
		System.out.println();
	}
}


public class P1 {
	
	public static void main(String args[]) {
		Student student = new Student("Lee", "18BD100100");
		for (int i = 0; i < 4; i++) {
			student.print();
			student.incYear();
		}
	}
}
