package com.github.ronanquillevere.helpers.visitor;

public class Child2 extends Parent {

	@Override
	<IN, OUT> OUT accept(Visitor<IN, OUT> visitor, IN in) {
		return visitor.visit(this, in);
	}

}
