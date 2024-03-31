class WashingMachineDriver 
{
	public static void main(String[] args) 
	{
		WashingMachine m1 = new WashingMachine() ;

		m1.brand = "Samsung" ;
		m1.color = "Black" ;
		m1.price = 49000 ;
		m1.capacity = 7 ;
		m1.speed = 1400 ;
		m1.drum_size = 7 ;
		m1.features = "Good" ;
		m1.dryer_options = "Min-Max" ;

		m1.showMachineDetails() ;

		WashingMachine m2 = new WashingMachine() ;

		m2.showMachineDetails() ;
	}
}
