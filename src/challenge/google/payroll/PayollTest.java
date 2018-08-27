package challenge.google.payroll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PayollTest {

	@Test
	void testLucklyLambs1() {
		// arrange
		int test = 10;

		// act
		int actual = Payroll.answer(test);
		int expected = 1;

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void testLucklyLambs2() {
		// arrange
		int test = 143;

		// act
		int actual = Payroll.answer(test);
		int expected = 3;

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void testLucklyLambs3() {
		// arrange
		int test = 143;

		// act
		int actual = Payroll.answer(test);
		int expected = 3;

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void testLucklyLambs4() {
		// arrange
		int test = 0;

		// act
		int actual = Payroll.answer(test);
		int expected = 0;

		// assert
		assertEquals(expected, actual);

	}

}
