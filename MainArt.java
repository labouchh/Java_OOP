import java.util.Scanner;
public class MainArt {

	public static void main(String[] args) {
		String Name;
		int Byear;
		int Dyear;
		String TitleWork;
		int Cyear;
		//scanning input
		Scanner scnr = new Scanner(System.in);
		//artist
		System.out.println("What is the last name of the Artist? ");
		Name = scnr.next();
		System.out.println("What year was " + Name + " born? ");
		Byear = scnr.nextInt();
		
		Artist person = new Artist();
		person.setArtist(Name, Byear, -1);
		
		//artwork
		System.out.println("What's the title of " + Name + "'s work? ");
		TitleWork = scnr.next();
		System.out.println("What year was " + TitleWork + " created?");
		Cyear = scnr.nextInt();
		
		Artwork mywork = new Artwork();
		mywork.setArtwork(TitleWork, Cyear, person);
		mywork.printInfo();
		/*System.out.println("What year was " + Artist + " deceased?");
		Dyear = scnr.nextInt();
		*/
		//storing input/transfer
		
	}

}
