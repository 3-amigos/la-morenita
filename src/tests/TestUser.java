package Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUser {

	@Test
	public void testUserUser() {
		User test = new User(1, "odiscious", "password");
		User another = new User(test);
		assertEquals(1, another.getUsr_ID());
		assertEquals("odiscious", another.getName());
		assertEquals("password", another.getPassword());
	}

	@Test
	public void testUserIntStringString() {
		User test = new User(1, "odiscious", "password");
		assertEquals(1, test.getUsr_ID());
		assertEquals("odiscious", test.getName());
		assertEquals("password", test.getPassword());
	}

	@Test
	public void testEqualsUser() {
		User test = new User(1, "odiscious", "password");
		User test2 = new User(1, "odiscious", "password");
		assertEquals(test.getUsr_ID(), test2.getUsr_ID());
		assertEquals(test.getName(), test2.getName());
		assertEquals(test.getPassword(), test2.getPassword());
	}

	@Test
	public void testToString() {
		User test = new User(1, "odiscious", "password");
		assertEquals("ID: 1 Name: odiscious Password: password", test.toString());
	}

	@Test
	public void testClone() {
		User test = new User(1, "odiscious", "password");
		User clone = test.clone();
		
		assertEquals(test.getUsr_ID(), clone.getUsr_ID());
		assertEquals(test.getName(), clone.getName());
		assertEquals(test.getPassword(), clone.getPassword());
	}

	@Test
	public void testGetName() {
		User test = new User(1, "odiscious", "password");
		assertEquals("odiscious", test.getName());
	}

	@Test
	public void testSetName() {
		User test = new User(1, "odiscious", "password");
		test.setName("Jesus");
		assertEquals("Jesus", test.getName());
	}

	@Test
	public void testGetPassword() {
		User test = new User(1, "odiscious", "password");
		assertEquals("password", test.getPassword());
	}

	@Test
	public void testSetPassword() {
		User test = new User(1, "odiscious", "password");
		test.setPassword("The Christ");
		assertEquals("The Christ", test.getPassword());
	}

	@Test
	public void testGetUsr_ID() {
		User test = new User(1, "odiscious", "password");
		
		assertEquals(1, test.getUsr_ID());
	}

}
