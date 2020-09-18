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
	public boolean containsZero() {
		for(int i = 0; i < LatinSquare.length*LatinSquare[0].length; i++)if(LatinSquare[i%LatinSquare.length][i/LatinSquare[0].length] == 0)return true;
		return false;
	}
}
