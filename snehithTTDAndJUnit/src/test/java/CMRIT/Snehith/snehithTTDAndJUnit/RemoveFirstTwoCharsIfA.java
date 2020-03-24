package CMRIT.Snehith.snehithTTDAndJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirstTwoCharsIfA {
	
	/*TODO list
	 * 1. A Is Not Present Both 1st And 2nd Index : BBAA --> BBAA - success
	 * 2. A Is Present in 1st Index : ABCD --> BCD - success
	 * 3. A Is Present in 2nd Index : BACD --> BCD - success
	 * 4. A Is present in Both 1st And 2nd Index : AABAA --> BAA - success
	 * 5. Is Empty : "" --> "" - success
	 * 6. Only One char A : A --> "" - success
	 * 7. Only One Char Not A : B --> B - success
	 */
	
	RemoveIfCharAPresentInFirstOrSecondIndex removeIfCharAPresentInFirstOrSecondIndex;
	@BeforeEach
	void setUp() {
		removeIfCharAPresentInFirstOrSecondIndex = new RemoveIfCharAPresentInFirstOrSecondIndex();
	}
	
	@Test
	void testCharANotAtFirstAndSecondIndex() {
		assertEquals("BBAA",removeIfCharAPresentInFirstOrSecondIndex.removeCharA("BBAA"));
	}
	
	@Test
	void testCharAAtFirstIndex() {
		assertEquals("BCD",removeIfCharAPresentInFirstOrSecondIndex.removeCharA("ABCD"));
	}
	
	@Test
	void testCharAAtSecondIndex() {
		assertEquals("BCD",removeIfCharAPresentInFirstOrSecondIndex.removeCharA("BACD"));
	}
	
	@Test
	void testCharAAtFristAndSecondIndex() {
		assertEquals("BB",removeIfCharAPresentInFirstOrSecondIndex.removeCharA("AABB"));
	}
	
	@Test
	void testIsEmpty() {
		assertEquals("",removeIfCharAPresentInFirstOrSecondIndex.removeCharA(""));
	}
	
	@Test
	void testOnecharA() {
		assertEquals("",removeIfCharAPresentInFirstOrSecondIndex.removeCharA("A"));
	}
	
	@Test
	void testOnecharNotA() {
		assertEquals("B",removeIfCharAPresentInFirstOrSecondIndex.removeCharA("B"));
	}
}
