
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultPairTest {
	final DefaultPair<Integer> p = new DefaultPair<>(3,5);
	final DefaultPair<Integer> q = new DefaultPair<>(5,3);


	@Test
	public void first(){
		assertEquals(3, p.first());
	}
	@Test
	public void second()
	{
		assertEquals(5, p.second());

	}
	@Test
	public void tostring(){
		assertEquals("<3, 5>", p.toString());
	}
	@Test
	public void equals()
	{
		assertTrue(p.equals(p));
		assertFalse(p.equals(q));
		assertFalse(p.equals(q));
		assertTrue(p.equals(null));

	}
	@Test
	public void reverse()
	{
		assertTrue(p.equals(q.reverse()));
	}
}
