public class exe2 {
	public static void main(String[] nilaiTerima) {
		int noInt = 123;
		int noInt2 = 345;
		double noDouble = 123.456;

		System.out.format("%6d and %4d", noInt, noInt2);
		System.out.format("\n");
		System.out.format("%4d", noInt2);
		System.out.format("\n");
		System.out.format("RM%7.1f", noDouble);
		System.out.printf("\nRM%7.3f and %6d", noDouble, noInt);
	}
}