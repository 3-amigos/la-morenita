

import static org.junit.Assert.*;
import modules.*;
import org.junit.Test;

public class TestCompany {

	@Test
	public void testCompany() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		assertEquals(1, c.getCompany_ID());	
		assertEquals("sears", c.getName());
		assertEquals("123 happy lane", c.getAddress());
		assertEquals("seattle", c.getCity());
		assertEquals("wa", c.getState());
		assertEquals(98101, c.getZip());
		assertEquals("206-555-5555", c.getPhone());
			
	}

	@Test
	public void testGetName() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		assertEquals("sears", c.getName());
	}

	@Test
	public void testSetName() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		c.setName("macy's");
		assertEquals("macy's", c.getName());
	}

	@Test
	public void testGetAddress() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		assertEquals("123 happy lane", c.getAddress());
	}

	@Test
	public void testSetAddress() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		c.setAddress("101 sesame street");
		assertEquals("101 sesame street", c.getAddress());
	}

	@Test
	public void testGetCity() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		assertEquals("seattle", c.getCity());
	}

	@Test
	public void testSetCity() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		c.setCity("bellevue");
		assertEquals("bellevue", c.getCity());
	}

	@Test
	public void testGetState() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		assertEquals("wa", c.getState());
	}

	@Test
	public void testSetState() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		c.setState("id");
		assertEquals("id", c.getState());
	}

	@Test
	public void testGetZip() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		assertEquals(98101, c.getZip());
	}

	@Test
	public void testSetZip() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		c.setZip(98005);
		assertEquals(98005, c.getZip());
	}

	@Test
	public void testGetPhone() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		assertEquals("206-555-5555", c.getPhone());
	}

	@Test
	public void testSetPhone() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		c.setPhone("425-555-5555");
		assertEquals("425-555-5555", c.getPhone());
	}

	@Test
	public void testGetCompany_ID() {
		Company c = new Company(1, "sears", "123 happy lane", "seattle", "wa", 98101, "206-555-5555");
		assertEquals(1, c.getCompany_ID());
	}

}
