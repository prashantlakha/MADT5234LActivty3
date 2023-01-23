import java.util.ArrayList;


public class ListOfSheep {

	private ArrayList<Sheep> arrayList = new ArrayList<>();
	
	public int AddSheep(Sheep sheepToAdd) {
		// return number of sheep in the Database
		int numberOfSheep = 0;
		(this.arrayList).add(sheepToAdd);
		System.out.println("Added a sheep " + sheepToAdd.SheepName);
		return numberOfSheep;
	}
}
