class University 
{
	String name ;
	String location ;
	
	University()
	{
	}

	University(String name, String location)
	{
		this.name = name ;
		this.location = location ;
	}

	public void showUniversity()
	{
		System.out.println("University Name :" + name) ;
		System.out.println("University Location :" + location) ;
	}
}
