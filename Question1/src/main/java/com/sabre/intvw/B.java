package com.sabre.intvw;

import java.io.*;

public class B extends A
{
	public B()
	{
		super();
		name = "Geremy";
	}

	public final void takeCref(C tmpC)
	{
		tmpC.print();
	}

	public final void takeCptr(C tmpC)
	{
		tmpC.print();
	}

	public final void takeCval(C tmp)
	{
		tmp.print();
	}

	public final void foo()
	{
		System.out.print("foo. B");
		System.out.print("\n");
	}

	public void close()
	{
		System.out.print("B destructed");
		System.out.print("\n");
		super.close();
	}
	private String name;
}