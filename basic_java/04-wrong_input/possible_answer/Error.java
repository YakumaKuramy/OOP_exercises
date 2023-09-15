import java.util.Scanner;

public class Error {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Integer number = input.nextInt();
		String message = input.nextLine(); 

		input.close();

		System.out.println(message + number);
	}
}
