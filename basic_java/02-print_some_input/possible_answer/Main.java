import java.util.Scanner; // Scanner import

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	// Here it's defined
					       		// a scanner named "input"

		String message = input.nextLine(); 	// Here the scanner is
						  	// requested to recive
						  	// a whole line of input
						  	// and store it on variable
						  	// named message

		System.out.println(message);		// Prints what has been
							// stored on the variable
							// message

		Scanner.close();			// Closes the Scanner,
							// makes it easier to the
							// program to end 

	}
}
