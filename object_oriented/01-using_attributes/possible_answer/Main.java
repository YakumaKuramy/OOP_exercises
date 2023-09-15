public class Main {
	public static void main(String[] args){

		Book myBook = new Book();

		myBook.author 		= "R.R. Martin";
		myBook.releaseYear 	= 1996;
		myBook.title 		= "A song of ice and fire";

		System.out.println(	"Author: " 	+ myBook.author 	+
					"\nRelease: " 	+ myBook.releaseYear 	+
					"\nTitle: "	+ myBook.title);
	}
}
