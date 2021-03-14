import java.util.*;
class TestCanvas
{
	public static char arr[][] = new char[1][1];
	public static void testCanvasCreator(){
		System.out.println("Test for C 3 2");
		arr = CanvasCreator.createCanvas(3, 4, arr);
		char[][] testArr = {{'-','-','-','-','-',},{'|',' ',' ',' ','|'},{'|',' ',' ',' ','|'},{'-','-','-','-','-'}};
		System.out.println("Expected Output:");
		Printer.print(3,4,testArr);
		System.out.println("Current Output:");
		Printer.print(3,4,arr);
	}
	public static void testLine(){
		//char arr[][] = new char[1][1];
		//arr = CanvasCreator.createCanvas(3, 4, arr);
		System.out.println("Test for L 1 2 3 2");
		arr = Line.createLine(2,1,2,3, arr);
		char[][] testArr = {{'-','-','-','-','-',},{'|',' ',' ',' ','|'},{'|','x','x','x','|'},{'-','-','-','-','-'}};
		System.out.println("Expected Output:");
		Printer.print(3,4,testArr);
		System.out.println("Current Output:");
		Printer.print(3,4,arr);
	}
	public static void testRectangle(){
		//char arr[][] = new char[1][1];
	//	arr = CanvasCreator.createCanvas(3, 4, arr);
		System.out.println("Test for R 2 1 3 2");
		arr = Rectangle.createRectangle(1,2,2,3, arr);
		char[][] testArr = {{'-','-','-','-','-',},{'|',' ','x','x','|'},{'|','x','x','x','|'},{'-','-','-','-','-'}};
		System.out.println("Expected Output:");
		Printer.print(3,4,testArr);
		System.out.println("Current Output:");
		Printer.print(3,4,arr);
	}
	public static void testFillColor(){
		System.out.println("Test for B 1 1 @");
		arr = FloodFill.fillColor(1,1,' ','@', arr);
		char[][] testArr = {{'-','-','-','-','-',},{'|','@','x','x','|'},{'|','x','x','x','|'},{'-','-','-','-','-'}};
		System.out.println("Expected Output:");
		Printer.print(3,4,testArr);
		System.out.println("Current Output:");
		Printer.print(3,4,arr);
	}
	public static void main(String[] args) {
		testCanvasCreator();
		testLine();
		testRectangle();
		testFillColor();
	}
}