import java.util.Scanner;
import java.util.Random;
public class L4E4{
	public static void main(String[] args){
		
		Random randomNum = new Random();
		int numValues = 30;
		int[] values = new int[numValues];
		for (int number = 0; number < numValues; ++number)
		{
			int num = randomNum.nextInt(99);
			System.out.print(num + " ");
			
			values[number] = num;
		}
		
		
		
		int min = 0;
		int max = 0;
		
		
		for (int i=0; i<30; i++){
			if (min<=values[i]){
			}
			else{
			min = values[i];}
	        }
	        
                for (int i=0; i<30; i++){
			if (max>=values[i]){
			}
			else{
			max = values[i];}
	        }	        
	        System.out.println("Ora ti stampo il minimo " + min);
	        System.out.println("Ora ti stampo il massimo " + max);

	        
		
		
	}
}
