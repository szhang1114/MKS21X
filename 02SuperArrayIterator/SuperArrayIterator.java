import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{

    private String[] SuperArray;
    private int element;

    public SuperArrayIterator(String[] array, int element){
	this.array = array;
	this.element = element;
    }

    public boolean hasNext(String[] SuperArray){
	return element < SuperArray.length;
    }

    public String next(String[] SuperArray){
	if(hasNext()){
	    return SuperArray[element + 1];
	}
	else throw new NoSuchElementException();
    }

    public void remove(String[] SuperArray){
	throw new UnsupportedOperationException();
    }

    public Iterator<String> iterator(){
	return new SuperArrayIterator(SuperArray, element);
    }
}
