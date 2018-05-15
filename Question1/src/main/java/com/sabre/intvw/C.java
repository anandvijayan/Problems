package com.sabre.intvw;

import java.io.*;

public class C implements Closeable
{
	public C()
	{
		name = "Geremy";
	}

	public void close()
	{
		{
			if (name != null)
			{
				/*if (name != null)
				{
					name.close();
				}*/
				name = null;
			}
		};
	}

	public final void print()
	{
		System.out.print("name is: ");
		System.out.print(name);
		System.out.print("\n");
	}
	private String name;
}