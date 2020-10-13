public class Cycle {
	public static void main(String[] args) {
		/*int i;
		for(i = 0; i <= 20; i++) {
			System.out.println(i);
		}*/

		/*int a = 1;
		int result = 8;
		while (a <= 7) {
			result -= 2;
			System.out.println(result);
			a++;
		}*/

		int b = 9;
		int sum = 0;
		do {
			b = b + 2;
			sum += b;
		} while ( b < 19);
		System.out.println(sum);
	}
}
