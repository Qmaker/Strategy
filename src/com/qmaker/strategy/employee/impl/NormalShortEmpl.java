package com.qmaker.strategy.employee.impl;

import com.qmaker.strategy.calc.Calc;
import com.qmaker.strategy.calc.impl.CalcNormal;
import com.qmaker.strategy.employee.Employee;

/**
 * 短期工
 * @author lucy
 *
 */

public class NormalShortEmpl extends Employee{

	private Calc calc;
	
	public NormalShortEmpl(){
		calc = new CalcNormal();
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		
		String string = "我是短期工，我的工资是"+calc.calcWages();
		return string;
		
	}
	
	
}
