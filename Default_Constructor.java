package abc;

public class Default_Constructor {
    private String name;
    private int age;

    // Default constructor
    public Default_Constructor() {
        name = "Ganesh";
        age = 18;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating a Person object using the default constructor
    	Default_Constructor person = new Default_Constructor();

        // Displaying the values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
