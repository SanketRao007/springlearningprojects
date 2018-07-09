package com.sankethomeprojects.producer;

import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CustomProducerjndi2 {

	public static void main(String[] args) {
		ConnectionFactory factory = null;
		InitialContext initialContext;
		Queue queue = null;
		try {
			initialContext = new InitialContext();
			queue = (Queue) initialContext.lookup("jms/testQueue");
			factory = (ConnectionFactory) initialContext.lookup("jms/__defaultConnectionFactory");
		} catch (NamingException e) {
			System.out.println("naming lookup issue");
			e.printStackTrace();
		}
		try (JMSContext context = factory.createContext()) {
			TextMessage message = context.createTextMessage("sending item 2");
			context.createProducer().send(queue, message);
			System.out.println("sent message: "+message);
		}
	}
}
