class College extends University 
{
	String cName ;
	String cLocation ;

	//University u = new University("PAHSU", "Solapur") ;

	College()
	{
	}

	College(String name, String location, String cName, String cLocation)
	{
		this.name = name ;
		this.location = location ;
		this.cName = cName ;
		this.cLocation = cLocation ;
	}

	public void showCollege()
	{
		showUniversity() ;
		System.out.println("College Name :" + cName) ;
		System.out.println("College Location :" + cLocation) ;
	}
}
