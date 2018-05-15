package com.sabre.intvw;

import java.io.*;

//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================


//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
//ORIGINAL LINE: #define DELETE(ptr) {if (ptr) {delete ptr; ptr = 0;}}

public class A implements Closeable
{
	public void close()
	{
		System.out.print("A destructed");
		System.out.print("\n");
	}

	public void foo()
	{
		System.out.print("foo. A");
		System.out.print("\n");
	}
}