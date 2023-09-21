public class Main {
	public static void main(String[] args) {

		Fridge myFridge = new Fridge();

		myFridge.addFood("Apple", 2.0, "kg");
		myFridge.addFood("Watermelon", 3.0, "kg");
		myFridge.addFood("Ketchup", 1.0, "bottle");

		System.out.println(myFridge.presentItems());
		System.out.println();
		System.out.println(myFridge);

		myFridge.removeFood("Apple", 0.5);
		myFridge.removeFood("Watermelon", 4.0);
		myFridge.removeFood("Banana", 2.0);

		System.out.println(myFridge);
	}
}
