class Rectangle
{
	public static char[][] createRectangle(int x1, int y1, int x2, int y2, char[][] arr){         // function to draw rectangle using R command
		for(int i=Math.min(y1,y2);i<=Math.max(y1,y2);i++){
			arr[x1][i] = 'x';
		}
		for(int i=Math.min(y1,y2);i<=Math.max(y1,y2);i++){
			arr[x2][i] = 'x';
		}
		for(int i=Math.min(x1,x2);i<=Math.max(x1,x2);i++){
			arr[i][y1] = 'x';
		}
		for(int i=Math.min(x1,x2);i<=Math.max(x1,x2);i++){
			arr[i][y2] = 'x';
		}
		return arr;
	}
}