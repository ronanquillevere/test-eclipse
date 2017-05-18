package com.github.ronanquillevere;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.github.ronanquillevere.application.App;
import com.github.ronanquillevere.domain.Whatever;

public class TestApp {
	
	@Test
	public void test(){
		
		//Given
		Whatever whatever = mock(Whatever.class);
		when(whatever.yeah(anyBoolean())).thenReturn(true);
		
		App app = new App(whatever); 
		
		//When
		boolean cool = app.cool(true);
		
		//Then
		verify(whatever,times(1)).yeah(true);
		verifyNoMoreInteractions(whatever);
		assertThat(cool).isEqualTo(false);
	}
	
	@Test
	public void test2(){
		
		//Given
		Whatever whatever = mock(Whatever.class);
		when(whatever.yeah(anyBoolean())).thenReturn(false);
		
		App app = new App(whatever); 
		
		//When
		boolean cool = app.cool(false);
		
		//Then
		verify(whatever,times(1)).yeah(false);
		verifyNoMoreInteractions(whatever);
		assertThat(cool).isEqualTo(true);
	}
}
