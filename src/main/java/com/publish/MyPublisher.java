package com.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.event.MyEvent;

@Component
public class MyPublisher {

	@Autowired
	ApplicationEventPublisher applicationEventPublisher;
	
	public void publish(int number) {
		System.out.println("MyPublisher-publish| number="+number);
		MyEvent myEvent= new MyEvent(this, number);
		applicationEventPublisher.publishEvent(myEvent);
		
	}
}
