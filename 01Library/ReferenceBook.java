public class ReferenceBook extends LibraryBook{
    private String collection;

    public ReferenceBook(String author, String title, String ISBN, String callNumber, String collection){
	super(author, title, ISBN, callNumber);
	this.collection = collection
    }

    public String getCollection(){
	return collection;
    }
    
    public void setCollection(String newCollection){
	collection = newCollection;
    }
    
    public void checkout(){
	System.out.println("cannot checkout reference book");
	throw new UnsupportedOperationException();
    }

    public void returned(){
	System.out.println("reference book could not have been checked out--return impossible");
	throw new UnsupportedOperationException();
    }
    
    public String circulationStatus(){
	return "non-circulating reference book";
    }

    public String toString(){
	return super.toString() + ", collection: " + collection;
    }

	   
