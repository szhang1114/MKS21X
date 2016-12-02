public class CirculatingBook extends LibraryBook{

    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String author, String title, String ISBN, String callNumber){
	super(author, title, ISBN, callNumber);
	currentHolder = null;
	dueDate = null;
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

    public void setDueDate(String due){
	dueDate = due;
    }

    public void checkout(String patron, String due){
	currentHolder = patron;
	dueDate = due;
    }

    public void returned(){
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus(){
	if (currentHolder == null){
	    return "book available on shelves";
	}
	else return "patron:" + currentHolder + "due:" + dueDate;

    }

    public String toString(){
	if (currentHolder == null){
	    return super.toString() + "patron:" + currentHolder + "due:" + dueDate;
	}
	else return super.toString() + circulationStatus();
    }

}
