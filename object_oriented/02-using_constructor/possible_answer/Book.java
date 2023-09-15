public class Book {

	private String author;
	private String title;
	private Integer releaseYear;
	
	Book(String author, String title, Integer releaseYear) {
		this.author 	= author;
		this.title 	= title;
		this.releaseYear= releaseYear;
	}

	public String toString() {		// Takes advantage of inherintance

		String message = "Author: " 	+ this.author +
				"\nRelease: " 	+ this.releaseYear +
				"\nTitle: "	+ this.title;
		
		return message;
	}
}
