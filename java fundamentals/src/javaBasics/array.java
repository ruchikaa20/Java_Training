package javaBasics;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 34, 56, 75};
		
		int[] scores = new int[5];
		scores[0] = 12;
		scores[1] = 78;
		scores[2] = 45;
		scores[3] = 80;
		scores[4] = 65;
		
		int[] scores1 = new int[] {32, 23, 25, 78, 98};
		
		
		System.out.println(scores1[4]);
		System.out.println(scores1.length);
		
		for(int i=0; i<scores1.length; i++) {
			System.out.println(scores1[i]);
		}
		
	//enhanced for loop
		
		for(int i:scores1) {
			System.out.println(i + " ");
		}

	}

}
