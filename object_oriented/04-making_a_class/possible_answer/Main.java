public class Main {
	public static void main(String[] args) {

		House paperStreet = new House("Paper Street House");

		paperStreet.setAddress("420 Paper St. Wilmington DE 19886");
		paperStreet.setNumberOfFloors(2);
		paperStreet.setHasBasement(true);
		paperStreet.setNumberOfBedrooms(2);
		paperStreet.setNumberOfBeds(74);

		System.out.println(paperStreet);// Making use of the Inheritance
		System.out.println();	    	// from the object class

		House simple = new House();
		System.out.println(simple); 	// Making use of the Inheritance
					    	// from the object class

	}
}
