package Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer {

	@Test
	public void testCustomerIntStringStringStringStringStringStringStringStringStringStringInt() {
		
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		
		assertEquals(1, x.getCustomer_ID());
		assertEquals("mr.", x.getPrefix());
		assertEquals("odiscious", x.getFirstName());
		assertEquals("oliver", x.getMiddleName());
		assertEquals("dozier", x.getLastName());
		assertEquals("", x.getMaternalLastName());
		assertEquals("", x.getSuffix());
		assertEquals("808-783-0078", x.getPhone());
		assertEquals("27948 ne 147th cir", x.getAddress());
		assertEquals("duvall", x.getCity());
		assertEquals("WA", x.getState());
		assertEquals(98019, x.getZip());
	}

	@Test
	public void testCustomerCustomer() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		Customer y = new Customer(x);
		assertEquals(x.getCustomer_ID(), y.getCustomer_ID());
		assertEquals(x.getPrefix(), y.getPrefix());
		assertEquals(x.getFirstName(), y.getFirstName());
		assertEquals(x.getLastName(), y.getLastName());
		assertEquals(x.getMiddleName(), y.getMiddleName());
		assertEquals(x.getMaternalLastName(), y.getMaternalLastName());
		assertEquals(x.getSuffix(), y.getSuffix());
		assertEquals(x.getPhone(), y.getPhone());
		assertEquals(x.getAddress(), y.getAddress());
		assertEquals(x.getCity(), y.getCity());
		assertEquals(x.getState(), y.getState());
		assertEquals(x.getZip(), y.getZip());
	}

	@Test
	public void testGetPrefix() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("mr.", x.getPrefix());
	}

	@Test
	public void testSetPrefix() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setPrefix("mrs.");
		assertEquals("mrs.", x.getPrefix());
	}

	@Test
	public void testGetMiddleName() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("oliver", x.getMiddleName());
	}

	@Test
	public void testSetMiddleName() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setMiddleName("bob");
		assertEquals("bob", x.getMiddleName());
	}

	@Test
	public void testGetMaternalLastName() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("", x.getMaternalLastName());
	}

	@Test
	public void testSetMaternalLastName() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setMaternalLastName("humble");
		assertEquals("humble", x.getMaternalLastName());
	}

	@Test
	public void testGetSuffix() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("", x.getSuffix());
	}

	@Test
	public void testSetSuffix() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setSuffix("jr.");
		assertEquals("jr.", x.getSuffix());
	}

	@Test
	public void testGetPhone() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("808-783-0078", x.getPhone());
	}

	@Test
	public void testSetPhone() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setPhone("206-501-5481");
		assertEquals("206-501-5481", x.getPhone());
	}

	@Test
	public void testGetAddress() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("27948 ne 147th cir", x.getAddress());
	}

	@Test
	public void testSetAddress() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setAddress("123 happy street");
		assertEquals("123 happy street", x.getAddress());
	}

	@Test
	public void testGetCity() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("duvall", x.getCity());
	}

	@Test
	public void testSetCity() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setCity("seattle");
		assertEquals("seattle", x.getCity());
	}

	@Test
	public void testGetState() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("WA", x.getState());
	}

	@Test
	public void testSetState() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setState("HI");
		assertEquals("HI", x.getState());
	}

	@Test
	public void testGetZip() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals(98019, x.getZip());
	}

	@Test
	public void testSetZip() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setZip(98033);
		assertEquals(98033, x.getZip());
	}

	@Test
	public void testGetFirstName() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("odiscious", x.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setFirstName("bob");
		assertEquals("bob", x.getFirstName());
	}

	@Test
	public void testGetLastName() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals("dozier", x.getLastName());
	}

	@Test
	public void testSetLastName() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		x.setZip(98033);
		assertEquals(98033, x.getZip());
	}

	@Test
	public void testGetCustomer_ID() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		assertEquals(1, x.getCustomer_ID());
	}

	@Test
	public void testEqualsCustomer() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		Customer y = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		
		assertEquals(x.getCustomer_ID(), y.getCustomer_ID());
		assertEquals(x.getPrefix(), y.getPrefix());
		assertEquals(x.getFirstName(), y.getFirstName());
		assertEquals(x.getMiddleName(), y.getMiddleName());
		assertEquals(x.getLastName(), y.getLastName());
		assertEquals(x.getMaternalLastName(), y.getMaternalLastName());
		assertEquals(x.getSuffix(), y.getSuffix());
		assertEquals(x.getPhone(), y.getPhone());
		assertEquals(x.getAddress(), y.getAddress());
		assertEquals(x.getCity(), y.getCity());
		assertEquals(x.getState(), y.getState());
		assertEquals(x.getZip(), y.getZip());
	}

	@Test
	public void testClone() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		Customer y = x.clone();
		assertEquals(x.getCustomer_ID(), y.getCustomer_ID());
		assertEquals(x.getPrefix(), y.getPrefix());
		assertEquals(x.getFirstName(), y.getFirstName());
		assertEquals(x.getMiddleName(), y.getMiddleName());
		assertEquals(x.getLastName(), y.getLastName());
		assertEquals(x.getMaternalLastName(), y.getMaternalLastName());
		assertEquals(x.getSuffix(), y.getSuffix());
		assertEquals(x.getPhone(), y.getPhone());
		assertEquals(x.getAddress(), y.getAddress());
		assertEquals(x.getCity(), y.getCity());
		assertEquals(x.getState(), y.getState());
		assertEquals(x.getZip(), y.getZip());
	}

	@Test
	public void testToString() {
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		String test = "ID: " + 1 + " prefix: " + "mr." + " first name: " + "odiscious" + " last name: " + "dozier" + " middle name: " + "oliver" +
				" maternal last name: " + "" + " suffix: " + "" + " phone: " + "808-783-0078" + " address: " + "27948 ne 147th cir" + " city: " + "duvall" + " state: " + "WA" + " zip: " + 98019;
			
	}

}
