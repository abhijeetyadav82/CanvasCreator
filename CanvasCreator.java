class CanvasCreator{
	public static char[][] createCanvas(int x, int y, char arr[][]){         //function to create canvas using C command
		arr = new char[x+2][y+2];
		for(int i=0;i<=x;i++){
			for(int j=0;j<=y;j++){
				if(i==0 || i==x){
					arr[i][j] = '-';
				}
				else if(j==0 || j==y){
					arr[i][j] = '|';
				}
				else{
					arr[i][j] = ' ';
				}
				//System.out.print(arr[i][j]);
			}
			//System.out.println();
		}
		return arr;
	}	
}