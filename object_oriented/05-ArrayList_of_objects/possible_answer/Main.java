import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Number> list = new ArrayList<Number>();

		for(Integer i = 0; i < 10; i++){
			Double iDouble = Double.valueOf(i);
			Number numb = new Number(iDouble);
			list.add(numb);
		}

		for(Number numb : list) {
			System.out.println(numb);

			numb.pow(2);
			System.out.println(numb);

			numb.pow(-1);
			System.out.println(numb);
			System.out.println();
		}
	}
}
