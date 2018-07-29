package by.htp.library.entity;

public class Library {
	
	private Book[]  Books;
	private int lastIndex;
	
	private int maxLengthOfBooks = 1;
	
	public Library( ) {
		this.Books = new Book[getMaxLengthOfBooks()];
	}
	
//	public Library(int size) {
//		this.Books = new Book[size];		
//	}
	 
	
	public void addBook(Book book) 
	{
		if( lastIndex < getMaxLengthOfBooks() ) {
			Books[lastIndex] = book;
			lastIndex++;
		} else if ( lastIndex >= getMaxLengthOfBooks() ) {
			Book[] BooksNew = new Book[ lastIndex + 1 ];
			for( int w = 0; w < Books.length; w++ ) {
				BooksNew[w] = Books[w];
			}
			BooksNew[lastIndex] = book;
			Books = BooksNew;
			lastIndex++;
			setMaxLengthOfBooks(getMaxLengthOfBooks() + 1);
		} // end if
	}
	
	
	
	public Book[] getBooks() {
		return Books;
	}

	public int getMaxLengthOfBooks() {
		return maxLengthOfBooks;
	}

	public void setMaxLengthOfBooks(int maxLengthOfBooks) {
		this.maxLengthOfBooks = maxLengthOfBooks;
	}
}
