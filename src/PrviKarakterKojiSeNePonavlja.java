import java.util.Scanner;


public class PrviKarakterKojiSeNePonavlja {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite jedan string: ");
		String unos = input.next();
		input.close();

		char karakterKojiSeNePonavlja = ' ';

		for (int i = 0; i < unos.length(); i++) {
			int brojPonavljanja = 0;
			char temp;
			if (Character.isLetter(unos.charAt(i)))
				temp = unos.charAt(i);
			else {
				continue;

			}
			for (int j = i + 1; j < unos.length(); j++) {
				if (unos.charAt(i) == unos.charAt(j)) {
					brojPonavljanja++;
					unos = unos.replace(temp, '1');
				}
			}

			if (brojPonavljanja == 0) {
				karakterKojiSeNePonavlja = temp;
				break;
			}
		}

		if (karakterKojiSeNePonavlja == ' ')
			System.out.println("Karaktera nema koji se ne ponavlja. ");
		else
			System.out.println("Prvi karakter koji se ne ponavlja u ostatku stringa: " );
		System.out.println( karakterKojiSeNePonavlja);
	}


}
