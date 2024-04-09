package heroBattle;

import java.util.Scanner;

public class Informacije {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 Heroj h = new Heroj (VrstaMoci.ELEMANTAL , 800, 80, 1);
		 Neprijatelj commonN = new Neprijatelj("Estufial", 750, 75);
		 Neprijatelj epicN = new Neprijatelj("Lepricant", 850, 85);
		 Neprijatelj legenderyN = new Neprijatelj("Sfarovtel", 950, 95);
		 
		 while (true) {
			 System.out.println("Enter the name of your hero.");
			 h.setIme(s.nextLine());
			 
			 System.out.println("Hero: \n " + h.toString());
			 System.out.println("Your enemy " + commonN.toString());
			 System.out.println("Fight! ");
			 System.out.println(h.getIme() + " vs " + commonN.getNazivNep());
			 
			 commonN.vrsta();
			 h.battle(h, commonN);
			 
			 System.out.println("The first battle is done. Congratulatsions!");
			 
			 System.out.println("After battle: " + h.toString());
			 
			 System.out.println("Hero: \n " + h.toString());
			 System.out.println("Your enemy " + epicN.toString());
			 System.out.println("Fight! ");
			 System.out.println(h.getIme() + " vs " + epicN.getNazivNep());
			 
			 epicN.vrsta();
			 h.battle(h, epicN);
			 
			 System.out.println("The first battle is done. Congratulatsions!");
			 
			 System.out.println("After battle: " + h.toString());
			 
			 System.out.println("Hero: \n " + h.toString());
			 System.out.println("Your enemy " + legenderyN.toString());
			 System.out.println("Fight! ");
			 System.out.println(h.getIme() + " vs " + legenderyN.getNazivNep());
			 
			 legenderyN.vrsta();
			 h.battle(h, legenderyN);
			 
			 System.out.println("The first battle is done. Congratulatsions!");
			 
			 System.out.println("After battle: " + h.toString());
			 
			 if (legenderyN.vrsta() == vrstaNeprijatelja.LEGENDERY) {
			        System.out.println("Congratulations! You've defeated the LEGENDARY enemy. Victory!");
			        break; 
			    }
		 }
	}
}
			
			
			
		 
	


