class Student extends Department 
{
	String sName ;
	int rollno ;
	int age ;
	String sLocation ;
	String phno ;

	//Department d = new Department("CSE", 1) ;

	Student()
	{
	}

	Student(String name, String location, String cName, String cLocation, String dName, int deptno, String sName, int rollno, int age, String sLocation, String phno)
	{
		this.name = name ;
		this.location = location ;
        this.cName = cName ;
		this.cLocation = cLocation ;
		this.dName = dName ;
		this.deptno = deptno ;
		this.sName = sName ;
		this.rollno = rollno ;
		this.age = age ;
		this.sLocation = sLocation ;
		this.phno = phno ;
	}

	public void showStudent()
	{
		showDepartment() ;
		System.out.println("Student Name :" + sName) ;
		System.out.println("Student RollNo :" + rollno) ;
		System.out.println("Student Age :" + age) ;
		System.out.println("Student Location :" + sLocation) ;
		System.out.println("Student Phno :" + phno) ;
	}
}
