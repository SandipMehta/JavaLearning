package examples;

public class OddEvenNumbers {
	public void findOddEvenNumbers(int a[]) {
		System.out.println("Odd Numbers :");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2 != 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Even Numbers :");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

}
