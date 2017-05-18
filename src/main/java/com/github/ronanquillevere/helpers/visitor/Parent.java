package com.github.ronanquillevere.helpers.visitor;

public abstract class Parent {
	abstract <IN,OUT> OUT accept(Visitor<IN,OUT> visitor, IN in);
}
