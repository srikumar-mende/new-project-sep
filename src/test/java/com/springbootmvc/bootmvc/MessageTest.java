package com.springbootmvc.bootmvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springbootmvc.bootmvc.Controller.ServiceMessage;

public class MessageTest {
	
	private ServiceMessage m;
	private String expected;
	private String actual;
	
	@BeforeEach
	public void setUp() {
		m=new ServiceMessage();
		expected = "wolcome to marlabs:srikumar";
		actual=" ";
	}
	@Test
	public void testMessge() {
		actual=m.showMsg("srikumar");
		assertEquals
		
	}

}
