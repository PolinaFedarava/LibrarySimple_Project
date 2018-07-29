package by.htp.library.librarian;

import  by.htp.library.entity.Library;



public class Librarian {
	public void printBooksAuthor(Library lib, String author) 
	{
		for (int i=0;i< lib.getMaxLengthOfBooks() ;i++ ) {
			for (int j=0; j< (lib.getBooks())[i].getMaxLengthAuthors(); j++) {
			if (((lib.getBooks())[i].getAuthor(j)).getAuthorSurname().equals(author))
			{
				System.out.println((lib.getBooks())[i].getNameBook());
			}
			}
		}
			
	}
	public void printBook(Library lib, String author, int YearPublishing, String NameBook) 
	{
		for (int i=0;i< lib.getMaxLengthOfBooks() ;i++ ) {
			for (int j=0; j< (lib.getBooks())[i].getMaxLengthAuthors(); j++) {
			if (
				  (((lib.getBooks())[i].getAuthor(j)).getAuthorSurname().equals(author)) &&
				  ((lib.getBooks())[i].getYearPublish()==YearPublishing ) &&
				  ((lib.getBooks())[i].getNameBook().equals(NameBook))
					
				)
			{
				System.out.println((lib.getBooks())[i].getNameBook());
				break;
			}
			}
		}
			
	}
	public void printAllBooks(Library lib) 
	{
		for (int i=0;i< lib.getMaxLengthOfBooks() ;i++ ) {
			
				System.out.println((lib.getBooks())[i].getNameBook());
			
		}
			
	}
	public void printOneBook(Library lib, String NameBook) 
	{
		for (int i=0;i< lib.getMaxLengthOfBooks() ;i++ ) {
			
			if (
				  
				  ((lib.getBooks())[i].getNameBook().equals(NameBook))
					
				)
			{
				System.out.println((lib.getBooks())[i].getNameBook());
				System.out.println((lib.getBooks())[i].getYearPublish());
				for (int j=0; j< (lib.getBooks())[i].getMaxLengthAuthors(); j++) 
				{
				System.out.println((lib.getBooks())[i].getAuthor(j).getAuthorSurname());
				}
				break;
				
			
			}	
		}
			
	}
}
