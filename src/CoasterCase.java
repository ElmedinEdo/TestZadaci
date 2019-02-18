import java.util.Scanner;


public class CoasterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite jednu recenicu: ");
		
		String unos = input.nextLine();
		
		input.close();
		
		int broj = 0;
		
		for (int i = 0; i < unos.length(); i++) {
			if (Character.isLetter(unos.charAt(i))) {
				if (broj % 2 == 0) {
					System.out.print(Character.toUpperCase(unos.charAt(i)));
					broj = 1;
				} else {
					System.out.print(Character.toLowerCase(unos.charAt(i)));
					broj = 0;
				}
			} else
				System.out.print(unos.charAt(i));
		}
	}


	}


