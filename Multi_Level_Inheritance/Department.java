class Department extends College 
{
	String dName ;
	int deptno ;

	//College c = new College("SVERI", "Pandharpur") ;

	Department()
	{
	}

	Department(String name, String location, String cName, String cLocation, String dName, int deptno)
	{
		this.name = name ;
		this.location = location ;
		this.cName = cName ;
		this.cLocation = cLocation ;
		this.dName = dName ;
		this.deptno = deptno ;
	}

	public void showDepartment()
	{
		showCollege() ;
		System.out.println("Department Name :" + dName) ;
		System.out.println("Department Deptno :" + deptno) ;
	}
}
