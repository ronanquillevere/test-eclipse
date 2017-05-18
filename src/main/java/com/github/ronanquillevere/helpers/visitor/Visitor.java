package com.github.ronanquillevere.helpers.visitor;

public interface Visitor<IN,OUT> {
	
	OUT visit(Child1 child, IN in);
	
	OUT visit(Child2 child, IN in);
}
