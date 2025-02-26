class Account 
{
	private String name ;
	private String bank ;
	private String location ;
	private String ifsc ;
	private double balance ;
	private int accno ;
	private int pin ;

	Account()
	{
	}

	Account(String name, String bank, String location, String ifsc, double balance, int accno, int pin)
	{
		this.name = name ;
		this.bank = bank ;
		this.location = location ;
		this.ifsc = ifsc ;
		this.balance = balance ;
		this.accno = accno ;
		this. pin = pin ;
	}

	public String getName()
	{
		return name ;
	}

	public String getBank()
	{
		return bank ;
	}

	public String getLocation()
	{
		return location ;
	}

	public String getIfsc()
	{
		return ifsc ;
	}

	public void withdraw(int accno, int pin, double amt)
	{
		if (this.accno == accno && this.pin == pin)
		{
			System.out.println("Login Successfully !") ;
			if (balance - amt >= 2000 && amt > 0)
			{
				balance -= amt ;
				System.out.println("Amount debited!") ;
			}
			else
			{
				System.out.println("Enter valid amount.") ;
			}
		}
		else
		{
			System.out.println("Please enter valid credentials.") ;
		}
	}


	public void deposit(int accno, int pin, double amt)
	{
		if (this.accno == accno && this.pin == pin)
		{
			System.out.println("Login successfully !") ;
			if (amt > 0)
			{
				balance += amt ;
			}
			else
			{
				System.out.println("Enter valid amount.") ;
			}
		}
		else
		{
			System.out.println("Please enter valid credentials.") ;
		}
	}


	public double getBalance(int accno, int pin)
	{
		if (this.accno == accno && this.pin == pin)
		{
			System.out.println("Login Successfully.") ;
			return balance ;
		}
		else
		{
			System.out.println("Please enter valid credentials.") ;
			return 0 ;
		}
	}

	public void setPin(int accno, int old, int update)
	{
		if (this.accno == accno && pin == old)
		{
			pin = update ;
			System.out.println("Password set.") ;
		}
		else
		{
			System.out.println("Please enter valid crendentials.") ;
		}
	}
}
