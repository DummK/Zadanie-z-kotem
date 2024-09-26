import java.time.LocalDate;

class Cat {
	String catName;
	String ownerName;
	LocalDate date;
	double weight;

	public Cat(String catName, LocalDate date, double weight, String ownerName) {
		this.catName = catName;
		this.date = date;
		this.weight = weight;
		this.ownerName = ownerName;
	}

	public String introduceMyMaster() {
		return catName + " " + date + " " + weight + "kg " + ownerName;
	}
}


public class Main
{
	public static void main(String[] args) {
		Cat cat = new Cat("Puszek", LocalDate.of(2011, 9, 10), 100, "Arek");
		
		System.out.println(cat.introduceMyMaster());
	}
}