public class Barcode implements Comparable<Barcode>{

    private String zip;
    private int checkDigit;

    public Barcode(String zip){
        try{Integer.parseInt(zip);
	} catch (NumberFormatException e){
	    System.err.println("Not a valid zip");
	}
	this.zip = zip;
	checkDigit = checkSum(zip)%10;
    }

    private static int checkSum(String zip){
	int sum = 0;
	for(int index = 0; index < 5; index ++){
	    sum += (int)zip.charAt(index);
	}
	return sum;
    }

    public static String toBarcode(String zip){
	String zip1 = zip + checkDigit;
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

	    
    public String toString(){
	return toBarcode(this.zip, this.checkDigit);
    }

    public int compareTo(Barcode other){
	return this.zip.compareTo(other.zip);
    }

  

}
		    
	   
