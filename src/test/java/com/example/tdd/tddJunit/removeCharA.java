/**
 * 
 */
package com.example.tdd.tddJunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Sparsh
 *
 */

/*TODO List
 * 1. ABCD => BCD 		First A Should Be Removed
 * 2. AACD => CD		First two A's Should Be Removed
 * 3. BACD => BCD 		Second A Should Be Removed
 * 4. BBAA => BBAA		No A's Should Be Removed (As They Occur After 2nd Index)
 * 5. AABAA => BAA		First two A's Should Be Removed & Rest Must Be Ignored (As They Occur After 2nd Index)
 */
		
class removeCharA {

	RemoveA removeA;	//Object Reference
	
	@BeforeEach
	void setup()
	{
		removeA = new RemoveA();	//Object Initialization For Each Test (Before Each)
	}
	
	@Test
	void testForFirstA() {
		assertEquals("BCD", removeA.removeChar("ABCD"));	//First A Removed
	}
	
	@Test
	void testForSecondA() {
		assertEquals("BCD", removeA.removeChar("BACD"));	//Second A Removed
	}
	
	@Test
	void testForNoA() {
		assertEquals("BBAA", removeA.removeChar("BBAA"));	//No A's Removed As They Occur After 2nd Index
	}
	
	@Test
	void testForFirstTwoAs() {
		assertEquals("CD", removeA.removeChar("AACD"));		//First Two A's Removed
	}
	
	@Test
	void testForFirstTwoIgnoringOtherAs() {
		assertEquals("BAA", removeA.removeChar("AABAA"));	//First Two A's Removed Ignoring Other A's (As They Occur After 2nd Index)
	}

}
