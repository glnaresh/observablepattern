package com.observablepattern.v2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NewsAgency {
	
	private String news;
	
	private PropertyChangeSupport propertyChangeSupport;
	
	public NewsAgency() {
		propertyChangeSupport = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
	}
	
	public void setNews(String value)
	{
		propertyChangeSupport.firePropertyChange("news", this.news, value);
	}

}
