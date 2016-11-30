public class CirculatingBook extends LibraryBook{

    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String author, String title, String ISBN, String callNumber){
	currentHolder = null;
    }

    public String getCurrentHolder(){
	return currentHolder;
    }

    public void setCurrentHolder(String patron){
	currentHolder = patron;
    }

    public String getDueDate(){
	return dueDate;
    }

    public void
