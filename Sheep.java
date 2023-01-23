
public class Sheep {
	public String SheepName;
	public String SheepFavColor;
	public double height;
	public double weight;
	public static int numberOfSheep = 0;
	
	public Sheep(String sName, String sFavColor, int sheight, int sweight) {
		this.SheepName = sName;
		this.SheepFavColor = sFavColor;
		this.height = sheight;
		this.weight = sweight;
		Sheep.numberOfSheep++;
	}
}
