package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Morgan Rose on 10/13/2015.
 */
public class DefaultPair<T>
{

	private T x;
	private T y;

	public DefaultPair(T x, T y){
		this.x = x;
		this.y = y;
	}

	public T first()
	{
		return x;
	}

	public T second()
	{
		return y;
	}

	public DefaultPair reverse() {
		return new DefaultPair<>(y, x);
	}

	public boolean equals(DefaultPair that){
		return (that instanceof DefaultPair) && ((this.first() ==
				((DefaultPair) that).first()) && this.second() == ((DefaultPair) that).second());

	}
	@Override
	public String toString()
	{
		return new String ("<" + x + ", " + y + ">");
	}
}


