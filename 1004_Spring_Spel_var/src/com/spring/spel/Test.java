package com.spring.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		
		
		Calculation clc = new Calculation();
		
		StandardEvaluationContext context = new StandardEvaluationContext(clc);		
		ExpressionParser parser = new SpelExpressionParser();
		
		parser.parseExpression("number").setValue(context,5);
		
		System.out.println(clc.cube());

	}

}
