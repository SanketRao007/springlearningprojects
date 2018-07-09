package com.sankethomeprojects.receiver;

import javax.jms.ConnectionFactory;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CustomReceiverjndi2 {

	public static void main(String[] args) {
		ConnectionFactory factory = null;
		InitialContext initialContext;
		Queue queue = null;
		try {
			initialContext = new InitialContext();
			queue = (Queue) initialContext.lookup("jms/testQueue");
			factory = (ConnectionFactory) initialContext.lookup("jms/__defaultConnectionFactory");
			
			try (JMSContext context = factory.createContext()) {
				JMSConsumer consumer = context.createConsumer(queue);
				String message = consumer.receiveBody(String.class);
				System.out.println(message);
			}
		} catch (NamingException e) {
			System.out.println("naming lookup issue");
			e.printStackTrace();
		}
	}
}
