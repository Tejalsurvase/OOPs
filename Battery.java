public class Battery
{
	String brand ;
	int cap ;
	String type ;
	int warrenty ;
	double price ;

	Battery()
	{
	}

	Battery(String brand, int cap, String type, int warrenty, double price)
	{
		this.brand = brand ;
		this.cap = cap ;
		this.type = type ;
		this.warrenty = warrenty ;
		this.price = price ;
	}

	public void showBattery()
	{
		System.out.println("Brand" + brand) ;
		System.out.println("Cap" + cap) ;
		System.out.println("Type" + type) ;
		System.out.println("Warrenty" + warrenty) ;
		System.out.println("Price" + price) ;
	}
}
