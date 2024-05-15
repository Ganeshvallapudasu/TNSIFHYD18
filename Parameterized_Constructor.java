package abc;



	public class Parameterized_Constructor {
	    private String make;
	    private String model;
	    private int year;

	    // Parameterized constructor
	    public Parameterized_Constructor(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    // Getter methods
	    public String getMake() {
	        return make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public static void main(String[] args) {
	        // Creating a Car object using the parameterized constructor
	    	Parameterized_Constructor car = new Parameterized_Constructor("Toyota", "Camry", 2022);

	        // Displaying the values using getter methods
	        System.out.println("Make: " + car.getMake());
	        System.out.println("Model: " + car.getModel());
	        System.out.println("Year: " + car.getYear());
	    }
	}
