package com.github.ronanquillevere.infrastructure;

import javax.inject.Singleton;

import com.github.ronanquillevere.domain.Service;
import com.google.inject.AbstractModule;


public class InjectionModule extends AbstractModule {
	@Override
	protected void configure() {
		
		bind(Service.class).to(ServiceImpl.class).in(Singleton.class);

	}
}
