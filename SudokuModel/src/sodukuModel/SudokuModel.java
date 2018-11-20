package sodukuModel;

public class SudokuModel {
	private int[][] matrix;

	public SudokuModel() {
		matrix = new int[9][9];

	}

	public boolean next() {
		return true;
	}

	public int getValue(int i, int j) {
		return matrix[i][j];
	}

	public void setValue(int i, int j, int value) {
		matrix[i][j] = value;
	}

	public void finalSolve() {
		if (solve(0, 0)) {
//			sätt in alla värden i grafiska interfacet
		}
		
	}

//	Ska för ruta (i,j) kolla om det finns en lösning, om så finns ska denna 
	private boolean solve(int i, int j) {
		
		
		if(matrix[i][j] != 0) {
			if(i<8) {
				solve(i+1, j);
			} else if (j<8) {
				solve(0, j+1);
			} else {
				return true;
			}
		}
		

	}
	
}
