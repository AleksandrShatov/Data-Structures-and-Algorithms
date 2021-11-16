package objects;

public class Person {

    private String lstName;
    private String firstName;
    private int age;

    public Person(String last, String first, int age) {
        this.lstName = last;
        this.firstName = first;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print("Last name: " + this.lstName);
        System.out.print(". First name: " + this.firstName);
        System.out.println(". Age: " + this.age);
    }

    public String getLast() {
        return this.lstName;
    }
}
