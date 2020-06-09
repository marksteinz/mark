public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 31;
		float height = 1.78f;
		boolean isMaleSex = true;
		char firstLetterName = 'M';

		if(age > 20) {
			System.out.println("Old");
		}

		if(isMaleSex) {
			System.out.println("Man");
		}

		if(!isMaleSex) {
			System.out.println("Woman");
		}

		if(height < 1.80) {
			System.out.println("Not height");
		}

		if(firstLetterName == 'M') {
			System.out.println("Mark");
		} else if(firstLetterName == 'I') {
			System.out.println("Indie");
		} else {
			System.out.println("Does not matter");
		}
	}
}
