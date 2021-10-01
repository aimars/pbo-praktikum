public class MDArrayJava {
	public static void main(String[] args) {
		//One dimensional arrays
		int[] firstArray = {2, 5, 3};
		int[] secondArray = {9, 5, 3};
		int[] thirdArray = {2, 4, 9};
		int[] fourthArray = {10, 11, 12};
		int[] fifthArray = {13, 14, 15};
		int[] sixthArray = {16, 17, 18};
		int[] seventhArray = {19,20,21};
		int[] eighthArray = {22,23,24};
		int[] ninthArray = {25,26,27};
		
		//two dimensional array
		int[][] twoDimArray1 = {firstArray, secondArray, thirdArray};
		int[][] twoDimArray2 = {fourthArray, fifthArray, sixthArray};
		int[][] twoDimArray3 = {seventhArray, eighthArray, ninthArray};
		
		//three dimensional array
		int[][][] threeDimensionalArray = {twoDimArray1, twoDimArray2, twoDimArray3};
		
		for(int i = 0; i<threeDimensionalArray.length;i++) {
			System.out.print("{");
			for(int j = 0; j<threeDimensionalArray.length;j++) {
				System.out.print("{");
				for(int k = 0; k < threeDimensionalArray.length;k++) {
					System.out.printf(" %d ", threeDimensionalArray[i][j][k]);
				}
				System.out.print("} ");
			}
			System.out.print("} \n");
		}
	}
}