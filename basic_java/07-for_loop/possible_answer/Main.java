import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for(Integer i = 0; i < 5; i++)
			list.add(i*2+11);

		System.out.println(list);
		for(Integer value : list)		// For each, on list
			System.out.println(value);
	}
}
