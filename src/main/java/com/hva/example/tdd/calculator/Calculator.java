package com.hva.example.tdd.calculator;

public class Calculator {

	public Integer add(Integer i, Integer j) {
		if (i == null || j == null) {
			return null;
		}
		return i + j;
	}

	public Integer substract(Integer i, Integer j) {
		return i - j;
	}

}
