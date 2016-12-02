public class Book{
    private String author;
    private String title;
    private String ISBN;

    public Book(){
    }

    public Book(String author, String title, String ISBN){
	this.author = author;
	this.title = title;
	this.ISBN = ISBN;
    }

    public String getTitle(){
	return title;
    }
    public String getAuthor(){
	return author;
    }
    public String getISBN(){
	return ISBN;
    }

    public void setTitle(String title){
	this.title = title;
    }
    public void setAuthor(String author){
	this.author = author;
    }
    public void setISBN(String ISBN){
	this.ISBN = ISBN;
    }


    public String toString(){
	return "title:" + title + ", author:" + author + ", ISBN:" + ISBN;
    }
