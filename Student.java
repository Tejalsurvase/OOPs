class Student 
{
	String name ;
	String college ;
	int std ;
	int age ;
	int roll ;

	Student()
	{
		System.out.println("Values are printed....") ;
	}
	
	Student(String name, String college, int std, int age, int roll)
	{
		this.name = name ;
		this.college = college ;
		this.std = std ;
		this.age = age ;
		this.roll = roll ;

		System.out.println("Value are loaded...") ;
	}

	public void showDetails()
	{
		System.out.println(name) ;
		System.out.println(college) ;
		System.out.println(std) ;
		System.out.println(age) ;
		System.out.println(roll) ;
	
	}

}
