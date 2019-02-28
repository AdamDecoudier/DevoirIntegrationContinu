package devoirInteConti;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void Should_returnListIncreasing_when_triCroissantMethodIsUsed() {
		int tableau[] = {2,5,6,1,7};
		int tableau2[] = {1,2,5,6,7};
		TriTableau.triCroissant(tableau);
		assertArrayEquals(tableau2, tableau);
	}
	
	@Test
	void Should_returnListIncreasing_when_triDecroissantMethodIsUsed() {
		int tableau[] = {2,5,6,1,7};
		int tableau2[] = {7,6,5,2,1};
		TriTableau.triDecroissant(tableau);
		assertArrayEquals(tableau2, tableau);
	}

}
