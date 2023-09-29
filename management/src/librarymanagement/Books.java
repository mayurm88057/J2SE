package librarymanagement;

public class Books {
	private String BookName;
	private String Author;

	public Books(String bookName, String author) {
		super();
		BookName = bookName;
		Author = author;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	@Override
	public String toString() {
		return "Books [BookName=" + BookName + ", Author=" + Author + "]";
	}

}

