/*Artist person = new Artist(his, xx, -1);
 * passes to the class constructor the parameters inputed (method Artist).
 * Can't directly print because they are private data members, can be accessed through a public method.
 * Object instance to access printInfo(); -> person.printInfo();
 * 
*/
public class Artist {
	private String Name;
	private int Byear; //birth year
	//print method
	//initializing data
	public Artist() {
		Name = " ";
		Byear = 0;	
	}
	//setData: sending input from main to store/update
	public void setArtist(String nm, int bth, int dth) { //void
		Name = nm;
		Byear = bth;
	}
	/*public String getHuman() {
		return Artist;
	}
	public int getBirth() {
		return Byear;
	}
	public int getDeath() {
		return Dyear;
	}
	*/
	public void printInfo() {
		System.out.println("The artist is " + Name + ", born in " + Byear);//name + birth
	}
}
