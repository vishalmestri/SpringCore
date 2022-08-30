package com.event;
import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

	private int number;
	
	public MyEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public MyEvent(Object source,int number) {
		super(source);
		this.number=number;
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}

}
