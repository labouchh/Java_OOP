
public class Artwork {
	private String TitleWork;
	private int Cyear; // creation year
	private Artist human;
	//initialize variables
	public Artwork() {
		TitleWork = " ";
		Cyear = 0;
	}
	//setter method
	public void setArtwork(String title, int create, Artist h) { // adding artist
		TitleWork = title;
		Cyear = create;
		human = h; //set artist
	}
	public void printInfo() {	
		human.printInfo(); 
		System.out.println("The title of the artwork is " + TitleWork + ", created in " + Cyear); //artwork title + creation year
	}
}
