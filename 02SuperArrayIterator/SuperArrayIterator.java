import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{

    private  SuperArray arry;
    private int element;

    public SuperArrayIterator(SuperArray superarray, int element){
	arry = superarray;
	this.element = element;
    }

    public boolean hasNext(SuperArray superarray){
	return element < superarray.length;
    }

    public String next(){
	if(hasNext()){
	    element ++;
	    return this.[element];
	}
	else {
	    throw new NoSuchElementException();
	}
    }

    public void remove(SuperArray superarray){
	throw new UnsupportedOperationException();
    }

    public Iterator<String> iterator(){
	return new SuperArrayIterator(this, 0);
    }
}
