package com.github.ronanquillevere.domain;

import javax.inject.Inject;

public class Whatever {
	private Service service;

	@Inject
	public Whatever(Service service) {
		this.service = service;
	}
	
	public boolean yeah(boolean param){
		service.doSomething();
		return param;
	}
}
