import java.util.Scanner;
public class L6E01{
	public static void main(String[] args){
		Scanner tastiera = new Scanner (System.in);
                String parola;
                System.out.println ("Inserisci la cazzo di parola");
	        parola = tastiera.next();
	        parola.length();
	        System.out.println (parola.length());
	        int b=0;
	        int c=parola.length() -1;
	        int [] palindromo = new int [parola.length()];
	        	    for (int i = 0; i < palindromo.length; i++){
	        	    palindromo[i] = parola.charAt(i);
	        	    if (palindromo[i] == parola.charAt(c))
	        	    	    {c--;}
	        	            else
	        	            {
	        	    c--;b++;}
	        	    }
	        	  if (b!=0)
	        	  	  System.out.println ("Hai sbagliato" + b + "volte");
	        	  else
	        	  	  
	        	  	  System.out.println ("Palindroma");

	
}
}
