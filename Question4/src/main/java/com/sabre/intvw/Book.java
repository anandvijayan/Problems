package com.sabre.intvw;
//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================

public class Book
{
	public Book(String title)
	{
		this.title = title;
	}

	public String read()
	{
		return (String)("Read book: " + title);
	}

	private String title;
}