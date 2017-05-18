package com.github.ronanquillevere.application;

import javax.inject.Inject;

import com.github.ronanquillevere.domain.Whatever;

public class App {
	private Whatever whatever;

	@Inject
	public App(Whatever whatever) {
		this.whatever = whatever;
	}

	public boolean cool(boolean param) {
		if (whatever.yeah(param))
			return false;
		return true;
	}
}
