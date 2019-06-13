package com.observablepattern.v2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ObserverIntegrationTest {
	
	@Test
	public void whenChangingNewsAgencyState_thenNewsChannelNotified()
	{
		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();
		
		observable.addPropertyChangeListener(observer);
		observable.setNews("Hello");
		
		assertEquals(observer.getNews(), "Hello");
	}

}
