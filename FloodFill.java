class FloodFill
{
	public static char[][] fillColor(int x, int y, char color,char newColor, char[][] arr) {     // function using flood-fill algorithm to fill color using B command
        if (arr[x][y] == color) {
            arr[x][y] = newColor;
            if (x >= 1) fillColor(x-1, y, color, newColor, arr);
            if (y >= 1) fillColor(x, y-1, color, newColor, arr);
            if (x+1 < arr.length) fillColor(x+1, y, color, newColor, arr);
            if (y+1 < arr[0].length) fillColor(x, y+1, color, newColor, arr);
        }
        return arr;
    }
}