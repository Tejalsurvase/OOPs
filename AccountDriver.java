class AccountDriver 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account("Tejal", "ICICI", "Javala", "ICICI1234", 50000.00, 87654321, 1234) ;

		System.out.println(a1.getName()) ;
		System.out.println(a1.getBank()) ;
		System.out.println(a1.getLocation()) ;
		System.out.println(a1.getIfsc()) ;
		System.out.println(a1.getBalance(87654321, 1234)) ;

	    a1.withdraw(87654321, 1234, 9876) ;

		a1.deposit(87654321, 1234, 986) ;

		a1.setPin(87654321, 1234, 2343) ;

		a1.withdraw(87654321, 2343, 9876) ;

		System.out.println(a1.getBalance(87654321, 2343)) ;
	}
}
