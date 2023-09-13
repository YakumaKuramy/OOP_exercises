import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String quote 	= input.nextLine();
		String f_name	= input.next();
		Integer age	= input.nextInt();
		Double height	= input.nextDouble();

		input.close();
		System.out.println("Took every thing well!");
	}
}
