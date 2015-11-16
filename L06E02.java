import java.util.Scanner;


public class L06E02{
	  
	public static void main( String args[]){
          Scanner scan = new Scanner(System.in);
		int [] serie1 = new int[10];
		
		 
		for(int i=0; i<serie1.length; i++)
			serie1[i]= scan.nextInt();
		int b = serie1[0];
		
	        for(int i=0; i<serie1.length; i++)
	        	if(serie1[i]==b)
	        	b++;
	        else{
	        	System.out.println("vafangul a" + b);
	        	
}	
	}
}
