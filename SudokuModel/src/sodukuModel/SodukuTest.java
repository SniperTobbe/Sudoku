/**
 * 
 */
package sodukuModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author ELGIGANTEN
 *
 */
class SodukuTest {
	private int[][] matrix;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		matrix = new int[9][9];
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
<<<<<<< HEAD
		matrix=null;
=======
		matrix = null;
>>>>>>> branch 'master' of https://github.com/SniperTobbe/Sudoku.git
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
