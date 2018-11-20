package sodukuModel;

public class SudokuModel {
	private int[][] matrix;
	
	public SudokuModel() {
		matrix=new int[9][9];
		
	}
	
	public boolean hasNext(int i, int j) {
		if(true) {
			
		}
		return true;
	}
	
	public int getValue(int i, int j) {
		return matrix[i][j];
	}
	
	public void setValue(int i, int j, int value) {
		matrix[i][j]=value;
	}
	
	public void finalSolve() {
		solve(0,0);
	}
	
//	Ska för ruta (i,j) kolla om det finns en lösning, om så finns ska denna 
	private boolean solve(int i, int j) {
		if(getValue(i, j) == 0) {
			
		}
		return true;
	}
	
}
