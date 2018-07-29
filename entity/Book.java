package by.htp.library.entity;
import  by.htp.library.entity.Author;

public class Book 
{
	private int YearPublishing;
	private Author [] Authors; 
	private String NameBook; 
	private int lastIndexAuthor;
	private int maxLengthAuthors = 1;
	
	public Book (){
		
	}
	
	public Book (int YearPublishing,  String NameBook) {
		
		this.YearPublishing = YearPublishing;
		this.Authors = new Author [getMaxLengthAuthors()];
		this.NameBook = NameBook;
	}

	public void addAuthor(Author author) 
	{
		if( lastIndexAuthor < getMaxLengthAuthors() ) {
			Authors [lastIndexAuthor] = author;
			lastIndexAuthor++;
		} else if ( lastIndexAuthor >= getMaxLengthAuthors() ) {
			Author[] AuthorsNew = new Author[ lastIndexAuthor + 1 ];
			for( int w = 0; w < Authors.length; w++ ) {
				AuthorsNew[w] = Authors[w];
			}
			AuthorsNew[lastIndexAuthor] = author;
			Authors = AuthorsNew;
			lastIndexAuthor++;
			setMaxLengthAuthors(getMaxLengthAuthors() + 1);
		} // end if
	}
	
	public int getYearPublish() 
	{
		return YearPublishing;
		
	}
	
	public void setYearPublishing ()
	{
		this.YearPublishing = YearPublishing; 
	}
	
	public Author[] getAuthors() {
		return Authors;
	}
	 
	public Author getAuthor(int Possition) {
		return Authors [Possition];
	}
	
	public String getNameBook() 
	{
		return NameBook;
		
	}
	
	public void setNameBook ()
	{
		this.NameBook = NameBook; 
	}
	public int getMaxLengthAuthors() {
		return maxLengthAuthors;
	}
	public void setMaxLengthAuthors(int maxLengthAuthors) {
		this.maxLengthAuthors = maxLengthAuthors;
	}
}
