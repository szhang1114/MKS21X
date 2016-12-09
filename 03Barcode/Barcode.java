public class Barcode implements Comparable<Barcode>{

    private String zip;

    public Barcode(String zip){
        try{Integer.parseInt(zip);
	} catch (NumberFormatException e){
	    System.err.println("Not a valid zip");
	}
	this.zip = zip;
    }

    private int checkSum(){
	int sum = 0;
	for(int index = 0; index < 5; index ++){
	    sum += (int)zip.charAt(index);
	}
	System.out.println(sum);
	return sum;
    }
	    

	    
    public String toString(){
	String zip1 = zip + Integer.parseInt(zip)%10;
	String code = zip + " |";
	for(int index = 0; index < zip1.length(); index++){
	    char current = zip1.charAt(index);
	    switch (current){
	    case '0': code += "||:::"; break;
	    case '1': code += ":::||"; break;
	    case '2': code += "::|:|"; break;
	    case '3': code += "::||:"; break;
	    case '4': code += ":|::|"; break;
	    case '5': code += ":|:|:"; break;
            case '6': code += ":||::"; break;
	    case '7': code += "|:::|"; break;
	    case '8': code += "|::|:"; break;
	    case '9': code += "|:|::"; break;
	    default: break;
	    }
	}
	return code + "|";
    }
    public int compareTo(Barcode other){
	return 1;
    }

  

}
		    
	   
