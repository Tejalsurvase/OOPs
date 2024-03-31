class FanDriver 
{
	public static void main(String[] args) 
	{
		Fan f1 = new Fan() ;

		f1.color = "Black" ;
		f1.brand = "Pool" ;
		f1.size = 10 ;
		f1.type = "TableFan" ;
		f1.price = 500 ;

		f1.showBrand().showColor().showSize().showType().showPrice() ;
	}
}
