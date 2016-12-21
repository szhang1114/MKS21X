public class temp{

    public static void main(String[] args) {
	System.out.println(CtoF(0));
	System.out.println(FtoC(32));
    }

    public static double CtoF(double cels) {
	return (9.0 / 5) * cels + 32;
    }

    public static double FtoC(double fahr) {
	return (5.0 / 9) * (fahr - 32);
    }

}
