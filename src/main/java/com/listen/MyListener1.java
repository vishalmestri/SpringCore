package com.listen;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.event.MyEvent;
@Component
public class MyListener1 {

	@EventListener
	public void listen(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("MyListener1-listen| number="+event.getNumber());
		
	}
}
