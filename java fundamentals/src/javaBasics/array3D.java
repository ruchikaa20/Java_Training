package javaBasics;

public class array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][][] arr3d = { {{1,2,3,4}, {5,6,7,8}, {9,3,4,6}}, {{9,3,7,1}, {2,8,1,4}, {5,2,7,6}} };
		
		for(int i=0; i<arr3d.length; i++) {
			for(int j=0; j<arr3d[i].length; j++) {
				for(int k=0; k<arr3d[i][j].length; k++) {
					System.out.print(arr3d[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	
		System.out.println("using enhanced for loop");
		
	//using enhanced for loop
	for(int[][] layer : arr3d) {	
		for(int[] row : layer) {
			for(int num: row) {
				System.out.print(num+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	}

}
