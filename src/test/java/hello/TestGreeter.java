package hello;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

public class TestGreeter {

	private Greeter g;

	@Before

	public void setUp() throws Exception

	{

		g = new Greeter();

	}
	
	@Test
	
	public void newtestTCGreeterPass(){
		String name = "Clarice";
		String there = "there";
		String nada = null;
		
		g.setName(name);
		
		assertEquals(g.getName(), name);
		
		assertEquals(g.sayHello(), "Hello Clarice!");
		
		g.setName(there);
		
		assertNotSame(g.getName(), name);
		
		assertSame(g.getName(), there);
		
		g.setName(nada);		
		
		assertNull(g.getName());
		
		assertTrue(g.getName() == null);
		
		assertFalse(g.getName() instanceof String);
		
	}
	/*
	@Test
	
	public void newtestTCGreeterFail() {
		String name = "Clarice";
		String there = "there";
		String nada = null;
		assertEquals(g.getName(), name);
		
		assertEquals(g.sayHello(), "Hello!");
		
		g.setName(name);
		
		assertNotSame(g.getName(), name);
		
		assertSame(g.getName(), there);
		
		g.setName(nada);		
		
		assertNotNull(g.getName());
		
		assertTrue(g.getName() == "null");
		
		assertTrue(g.getName() instanceof String);
	}
	*/
	@Test

	public void testGreeterEmpty()

	{

		assertEquals(g.getName(), "");

		assertEquals(g.sayHello(), "Hello!");

	}

	@Test

	public void testGreeter()

	{

		g.setName("World");

		assertEquals(g.getName(), "World");

		assertEquals(g.sayHello(), "Hello World!");

	}

}

//testing
