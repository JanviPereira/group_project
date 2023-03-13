import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SalaryTest {

	@Test
	public void testCalculateSalary() {
		Salary salary = new Salary(7000);
		salary.calculateSalary();
		assertEquals(700,salary.getHra());
		assertEquals(5110,salary.getDa());
		assertEquals(12810,salary.getGs());
		assertEquals(3843,salary.getIncomeTax());
		assertEquals(8967,salary.getNetSalary());
	}
	
	@Test
	public void testSetAndGetBasicSalary() {
		Salary salary = new Salary(7000);
		assertEquals(7000,salary.getBasicSalary());
		salary.setBasicSalary(14000);
		assertEquals(14000,salary.getBasicSalary());
	}

}
sass