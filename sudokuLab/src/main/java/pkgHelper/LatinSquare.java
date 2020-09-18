package pkgHelper;

public class LatinSquare {
	
	private int[][] LatinSquare;

	public LatinSquare() {
		super();
	}

	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	int[][] getLatinSquare(){
		return LatinSquare;
	}
	void setLatinSquare(int[][] s) {
		LatinSquare = s;
	}
	boolean hasDuplicates​(int[] arr) {
		for(int i = 0; i < arr.length * arr.length; i++)if(arr[i/arr.length] == arr[i%arr.length] && i/arr.length != i%arr.length)return true;
		return false;
	}
	boolean doesElementExist​(int[] arr, int iValue) {
		for(int i = 0; i < arr.length; i++)if(arr[i] == iValue)return true;
		return false;
	}
	boolean hasAllValues(int[] arr1,int[] arr2) {
		for(int i = 0; i < arr2.length; i++) if(!doesElementExist​(arr1, arr2[i]))return false;
		return true;
	}
	int[] getColumn​(int iCol) {
		int col[] = new int[LatinSquare[0].length];
		for(int i = 0; i < LatinSquare[0].length; i++)col[i] = LatinSquare[iCol][i];
		return col;
	}
	int[] getrow​(int iRow) {
		return LatinSquare[iRow];
	}
	boolean isLatinSquare() {
		
		return true;
	} //- return 'true' if: Each row and column doesn't containduplicates If each element in the first row is found in every other row Ifeach element in the first coumn is found in every other column 
	public boolean containsZero() {
		for(int i = 0; i < LatinSquare.length*LatinSquare[0].length; i++)if(LatinSquare[i%LatinSquare.length][i/LatinSquare[0].length] == 0)return true;
		return false;
	}
}
