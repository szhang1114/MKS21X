import java.util.Iterator;

public class SuperArray implements Iterable<String>{
    private String[] data;
    private int size;

    public SuperArray(){
        data = new String[10];
	size = 0;
    }
    public SuperArray(int size){
	if (size < 0){
	    throw new IllegalArgumentException();
	}
	data = new String[size];
	size = 0;
    }
    public int size(){
	return size;
    }
    public void grow(){
        String[] ary = new String[data.length * 2 + 1];
	for (int a = 0; a  < size; a++){
	    ary[a] = data[a];
	}
	data = ary;
    }
	
    public String toString(){
        String a = "[";
	int x;
	for (x = 0; x < size; x++){
	    if (x == size - 1){
		a += " " + data[x];
	    }
	    else a += " " + data[x] + ",";
	}
	a += "]";
	return a;
    }
    public String toStringDebug(){
	String a = "[";
	int y;
	for (y = 0; y < data.length; y++){
	    if (y == data.length - 1){
		a += " _";
	    }
	    else if (y >= size){
		a += " _,";
	    }
	    else if (y < size){
		a += " " + data[y];
	    }
	    else a += " " + data[y] + ",";
	}
	a += "]";
	return a;
    }
    public boolean add(String  element){
	if (size == data.length){
	    grow();
	}
	data[size] = element;
	size ++;
	return true;
    }
    public void add(int index, String element){
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	size ++;
       	int position = size - 1;
	while (position > index){
	    String old = data[position - 1];
	    data[position] = old;
	    position --;
	}
       	data[index] = element;
	}
    public void remove (int index){
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	int position = index;
	while (position < size){
	    String old = data[position + 1];
	    data[position] = old;
	    position ++;
	}
	size --;
    }
    public String get(int index){
	if (index > size - 1 || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }
    public void clear(){
	size = 0;
    }
    public boolean isEmpty(){
	if (size == 0){
	    return true;
	}
	else return false;
    }
    public String set(int index, String element){
	if (index > size - 1 || index < 0){
	    throw new IndexOutOfBoundsException();
	}	
	String oldElement = data[index];
	data[index] = element;
	return oldElement;
    }

    public String[] toArray(){
        String[] ary = new String[size];
	int a;
        for (a = 0; a < size; a++){
	    ary[a] = data[a];
	}
	return ary;
    }
    public int indexOf(String i){
	int position = 0;
	while (position < size){
	    if (data[position].equals(i)){
		return position;
	    }
	    else position ++;
	}
	return -1;
    }
    public int lastIndexOf(String i){
	int position = size - 1;
	while (position > -1){
	    if (data[position].equals(i)){
		return position;
	    }
	    else position --;
	}
	return -1;
    }
    public Iterator<String> iterator(){
	return new SuperArrayIterator(this, 0);
    }
	
	
}
