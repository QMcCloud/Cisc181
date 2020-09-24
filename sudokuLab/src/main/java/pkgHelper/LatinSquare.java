package pkgHelper;

import java.util.Arrays;

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

	boolean hasDuplicates(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			if (this.doesElementExist(Arrays.copyOfRange(arr, i + 1, arr.length), arr[i]))
				return true;
		return false;
	}

	boolean doesElementExist(int[] arr, int iValue) {
		for (int i : arr)
			if (i == iValue)
				return true;
		return false;
	}

	boolean hasAllValues(int[] arr1, int[] arr2) {
		for (int i : arr2)
			if (!this.doesElementExist(arr1, i))
				return false;
		return true;
	}

	int[] getColumn(int iCol) {
		int col[] = new int[this.LatinSquare.length];
		for (int i = 0; i < this.LatinSquare.length; i++)
			col[i] = this.LatinSquare[i][iCol];
		return col;
	}

	int[] getRow(int iRow) {
		return this.LatinSquare[iRow];
	}

	boolean isLatinSquare() {
		for (int i = 0; i < this.LatinSquare.length; i++) {
			if (this.hasDuplicates(this.getColumn(i)) || this.hasDuplicates(this.getRow(i)))
				return false;
			for (int j = i; j < this.LatinSquare.length; j++)
				if (!this.hasAllValues(this.getRow(i), this.getRow(j))
						|| !this.hasAllValues(this.getColumn(i), this.getColumn(j)))
					return false;
		}
		return true;
	}

	public boolean containsZero() {
		for (int[] i : this.LatinSquare)
			if (this.doesElementExist(i, 0))
				return true;
		return false;
	}
}
