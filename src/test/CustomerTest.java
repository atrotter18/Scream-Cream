package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Customer;
import model.CustomerBill;

public class CustomerTest {
	CustomerBill cost = new CustomerBill();
	Customer customer = new Customer("Jenny");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void oneScoopTest() {
		customer.setScoop(1);
		double bill = cost.calculateScoops(customer);
		assertEquals(3.99, bill, 3.99);
	}
	
	@Test
	public void twoSoopTest() {
		customer.setScoop(2);
		double bill = cost.calculateScoops(customer);
		assertEquals(9.78, bill, 9.78);
	}
	
	@Test
	public void threeSoopTest() {
		customer.setScoop(3);
		double bill = cost.calculateScoops(customer);
		assertEquals(17.37, bill, 17.37);
	}
	
	@Test
	public void moreThanTrueTest() {
		customer.setScoop(4);
		assertTrue(cost.tooMany(customer));
	}
	
	@Test
	public void moreThanFalseTest() {
		customer.setScoop(2);
		assertFalse(cost.tooMany(customer));
	}

}
