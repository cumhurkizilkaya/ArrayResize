import java.util.Random;
import java.util.Scanner;


public class array {
 
	   static int newSize = 10;
	   static int[] dizi = new int[newSize];
	   static int i = 0;
      
	  public static void main(String[] args) {
		  Random rand = new Random();
		  System.out.println("dizinin boyutunu giriniz :");
	      Scanner klavye = new Scanner (System.in);  
	      int boyut=klavye.nextInt();
	      for (i = 0; i <=newSize ; i++) {

	            if (i >= dizi.length) {
	               
	            	int newSize = boyut;
	                int yeniDizi[] = new int[newSize];

	               for (int i = 0; i < dizi.length; i++) {
	                    yeniDizi[i] = dizi[i];

	                }

	                dizi = new int[newSize];
	              for (int i = 0; i < yeniDizi.length; i++) {                   dizi[i] = yeniDizi[i];

	                }
	              
	            }
	            for (int i = 0; i < dizi.length; i++) {
		            dizi[i]=rand.nextInt(100);	            
		        }
	        }
	       
	      System.out.println("random oluþturulan dizinin tersten yazilmis hali");	
	      for (int i = dizi.length; i >0; i--) {           
	            
	    	  System.out.print("//"+dizi[i-1]);
	            
	        }
	      
	    }}