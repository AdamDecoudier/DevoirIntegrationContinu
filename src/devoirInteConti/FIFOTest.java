package devoirInteConti;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {
	
	FIFO fifo1 = null;

	@BeforeEach
	void setUp() throws Exception {
		fifo1 = new FIFO();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void Should_returnSizePlusOne_when_addMethodIsUsed() {
		int size = fifo1.size();
		fifo1.add(2);
		int size2 = fifo1.size();
		assertEquals(size2,++size);
	}
	
	@Test
	void Should_returnTwo_when_addMethodIsUsed(){
		Integer number = 2;
		fifo1.add(2);
		assertEquals(number, fifo1.first());
	}
	
	@Test
	void Should_returnError_when_FIFOIsEmpy() {
		Assertions.assertThrows(NoSuchElementException.class,()->{fifo1.first();});
	}
	
	@Test
	void Should_returnTrue_when_addMethodIsNotUsed() {
		assertTrue(fifo1.isEmpty());
	}
	
	@Test
	void Should_returnFalse_when_addMethodIsUsed() {
		fifo1.add(2);
		assertFalse(fifo1.isEmpty());
	}
	
	@Test
	void Should_returnTwo_when_FirstElementIsRemoved() {
		fifo1.add(1);
		fifo1.add(2);
		fifo1.removeFirst();
		Integer number = 2;
		
		assertEquals(number, fifo1.first());
	}
	
	@Test
	void Should_returnZero_when_FifoIsEmpty() {
		assertEquals(0,fifo1.size());
	}
	
	void Should_returnOne_when_addMethodIsUsed() {
		fifo1.add(2);
		assertEquals(1,fifo1.size());
	}
}
