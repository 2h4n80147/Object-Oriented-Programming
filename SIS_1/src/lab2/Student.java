package lab2;

public class Student {

    private String name;
    private String id;
    private int year;
    public Student(String name, String id)
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

    public String toString() {
        return "Student (" + name + ", " + "id:" + id + ")";
    }
}