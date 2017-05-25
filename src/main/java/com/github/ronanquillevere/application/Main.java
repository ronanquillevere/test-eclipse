package com.github.ronanquillevere.application;

import com.github.ronanquillevere.infrastructure.InjectionModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main 
{
    public static void main( String[] args )
    {
    	Injector injector = Guice.createInjector(new InjectionModule());
    	
    	App app = injector.getInstance(App.class);
    	
    	boolean result = app.cool(false);
    	
    	System.out.println("result is " + result);
    }
}
