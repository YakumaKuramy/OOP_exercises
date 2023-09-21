public class Number {

	private Double number;

	Number(Double number) {
		this.number = number;
	}

	public String toString() {
		return Double.toString(this.number);
	}

	public void pow(Integer inputNumber) {
		if(this.number == 0) {
			return;
		}
		else if(inputNumber == 0) {
			this.number = 1.0;
			return;
		}
		else if(inputNumber < 0) {
			this.number = 1/this.number;
			inputNumber *= -1;
		}
		for(Integer i = 0; i < inputNumber; i++) {
			this.number *= this.number;
		}
	}
}
