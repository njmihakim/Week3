import java.util.Scanner;

public class exe3 {
	public static void main(String[] nilaiTerima) {
		
		String nama;
		int nombor;
		double noDouble;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number : ");
		nombor = input.nextInt();
		System.out.println("Number is : " + nombor);

		input.nextLine(); // to prevent skipping input
		System.out.println("Enter a name : ");
		nama = input.nextLine();
		System.out.println("Name is : " + nama);

		System.out.println("Enter a double : ");
		noDouble = input.nextDouble();
		System.out.println("Number is : " + noDouble);

		input.close();

		// int noInt = '10';
		// final static char CHARSAYA = 53; // final adalah constant variable
		// System.out.println("Char " + CHARSAYA);
		// CHARSAYA = 100;
		// System.out.println("Char " + CHARSAYA);

		// int [] tataInt = {10, 20, 30, 40};

		// for (int i=0; i<tataInt.length; i++){
		// 	System.out.println(tataInt[i]);
		// } 

		// for (int t : tataInt) {
		// 	System.out.println("For each :" + t);
		// }
	}
}