class WashingMachine 
{
	String brand ;
	String color ;
	double price ;
	int capacity  ;
	int speed ;
	int drum_size ;
	String features ;
	String dryer_options ;

	public void showMachineDetails()
	{
		System.out.println("Brand = " + brand) ;
		System.out.println("Color = " + color) ;
		System.out.println("Price = " + price) ;
		System.out.println("Capacity = " + capacity) ;
        System.out.println("Speed = " + speed) ;
		System.out.println("Drum_size = " + drum_size) ;
		System.out.println("Features = " + features) ;
		System.out.println("Dryer_options = " + dryer_options) ;
		System.out.println("*************************************") ;
	}

}
