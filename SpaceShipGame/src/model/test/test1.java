package model.test;

import model.Solarsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class test1  {
	@Test
	public void test11(){
		Solarsystem sol = new Solarsystem(0,0,0);
		assertEquals(sol.getNumSuns(), 0);
	}
}
