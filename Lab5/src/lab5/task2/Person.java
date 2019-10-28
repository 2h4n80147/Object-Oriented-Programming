package lab5.task2;
public class Person {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Person(String name) {
        setName(name);
    }
    Person(){}

    @Override
    public String toString() {
        return "This is person, and has name: " + name;
    }

    @Override
    public boolean equals(Object obj) {

        return (obj.toString().equals( toString()));
    }
}