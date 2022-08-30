import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.event.MyEvent;
import com.publish.MyPublisher;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		MyPublisher publisher=context.getBean("myPublisher",MyPublisher.class);
		publisher.publish(5);
		
	}
}
