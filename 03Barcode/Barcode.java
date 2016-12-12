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

    public static String toCode(String zip, int checkDigit){
	if(zip.length() != 5){
	    throw new IllegalArgumentException("zip is not the correct length");
	}
	try{Integer.parseInt(zip);
	} catch (IllegalArgumentException e){
	    System.err.println("zip contains characters other than digits");
	}
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

    public static String codeToNum(String code){
	String out = "";
	for(int index = 0; index < 30; index += 5){
	    String current = code.substring(index, index + 5);
	    switch(current){
	    case "||:::": out += "0"; break;
	    case ":::||": out += "1"; break;
	    case "::|:|": out += "2"; break;
	    case "::||:": out += "3"; break;
	    case ":|::|": out += "4"; break;
	    case ":|:|:": out += "5"; break;
	    case ":||::": out += "6"; break;
	    case "|:::|": out += "7"; break;
	    case "|::|:": out += "8"; break;
	    case "|:|::": out += "9"; break;
	    default: out = "invalid code"; break;
	    }
	}
	return out;
    }


		
	    

    public static String toZip(String code){
	if(code.length() != 32){
	    throw new IllegalArgumentException("Length of barcode is not 32");
	}
	/*for(int counter = 0; counter < code.length(); counter ++){
	    if(code.charAt(counter) == ':' || code.charAt(counter) == '|'){
		throw new IllegalArgumentException("invalid barcode characters");
	    }
	    }*/
	if(code.charAt(0) != '|' || code.charAt(31) != '|'){
	    throw new IllegalArgumentException("first and last characters are not '|'");
	}
	if(codeToNum(code.substring(1,32)).compareTo("invalid code") == 0){
	    throw new IllegalArgumentException("invalid values for barcode");
	}
	return codeToNum(code.substring(1,32));
    }
	

	    
    public String toString(){
	return  toCode(this.zip, this.checkDigit);
    }

    public int compareTo(Barcode other){
	return this.zip.compareTo(other.zip);
    }
    /*public static void main(String[]args) {
	//Barcode a = new Barcode("12346789");
	Barcode b = new Barcode("85926");
	//System.out.println(a);
	System.out.println(b);
	String code = "|||:::|::|::|::|:|:|::::|||::|:|";
	System.out.println(toZip(code));
	Barcode c = new Barcode("a3df4");
	}*/

}
		    
	   
