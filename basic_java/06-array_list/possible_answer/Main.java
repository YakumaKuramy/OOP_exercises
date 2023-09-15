import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(9);
		list.add(4);
		list.add(44);
		list.add(6);
		list.add(1);

		int middleIndex 	= list.size()/2; 			// Indexes must be int
										// because of the other
										// working option on the
										// function the remove
										// method

		Integer middleValue 	= list.remove(middleIndex);

		System.out.println(middleValue);
		System.out.println(list);
	}
}
