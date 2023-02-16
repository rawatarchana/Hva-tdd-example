package com.hva.example.tdd.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calc = new Calculator();
	
	@Test
	void testCanCreateACalculator() {
		assertThat(this.calc).isNotNull();
	}

	@Test
	void testCanAddCalculator() {
		assertThat(this.calc.add(1,1)).isNotNull();
	}
	
	@Test
	void testCanAddCalculatorWithNull() {
		assertThat(this.calc.add(null,1)).isNull();
	}

	@Test
	void testCanSubtract() {
		assertThat(this.calc.substract(50,20)).isEqualTo(30);
		assertThat(this.calc.substract(30,50)).isEqualTo(-20);
	}
	
}
