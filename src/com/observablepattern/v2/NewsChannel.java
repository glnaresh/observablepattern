package com.observablepattern.v2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NewsChannel implements PropertyChangeListener {
	
	private String news;
	

	public String getNews() {
		return news;
	}


	public void setNews(String news) {
		this.news = news;
	}


	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		this.setNews((String) evt.getNewValue());

	}

}
