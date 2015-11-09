import java.util.Scanner;
public class L4E5{
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		
		int FPrimo = 1;
		int FSecondo = 1;
		int FSerie = 2;
		int lunghezza;
		System.out.println("Inserire la lunghezza della serie");
		lunghezza = in.nextInt();
		
	        System.out.println(FPrimo);
	        System.out.println(FSecondo);
	        
		for (int i=2; i<lunghezza; i++){
			FSerie=FPrimo+FSecondo;
			System.out.println(FPrimo+FSecondo);
			FPrimo=FSecondo;
		        FSecondo=FSerie;
		}
		
	}
}

