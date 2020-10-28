public class exe1 {
	public static void main(String[] nilaiTerima) {
		// System.out.println("Nilai 1 : " + nilaiTerima[0]);
		// System.out.println("Nilai 2 : " + nilaiTerima[1]);
		// System.out.println("Nilai 3 : " + nilaiTerima[2]);

		int sum = 0;

		for (int i=0; i<nilaiTerima.length; i++) {
			System.out.println("Nilai : " + nilaiTerima[i]);
			sum += Integer.parseInt(nilaiTerima[i]);
			
		}
		
		System.out.println("Nilai sum : " + sum);
	}
}