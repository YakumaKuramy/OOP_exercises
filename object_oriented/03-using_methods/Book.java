public class Book {

	private String author;
	private String title;
	private Integer releaseYear;
	
	Book(String author, String title, Integer releaseYear) {
		this.author 	= author;
		this.title 	= title;
		this.releaseYear= releaseYear;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}
}
