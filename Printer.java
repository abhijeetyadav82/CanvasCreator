class Printer
{
	public static void print(int x, int y, char[][] arr){           //function to print output after every command
		//arr = new char[x+1][y+1];     //changed here
		for(int i=0;i<=x;i++){
			for(int j=0;j<=y;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}