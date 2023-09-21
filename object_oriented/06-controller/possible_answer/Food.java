public class Food {

	private String  name;
	private String  unit;
	private Double quantity;

	Food(String name, Double quantity, String unit) {
		this.name 	= name;
		this.quantity 	= quantity;
		this.unit	= unit;
	}

	public String getName() {
		return this.name;
	}

	public String getUnit() {
		return this.unit;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void add(Double addition) {
		this.quantity += addition;
	}

	public void reduce(Double reduction) {
		this.quantity -= reduction;
	}
}
