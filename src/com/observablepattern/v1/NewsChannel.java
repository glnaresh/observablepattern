package com.observablepattern.v1;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {
	
	private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	@Override
	public void update(Observable o, Object news) {
		// TODO Auto-generated method stub
		this.setNews((String) news);

	}


}
