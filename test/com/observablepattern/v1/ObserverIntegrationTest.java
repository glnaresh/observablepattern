package com.observablepattern.v1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ObserverIntegrationTest {
	
	@Test
	public void whenChangingNewsAgencyState_thenNewsChannelNotified()
	{
		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();
		
		observable.addObserver(observer);
		
		observable.setNews("Hello");
		
		assertEquals(observer.getNews(), "Hello");
		
	}

}
