

import modules.*;
import static org.junit.Assert.*;

import org.junit.Test;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class CheckTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testCheck() {
		Calendar foo = Calendar.getInstance();
		foo.set(3, 10, 2016);
		Check chk = new Check(1, 20.00f, 1050, 45, foo);
		assertEquals(1, chk.getCheck_ID());
		assertEquals(20.00f, chk.getAmount(), 20.00f);
		assertEquals(1050, chk.getCheckNum());
		assertEquals(45, chk.getRoutingNum());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetAmount() {
		Calendar foo = Calendar.getInstance();
		foo.set(3, 10, 2016);
		Check chk = new Check(1, 20.00f, 1050, 45, foo);
		assertEquals(20.00f, chk.getAmount(), 0.00f);
	}

	@Test
	public void testSetAmount() {
		Calendar foo = Calendar.getInstance();
		foo.set(3, 10, 2016);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);
		chk.setAmount(30.00f);
		assertEquals(30.00f, chk.getAmount(), 0.00f);
	}

	@Test
	public void testGetCheckNum() {
		Calendar foo = Calendar.getInstance();
		foo.set(3, 10, 2016);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);
		assertEquals(1050, chk.getCheckNum());
	}

	@Test
	public void testSetCheckNum() {
		Calendar foo = Calendar.getInstance();
		foo.set(3, 10, 2016);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);
		chk.setCheckNum(1111);
		assertEquals(1111, chk.getCheckNum());
	}

	@Test
	public void testGetRoutingNum() {
		Calendar foo = Calendar.getInstance();
		foo.set(3, 10, 2016);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);
		assertEquals(45, chk.getRoutingNum());
	}

	@Test
	public void testSetRoutingNum() {
		Calendar foo = Calendar.getInstance();
		foo.set(3, 10, 2016);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);
		chk.setRoutingNum(1001);
		assertEquals(1001, chk.getRoutingNum());
	}

	@Test
	public void testGetCheckDate() {
			
		Calendar foo = Calendar.getInstance();
		foo.set(2016, 3, 10);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);

		assertEquals(10, chk.getCheckDate().get(Calendar.DAY_OF_MONTH));
		assertEquals(3, chk.getCheckDate().get(Calendar.MONTH));
		assertEquals(2016, chk.getCheckDate().get(Calendar.YEAR));
	}

	@Test
	public void testSetCheckDate() {
		Calendar foo = Calendar.getInstance();
		foo.set(2016, 3, 10);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);
		foo.set(2016, 5, 22);
		chk.setCheckDate(foo);
		assertEquals(2016, chk.getCheckDate().get(Calendar.YEAR));
		assertEquals(5, chk.getCheckDate().get(Calendar.MONTH));
		assertEquals(22, chk.getCheckDate().get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void testGetCheck_ID() {
		Calendar foo = Calendar.getInstance();
		foo.set(2016, 3, 10);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);
		assertEquals(1, chk.getCheck_ID());
	}
	
	//make sure to include @Test for new JUnit test cases...
	@Test
	public void testEquals(){
		Calendar foo = Calendar.getInstance();
		foo.set(3, 10, 2016);
		Check chk = new Check(1, 20.00f, 1050, 45,  foo);
		Check chk2 = new Check(1, 20.00f, 1050, 45, foo);
		
		assertEquals(true, chk.equals(chk2));
	}

}
