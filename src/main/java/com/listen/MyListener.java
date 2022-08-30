package com.listen;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.event.MyEvent;
@Component
public class MyListener implements ApplicationListener<MyEvent>{

	@Override
	public void onApplicationEvent(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("MyListener-onApplicationEvent| number="+event.getNumber());
		
	}
	
	
	

}
