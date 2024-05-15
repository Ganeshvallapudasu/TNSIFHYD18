package abc;

public class Person {
    // Private variables
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) {  // Making sure age is not negative
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        // Creating an object of Person class
        Person person = new Person();

        // Setting name using setter method
        person.setName("Ganesh");

        // Setting age using setter method
        person.setAge(30);

        // Getting and printing name and age using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

