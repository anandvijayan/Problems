package com.sabre.intvw;

//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================

public class GlobalMembers
{
	/*
	Question: 1
	Explain what happens in steps 1, 2 and 3. What will be the expected output for these steps?
	Do you see any problems with the code? Fix the program if there are any problems.
	
	Question: 2
	Explain what should happen in step 4. Fix the program if there are any problems.
	*/



	public static void main(String[] args)
	{
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Problem part A");
		System.out.print("\n");
		C c = new C();
		B b = new B();
		// step 1
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: b.takeCval(c);
		b.takeCval(new C());

		// step 2
		b.takeCptr(c);

		// step 3
		b.takeCref(c);

		System.out.print("Problem part B");
		System.out.print("\n");
		A a = new B();
		// step 4
		a.foo();
		if (a != null)
		{
		a.close();
		}


	}
}