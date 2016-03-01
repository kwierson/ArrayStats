
import java.util.*;

public class ArrayStats {
	
	public static void main(String args[]){
		
	Random number = new Random();
	
	//initializing array with 300 spaces
	int[][] myArray = new int[15][20];
	int row, col;
	
	for(row = 0; row < myArray.length; row++){
		for(col = 0; col < myArray[row].length; col++){
			int randi = number.nextInt(101);
			myArray[row][col] = randi;
			
			System.out.print(myArray[row][col] + " ");
			System.out.println();
		}
	}
	
	//Sorts Array
	Arrays.sort(myArray);
	
	for (row = 0; row < 300; row++) {		
		//THIS IS WHER YOU NEED TO MAKE A MATRIX!
		System.out.println(myArray[row]);
		
	}
	
	
	int fr[] = new int[myArray.length];
	for (int i = 0; i < fr.length; i++){
		fr[i] = 0;
	}
	for(int i = 0; i < myArray.length; i++){
		for(int j = 0; j < myArray.length; j++){
			if(myArray[i] == myArray[j]){
				fr[i]++;
			}
		}
	}
	
			}
	
	
	}

	

	
	
