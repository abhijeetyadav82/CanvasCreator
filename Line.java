class Line
{
	public static char[][] createLine(int x1, int y1, int x2, int y2, char[][] arr){          //function to draw line using L command
		if(x1 == x2)
		{
			for(int i=Math.min(y1,y2);i<=Math.max(y1,y2);i++){
				arr[x1][i] = 'x';
			}
		}
		else if(y1 == y2)
		{
			for(int i=Math.min(x1,x2);i<=Math.max(x1,x2);i++){
				arr[i][y1] = 'x';
			}
		}
		return arr;
	}
}