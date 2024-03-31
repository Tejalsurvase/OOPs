public class Mobile1
{
	String brand ;
	String color ;
	double price ;
	String name ;
	int ram ;
	int hd ;
	String processor ;
	int camera ;

	Battery bat = new Battery("Samsung", 3000, "Li-ion", 2, 5000.00) ;

	Mobile1()
	{
		
	}

	Mobile1(String brand, String name, double price, String color, int ram, int hd, String processor, int camera)
	{
		this.brand = brand ;
		this.name = name ;
		this.price = price ;
		this.color = color ;
		this.ram = ram ;
		this.hd = hd ;
		this.processor = processor ;
		this.camera = camera ;
	}

	public void showDetails()
	{
		System.out.println("Brand" + brand) ;
		System.out.println("Name" + name) ;
		System.out.println("Price" + price) ;
		System.out.println("Ram" + ram) ;
		System.out.println("Hd" + hd) ;
		System.out.println("Processor" + processor) ;
		System.out.println("Camera" + camera) ;
	}
}
