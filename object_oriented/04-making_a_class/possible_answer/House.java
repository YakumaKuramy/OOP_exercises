public class House {

	private String	name			= "Unknown";
	private String 	address 		= "Unknown";
	private Integer numberOfFloors 		= 1;
	private Integer numberOfBedrooms 	= 1;
	private Boolean hasBasement 		= false;

	private Integer numberOfBeds;

	House(){}

	House(String name) {
		this.name = name;
	}

	public String toString() {

		String basementMessage;
		if(this.hasBasement)
			basementMessage = "has a ";
		else
			basementMessage = "has no ";

		String message = this.name + " is located at " + this.address +
				".\nIt has " + numberOfFloors +" floors and " +
				"also " + basementMessage + "basement.";

		return message;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNumberOfFloors(Integer number) {
		this.numberOfFloors = number;
	}

	public void setHasBasement(Boolean answer) {
		this.hasBasement = answer;
	}

	public void setNumberOfBedrooms(Integer number) {
		this.numberOfBedrooms = number;
	}

	public void setNumberOfBeds(Integer number) {
		this.numberOfBeds = number;
	}
}
