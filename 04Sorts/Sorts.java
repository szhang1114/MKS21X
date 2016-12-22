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
    
    public static void insertionSort(int[] data){
	for(int start = 1; start < data.length; start ++){
	    for(int current = start; current > 0 && data[current] < data[current - 1]; current --){
		int swap = data[current - 1];
		if(data[current] < data[current -1]){
		    data[current - 1] = data[current];
		    data[current] = swap;
		}
	    }
	}
    }
    
    public static void bubbleSort(int[] data){
	for(int repeat = 0; repeat < data.length; repeat ++){
	    int swaps = 0;
	    for(int current = 0; current < data.length - 1; current ++){
		if(current == data.length - 1 && swaps == 0){
		    return ;
		}
		else if(data[current] > data[current + 1]){
		    int swap = data[current + 1];
		    data[current + 1] = data[current];
		    data[current] = swap;
		    swaps ++;
		}
	    }
	}
    }

    //public static void bubbleSort2(int[] data){
    //	for(int start = data.length - 1; start > 0; start --){
    //	    for(int current = 0; current < start; current ++){
		
		

    public static String toString(int[] data){
	String out = "[";
	for(int index = 0; index < data.length; index ++){
	    if(index == data.length - 1){
		out+= data[index];
	    }
	    else out += data[index] + ", ";
	}
	return out + "]";
    }

    public static void main(String[] args){
	int[] ary2 = new int[25];
	for(int i = 0; i < 25; i ++){
	    ary2[i] = (int)(Math.random() * 10);
	}
	//int[] ary3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	//System.out.println(toString(ary2));
	//selectionSort(ary2);
	//System.out.println(toString(ary2));
	int[] ary = new int[10000];
	for(int i = 0; i < 10000; i ++){
	    //ary[i] = (int)(Math.random() * 1000000);
	    ary[i] = i;
	}
	long startTime = System.currentTimeMillis();
        selectionSort(ary);
	long endTime = System.currentTimeMillis();
	System.out.println((endTime - startTime) / 1000.0);
	    
    }
}
