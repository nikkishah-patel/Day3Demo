
public class JavaBasics {

	public static void main(String[] args) {
	final String TEST = "hello";
	//TEST = "no"; we cannot do this - the constant cannot be reassigned.
	
	//primitive type declarations
	byte b = 127;
	short s = 3276;
	int i = 1333;
	float fl = 6.7f;
	char c = 'c';
	boolean bool = true;
	long l = 1234554433l;
	
	//implicit conversion examples
	int numOfItems = 5;
	System.out.println(3.0/1.5);
	System.out.println(3.0/2);
	System.out.println((numOfItems + 10) / 2);
	System.out.println((numOfItems + 10) / 2.0);
	
	// explicit casting (type casting)
	double x = (double) 3/ (double) 5;
	double x1 = (double) (3/5); // prints 0.0 b/c division is done before casting
	System.out.println(x);
	
	// example 2 -- common error 
	
	int kidsInFamily1 = 3;
	int kidsInFamily2 = 4;
	int numOfFamilies = 2;
	
	double avgKidsPerFamily = (double) (kidsInFamily1 + kidsInFamily2) / numOfFamilies;
	System.out.println(avgKidsPerFamily);
	
	
	
	
	
	
	
	}

}
