package abc;

public class Constructors_Rectangle {
    // Private variables
    private double length;
    private double width;

    // Constructor with parameters to initialize length and width
    public Constructors_Rectangle(double length, double width) {
        // Checking if length and width are positive numbers
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            System.out.println("Invalid dimensions. Length and width must be positive numbers.");
        }
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Creating an object of Rectangle class with constructor
        Constructors_Rectangle rectangle = new Constructors_Rectangle(5.0, 4.0);

        // Printing length and width using getter methods
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());

        // Calculating and printing area
        System.out.println("Area: " + rectangle.calculateArea());
    }
}

