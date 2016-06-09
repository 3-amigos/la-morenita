package Demo;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Test;

public class TestInvoice {

	@Test
	public void testInvoice() {
		//prep for tests
		Calendar date = Calendar.getInstance();
		date.set(2016, 5, 22);
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		User test = new User(1, "odiscious", "password");
		ArrayList<Check> list = new ArrayList<Check>();
		Invoice invoice = new Invoice(1, date, new ArrayList<Check>(), x, test);
		//tests
		assertEquals(1, invoice.getInvoice_id());
		assertEquals(2016, invoice.getDate().get(Calendar.YEAR));
		assertEquals(5, invoice.getDate().get(Calendar.MONTH));
		assertEquals(22, invoice.getDate().get(Calendar.DAY_OF_MONTH));
		assertEquals(list, invoice.getChecks());
		//check Customer
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
		//check User
		assertEquals(1, invoice.getUsr().getUsr_ID());
		assertEquals("odiscious", invoice.getUsr().getName());
		assertEquals("password", invoice.getUsr().getPassword());
	}

	@Test
	public void testGetDate() {
		//prep for tests
		Calendar date = Calendar.getInstance();
		date.set(2016, 5, 22);
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		User test = new User(1, "odiscious", "password");
		ArrayList<Check> list = new ArrayList<Check>();
		Invoice invoice = new Invoice(1, date, new ArrayList<Check>(), x, test);
		//tests
		assertEquals(2016, invoice.getDate().get(Calendar.YEAR));
		assertEquals(5, invoice.getDate().get(Calendar.MONTH));
		assertEquals(22, invoice.getDate().get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void testSetDate() {
		//prep for tests
		Calendar date = Calendar.getInstance();
		date.set(2016, 5, 22);
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		User test = new User(1, "odiscious", "password");
		ArrayList<Check> list = new ArrayList<Check>();
		Invoice invoice = new Invoice(1, date, new ArrayList<Check>(), x, test);
		//tests
		date.set(2000, 3, 30);
		invoice.setDate(date);
		assertEquals(2000, invoice.getDate().get(Calendar.YEAR));
		assertEquals(3, invoice.getDate().get(Calendar.MONTH));
		assertEquals(30, invoice.getDate().get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void testGetChecks() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetChecks() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsr() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUsr() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInvoice_id() {
		//prep for tests
		Calendar date = Calendar.getInstance();
		date.set(2016, 5, 22);
		Customer x = new Customer(1, "mr.", "odiscious", "oliver", 
				"dozier", "", "", "808-783-0078", "27948 ne 147th cir", 
				"duvall", "WA", 98019);
		User test = new User(1, "odiscious", "password");
		ArrayList<Check> list = new ArrayList<Check>();
		Invoice invoice = new Invoice(1, date, new ArrayList<Check>(), x, test);
		//tests
	}

}
