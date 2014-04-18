package com.qmaker.strategy.employee.impl;

import com.qmaker.strategy.calc.Calc;
import com.qmaker.strategy.calc.impl.CalcMonitor;
import com.qmaker.strategy.employee.Employee;

public class MonitorEmpl extends Employee {
	
	private Calc calc;
	
	public MonitorEmpl(){
		calc = new CalcMonitor();
	}
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		
		String string = "我是班长，我的工资是"+calc.calcWages();
		return string;
		
	}
}
