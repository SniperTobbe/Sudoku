package sodukuModel;

import java.util.stream.IntStream;

public class SudokuModel {
	private int[][] matrix;
	
	public SudokuModel() {
		matrix=new int[9][9];
//		tobbe rules
//		berra äger
	}
	
//	public boolean hasNext(int i, int j) {
//		if(true) {
//			
//		}
//		return true;
//	}
	
	public int getValue(int i, int j) {
		return matrix[i][j];
	}
	
	public void setValue(int i, int j, int value) {
		matrix[i][j]=value;
	}
	
	public void finalSolve() {
		solve(0,0);
	}
	
//	Behöver implementera metoderna: Check, begränsningar(för rad, kolumn och region),
	private boolean solve(int rad, int kolumn) {
//		for sats som itererar igenom alla raderna.
		for(int i=rad; i<=9; i++) {
//			for sats som itererar igenom alla kolumnerna.
			for(int j=kolumn; j<=9; j++) {
//				if sats som kollar om det finns en startsiffra på platsen (i,j),true om det inte finns någon.
				if(matrix[i][j]==0) {
//					om ingen siffra fanns så testar en for sats att sätta in siffrorna,
//					1-9 en i taget och kollar sen så att siffran inte bryter mot några regler.
//					Om den inte gör de så körs solve(i, j). en ny loop startar, vilken kommer kolla
//					om det finns en siffra på (i, j), vilket det nu gör och j kommer nu att öka och 
//					nästa ruta kommer att undersökas.
					for(int n=1; n<=9; n++) {
//						sätter värdet n på platsen (i, j).
						matrix[i][j]=n;
//						kollar om siffran på plats(i,j)
						if(check(i, j) && solve(i, j)) {
							return true;
						}
//						Om vi inte löst den ännu så backtrackar vi, tar bort värdet 
//						i den rutan vi precis fyllde i och låter loopen fortskrida.
						matrix[i][j]=0;
					}
//					Om ingen siffra funkar då vi kommer hit är sudokun olöslig och vi returnerar false.
					return false;
				}else if(!check(i, j)) {
					return false;
				}
				
			}
		}
		return true;
	}
	
			
	private boolean checkRegion(int i, int j) {
		int n=getValue(i,j);
		int a=(i/3)*3;
		int b=(j/3)*3;
		int xy[]=new int[9];
		int m = 0;
		for(int x=a; x<a+3; x++) {
			for(int y=b; y<b+3; y++) {
				if(i!=x || j!=y) {
					xy[m]=getValue(x,y);
					m++;
				}
			}
		}
		boolean contains = IntStream.of(xy).anyMatch(x -> x == n);
		return !contains;
	}
	
	private boolean checkColumnAndRow(int i, int j) {
		int n=getValue(i,j);
		for(int ab=0; ab<9; ab++) {
			if(n==getValue(i, ab) && ab !=j) {
				return false;
			}
		}
		for(int ab=0; ab<9; ab++) {
			if(n==getValue(ab, j) && ab!=i) {
				return false;
			}
		}
		return true;
	}
	private boolean check(int i, int j) {
		return (checkRegion(i, j) && checkColumnAndRow(i, j));
	}
}
