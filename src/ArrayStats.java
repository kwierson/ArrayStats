
import java.util.*;

public class ArrayStats {
	public static void main(String args[]){
		
	Random number = new Random();
	
	//initializing array with 300 spaces
	double[] myArray = new double[300];
	
	int filling = 0;
	
	//loop which fills array with random numbers
	while(filling < 300){
		int randomNumber = number.nextInt(301);
		myArray[filling] = randomNumber;
		filling++;
	}
	
	for (int i = 0; i<300; i++){
		System.out.println(myArray[i]);
	}
	
}
}