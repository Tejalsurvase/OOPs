class LaptopDriver 
{
	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop() ;

		l1.brand = "Hp" ;
		l1.color = "Black" ;
		l1.ram = 16 ;
		l1.rom = 123 ;
		l1.price = 60000 ;
		l1.processor = "Is" ;
		l1.os = "Windows" ;
		l1.display = "LED" ;
	    
		l1.showLaptopDetails() ;

		Laptop l2 = new Laptop() ;

		l2.showLaptopDetails() ;
	}
}
