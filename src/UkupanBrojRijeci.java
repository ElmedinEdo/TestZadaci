import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class UkupanBrojRijeci {

		
		    public static void main(String[] args) throws FileNotFoundException {
		        Scanner txt;
		        File file = null;
		      

		        try {
		            txt = new Scanner(System.in);
		            System.out.println("Molimo unesite ime fajla(t.txt): ");
		            file = new File(txt.nextLine());

		            txt = new Scanner(file);

		            while (txt.hasNextLine()) {
		                String line = txt.nextLine();
		                System.out.println(line);
		               
		            }
		            txt.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }

		        try {
		            txt = new Scanner(file);
		            Scanner in = new Scanner(System.in);
		            in.nextLine();
		            System.out.print("Molimo da unesete rijec koju zelite pretrazivati. ");
		            
		            String wordInput = in.nextLine();

		            
		            //Ovdje se radi pretrazivanje rijeci
		            int count = 0;
		            while (txt.hasNextLine()) 
		            {
		                String line = txt.nextLine();
		                for (int index = line.indexOf(wordInput); 
		                         index != -1; 
		                         index = line.indexOf(wordInput, index + 1)) {
		                    count++;
		                }        
		            }

		            System.out.println(count);
		           
		            
		        } catch (FileNotFoundException e) {
		            System.out.println("Rijec ne postoji. ");
		        }
		    
		    }}
		  