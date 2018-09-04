package examples;

public class TransposeMatrixExample {
	public void transposeMatrix() {
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int transpose[][]= new int[a.length][a.length];
		System.out.println("Before Transpose :");
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j] + " ");
				transpose[j][i]=a[i][j];
			}
		System.out.println();
		}
		System.out.println("After Transpose :");
		for (int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose.length;j++) {
				System.out.print(transpose[i][j] + " ");
			}
		System.out.println();
		}
	}
}
