package pkgHelper;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {
		super();
	}

	public LatinSquare(int[][] latinSquare) {
		super();
		this.LatinSquare = latinSquare;
	}

	int[][] getLatinSquare() {
		return this.LatinSquare;
	}

	void setLatinSquare(int[][] s) {
		this.LatinSquare = s;
	}

	static boolean hasDuplicates​(int[] arr) {
		for (int i = 0; i < arr.length -1; i++)
			for (int j = i+1; j < arr.length; j++)
				if (arr[i] == arr[j])
					return true;
		return false;
	}

	static boolean doesElementExist​(int[] arr, int iValue) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == iValue)
				return true;
		return false;
	}

	static boolean hasAllValues(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr2.length; i++)
			if (!doesElementExist​(arr1, arr2[i]))
				return false;
		return true;
	}

	int[] getColumn​(int iCol) {
		int col[] = new int[this.LatinSquare.length];
		for (int i = 0; i < this.LatinSquare.length; i++)
			col[i] = this.LatinSquare[i][iCol];
		return col;
	}

	int[] getRow​(int iRow) {
		return this.LatinSquare[iRow];
	}

	boolean isLatinSquare() {
		for (int i = 0; i < this.LatinSquare.length; i++) {
			if (hasDuplicates​(this.getColumn​(i)) || hasDuplicates​(this.getRow​(i)))
				return false;
			for (int j = 0; j < this.LatinSquare.length; j++)
				if (!hasAllValues(this.getRow​(i), this.getRow​(j))
						|| !hasAllValues(this.getColumn​(i), this.getColumn​(j)))
					return false;
		}
		return true;
	}

	public boolean containsZero() {
		for (int i = 0; i < this.LatinSquare.length; i++)
			for (int j = 0; j < this.LatinSquare[i].length; j++)
				if (this.LatinSquare[i][j] == 0)
					return true;
		return false;
	}
}
