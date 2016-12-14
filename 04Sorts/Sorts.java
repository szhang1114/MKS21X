public class Sorts{

    public static String name(){
	return "10.Zhang.Steven";
    }

    public static void selectionSort(int[] data){
	for(int start = 0; start < data.length; start ++){
	    int swap = start;
	    int current = start + 1;
	    for(; current < data.length; current ++){
		int smallest = data[start];
		if(data[current] < data[start]){
		    smallest = data[current];
		    swap = current;
		    data[current] = data[start];
		    data[start] = smallest;
		}
	    }
	}
    }

    public static String toString(int[] data){
	String out = "[";
	for(int index = 0; index < data.length; index ++){
	    out += data[index] + ", ";
	}
	return out + "]";
    }

    public static void main(String[] args){
	int[] ary = {10, 6, 8 , 2, 4, 3, 11, 58, 65, 24, 1};
        selectionSort(ary);
	System.out.println(toString(ary));
	    
    }
}
