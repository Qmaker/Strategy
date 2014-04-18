package com.qmaker.strategy.employee;

import com.qmaker.strategy.calc.Calc;

/**
 * employee 父类
 * @author lucy
 *
 */
public abstract class Employee {
	
	private Calc calc;	
	
	public String display(){
		return null;
	};
	
	public Calc getCalc() {
		return calc;
	}

	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	
}
