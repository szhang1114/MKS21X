public class Driver{
    public static void main(String[]args) {
	Barcode a = new Barcode("12346789");
	Barcode b = new Barcode("85926");
	System.out.println(a);
	System.out.println(b);
	String code = "|||:::|::|::|::|:|:|::::|||::|:|";
	System.out.println(toZip(code));
	Barcode c = new Barcode("a3df4");
    }

}
