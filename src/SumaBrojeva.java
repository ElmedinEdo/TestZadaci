
import java.util.Scanner;


public class SumaBrojeva {

	
	    public static void main(String[] args) {
	    		    		
	    		
	    			Scanner input = new Scanner(System.in);
	    			
	    			
	    			System.out.print("Uèitaj broj èlanova niza: ");
	    			int broj = input.nextInt();

	    			int niz[] = new int[broj];
	    			System.out.println("Uèitaj èlanove niza:");
	    			
	    			for (int i = 0; i < niz.length; i++) {
	    				System.out.print(i + "-->");
	    				niz[i] = input.nextInt();
	    			}
	    			int p = 1;
	    			for (int i = 0; i < niz.length; i++) {
	    				if (niz[i] % 2 != 0) {
	    					p = p * niz[i];
	    				}

	    			}

	    			input.close();

	    			System.out.println("Proizvod neparnih brojeva je: " + p);

	    		}





	    		

	    	}



