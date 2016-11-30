public class Book{
    private String author;
    private String title;
    private String ISBN;

    public Book(){
    }

    public Book(String author, String title, String ISBN){
	author = author;
	title = title;
	ISBN = ISBN;
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


    public void toString(){
	System.out.print("title:" + title + ", ");
	System.out.print("author:" + author + ", ");
	System.out.print("ISBN:" + ISBN);
    }
