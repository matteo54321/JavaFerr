import java.util.Scanner;
public class L4E3{
public static void main(String[] args){
Scanner in = new Scanner (System.in);
int[] ArrayUno = new int[10];
int[] ArrayDue = new int[10];

for (int i=0; i<10; i++){
System.out.println("Inserire valori pari");
ArrayUno[i] = in.nextInt();
}

for (int i=0; i<10; i++){
System.out.println("Inserire valori dispari");
ArrayDue[i] = in.nextInt();
}

int [] ArrayFin = new int[ArrayUno.length + ArrayDue.length];

 byte index1=0;
 byte index2=0;
 boolean array1Terminato=false;
 boolean array2Terminato=false;

 for (byte index=0; index<ArrayFin.length; index++)
 {
  if ((ArrayUno[index1]<=ArrayDue[index2] || array2Terminato) && !array1Terminato)
  {
   ArrayFin[index]=ArrayUno[index1];
   if (index1<ArrayUno.length-1)
    index1++;
   else
    array1Terminato=true;
  }
  else
  {
   ArrayFin[index]=ArrayDue[index2];
   if (index2<ArrayDue.length-1)
    index2++;
   else
    array2Terminato=true;
  }
 }
 
 for (byte index=0; index<ArrayFin.length; index++)
  System.out.println(ArrayFin[index]);








}
}
