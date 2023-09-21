import java.util.ArrayList;

public class Fridge {

	private ArrayList<Food> foodInside = new ArrayList<Food>();

	public String toString() {
		String message = "\nThis fridge has:\n";
		for(Food foodItem : foodInside) {
			message += foodItem.getName() + ": " + 
						foodItem.getQuantity() + " " +
						foodItem.getUnit() + "\n";
		}
		message += "\n";

		return message;
	}

	public String presentItems() {
		String message = "This fridge items:\n";
		for(Food foodItem : foodInside) {
			message += foodItem.getName() + "\n";
		}
		return message;
	}
	
	public void addFood(String foodName, Double foodQuantity, String unit) {

		if((foodName == null) || (foodQuantity == null) || (unit == null)
			|| (foodName == "") || (foodQuantity == 0) || (unit == "")) {

			System.out.println("All fields must have values");
			return;
		}

		if(foodQuantity < 0) {
			System.out.println("Invalid quantity, negative quantities" + 
						" of that can't exist.");
			return;
		}

		foodName	= foodName.toLowerCase();
		unit 		= unit.toLowerCase();

		Food foodItem 	= takeThisFoodInside(foodName);

		if(foodItem == null){
			foodItem = new Food(foodName, foodQuantity, unit);
			foodInside.add(foodItem);
		}
		else {
			if(foodItem.getUnit() != unit){
				System.out.print("Error: This fridge already has" +
						 " that food on a different unit");
				return;
			}
			foodItem.add(foodQuantity);
		}
		
	}

	private Food takeThisFoodInside(String foodName){

		for(Food foodItemInside : this.foodInside) {
			if(foodName.equals(foodItemInside.getName())) { // In java it is essencial
									// to use equals method to
									// compare objects
				return foodItemInside;
			}
		}

		return null;
	}

	public void removeFood(String foodName, Double quantity) {

		foodName = foodName.toLowerCase();

		Food foodItem = takeThisFoodInside(foodName);

		if(foodItem == null){
			System.out.println("The " + foodName + " was not found " +
				       		"inside this fridge.");
			return;
		}

		if(foodItem.getQuantity() <= quantity) {
			System.out.println("Removing the maximum of " + foodName +
						": " + quantity + " " + foodItem.getUnit() + ".");
			foodInside.remove(foodItem);
		}
		else{
			System.out.println("Removing " + quantity + " " + foodItem.getUnit() + 
						" of " + foodName + ".");
			foodItem.reduce(quantity);
		}
	}
}
