import java.util.*;
class Canvas
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int w=0,h=0;
		char[][] matrix = new char[1][1];
		
		while(!input.equals("Q")){
			String[] commands = input.trim().split("\\s+"); 	// to split parts of commands
			if(commands[0].equals("C"))						// condition to create the canvas for drawing
			{         			
				w = Integer.parseInt(commands[2]);      	//width of canvas
				h = Integer.parseInt(commands[1]);			//height of canvas
				//matrix = new char[w+2][h+2];    			// the canvas to be printed
				matrix = CanvasCreator.createCanvas(w+1, h+1, matrix); 
				Printer.print(w+1,h+1,matrix);
			}
			else if(commands[0].equals("L"))					// condition for drawing line 
			{    
				int y1 = Integer.parseInt(commands[1]);
				int x1 = Integer.parseInt(commands[2]);
				int y2 = Integer.parseInt(commands[3]);
				int x2 = Integer.parseInt(commands[4]);
				matrix = Line.createLine(x1, y1, x2, y2, matrix);
				Printer.print(w+1,h+1,matrix);
			}
			else if(commands[0].equals("R"))					// condition for drawing rectangle
			{    
				int y1 = Integer.parseInt(commands[1]);
				int x1 = Integer.parseInt(commands[2]);
				int y2 = Integer.parseInt(commands[3]);
				int x2 = Integer.parseInt(commands[4]);
				matrix = Rectangle.createRectangle(x1, y1, x2, y2, matrix);
				Printer.print(w+1,h+1,matrix);
			}
			else if(commands[0].equals("B"))					// condition to fill color
			{     
				int y = Integer.parseInt(commands[1]);
				int x = Integer.parseInt(commands[2]);
				char newColor = commands[3].charAt(0);
				char color = matrix[x][y];
				matrix = FloodFill.fillColor(x, y, color, newColor, matrix);
				Printer.print(w+1,h+1,matrix);
			}

			input = sc.nextLine();
		
		}
	}
}