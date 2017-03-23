package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT{
	private NewTelephoneCompany ntc;
	@Before
	public void setUp() throws Exception{
		ntc = new NewTelephoneCompany();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimecase1(){
		ntc.setStartTime(-5);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeCase2(){
		ntc.setStartTime(-1);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeCase3(){
		ntc.setStartTime(2544);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeCase4(){
		ntc.setStartTime(2400);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeCase5(){
		ntc.setStartTime(2401);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeCase6(){
		ntc.setStartTime(1578);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeCase7(){
		ntc.setStartTime(1160);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeCase8(){
		ntc.setStartTime(1161);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeCase9(){
		ntc.setStartTime(799);
	    ntc.setDuration(-5);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge_InvalidDuration_Case1() {
	    ntc.setStartTime(1800);
	    ntc.setDuration(0);
	    ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge_InvalidDuration_Case2() {
	    ntc.setStartTime(1801);
	    ntc.setDuration(-1);
	    ntc.computeCharge();
	} 
	@Test
	public void testGetStartTime() {
		ntc.setStartTime(2350);
		assertTrue("Testing getStartTime should be 2350 ", ntc.getStartTime()==2350);
	}

	@Test
	public void testSetStartTime() {
		ntc.setStartTime(1145);
		assertTrue("Testing setStartTime should be 1145 ", ntc.getStartTime()==1145);
	}

	@Test
	public void testGetDuration() {
		ntc.setDuration(40);
		assertTrue("Testing getDuration should be 40 ", ntc.getDuration()==40);
	}

	@Test
	public void testSetDuration() {
		ntc.setDuration(55);
		assertTrue("Testing setDuration should be 55 ", ntc.getDuration()==55);
	}

	@Test
	public void testStartTimeDurationDiscount() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		assertTrue("Testing start and duration discount should be 1768.0 ", ntc.computeCharge()==1768.0);
		ntc.setStartTime(759);
		ntc.setDuration(61);
		assertTrue("Testing start and duration discount should be 1078.48 ", ntc.computeCharge()==1078.48);
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		assertTrue("Testing start and duration discount should be 1078.48 ", ntc.computeCharge()==1078.48);
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		assertTrue("Testing start and duration discount should be 1149.20 ", ntc.computeCharge()==1149.20);

	}
	@Test
	public void testStartTimeOnlyDiscount() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		assertTrue("Testing start only discount should be 1248.0 ", ntc.computeCharge()==1248.0);
		ntc.setStartTime(400);
		ntc.setDuration(59);
		assertTrue("Testing start only discount should be 1227.20 ", ntc.computeCharge()==1227.20);
		ntc.setStartTime(759);
		ntc.setDuration(1);
		assertTrue("Testing start only discount should be 20.80 ", ntc.computeCharge()==20.80);
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		assertTrue("Testing start only discount should be 208.00 ", ntc.computeCharge()==208.00);
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		assertTrue("Testing start only discount should be 208.0 ", ntc.computeCharge()==208.00);
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		assertTrue("Testing start only discount should be 208.00 ", ntc.computeCharge()==208.00);
	}
	@Test
	public void testDurationOnlyDiscount() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		assertTrue("Testing start only discount should be 2298.4 ", ntc.computeCharge()==2298.4);
		ntc.setStartTime(900);
		ntc.setDuration(61);
		assertTrue("Testing start only discount should be 2156.96 ", ntc.computeCharge()==2156.96);
	}
	@Test
	public void testNoDiscount() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		assertTrue("Testing start only discount should be 1664.0 ", ntc.computeCharge()==1664.0);
		ntc.setStartTime(800);
		ntc.setDuration(1);
		assertTrue("Testing start only discount should be 41.60 ", ntc.computeCharge()==41.60);
		ntc.setStartTime(801);
		ntc.setDuration(59);
		assertTrue("Testing start only discount should be 2454.40 ", ntc.computeCharge()==2454.40);
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		assertTrue("Testing start only discount should be 2496.00 ", ntc.computeCharge()==2496.00);
	}

}
