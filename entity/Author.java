package by.htp.library.entity;

public class Author 
{
	private String AuthorName;
	private String AuthorSurname;
	private String AutorPatronymic;
	private int AutorYearBirth;
	
	public Author() { 
		
	}
	
	public Author (String AuthorName, String AuthorSurname, 
			String AutorPatronymic, int AutorYearBirth ) 
	{
		this.AuthorName = AuthorName;
		this.AuthorSurname = AuthorSurname;
		this.AutorPatronymic = AutorPatronymic;
		this.AutorYearBirth = AutorYearBirth;
	}
	
	public String getAuthorName() 
{
	return AuthorName;
}

	public void setAuthorName(String authorName) 
{
	AuthorName = authorName;
}

	public String getAuthorSurname() {
	return AuthorSurname;
}

	public void setAuthorSurname(String authorSurname) {
	AuthorSurname = authorSurname;
}

	public String getAutorPatronymic() {
	return AutorPatronymic;
}

	public void setAutorPatronymic(String autorPatronymic) {
	AutorPatronymic = autorPatronymic;
}

	public int getAutorYearBirth() {
	return AutorYearBirth;
}

}
