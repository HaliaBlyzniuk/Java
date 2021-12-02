package lab1;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

//import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class lab1Test {
	
	Pain ob = new Pain();
	
	// findTones method check //
	
	public static Object[][] tonesProvider(){
		return new Object[][] {
			{235, 235100},
			{0,990}
		};
	}
	
	@ParameterizedTest
	@MethodSource("tonesProvider")
	public void testFindTones(int out,int in){
		assertEquals(out,ob.findTones(in));
	}

	
	// isOdd method check //
	public static Object[][] oddProvider(){
		return new Object[][] {
			{true,5},
			{false,2}
		};
	}

	@ParameterizedTest
    @MethodSource("oddProvider")
	public void testIsOdd (boolean check ,int n) {
		assertEquals(check, ob.isOdd(n));
	}
	
	
	@org.junit.jupiter.api.Test
	void testPlusMinus() {
		assertEquals(9, ob.plusMinus(8));
	}
	
	
	// Grade method check //
	
	public static Object[][] gradeProvider(){
		return new Object[][] {
			{"Excellent",5},
			{"The lowest grade",1},
			{"Unsatisfactory",2},
			{"Satisfactory",3},
			{"Good",4}
		};
	}

	@ParameterizedTest
    @MethodSource("gradeProvider")
	public void testGrade(String grade,int n) {
		assertEquals(grade, ob.Grade(n));
	}
	
	////////////////////////////////////////////

	@org.junit.jupiter.api.Test
	void testLoop() {
		int arr[]= {5,6,7,8,9};
		int check[]=ob.loop(5,9);
		Arrays.equals(arr, check);
	}
	
	@org.junit.jupiter.api.Test
	void testSquare()
	{
		int rect[][]= {{1,4},{5,6},{3,2},{8,2}};
		assertEquals(4, ob.square(rect));
	}
	
	@org.junit.jupiter.api.Test
	void testArray()
	{
		int arr[] = {2,4,8,16,32,64};
		Arrays.equals(arr, ob.array(6));
	}
	
	@org.junit.jupiter.api.Test
	void testMatrix()
	{
		int matr[][]={{5,10,15},{5,10,15}};
		Arrays.equals(matr, ob.matrix(2,3));
		
	}
}
