package com.sankethomeprojects.producer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CustomReceiver {

	public static void main(String[] args) {
		ConnectionFactory factory = null;
		Connection conn = null;
		InitialContext initialContext;
		try {
			initialContext = new InitialContext();
			Queue queue = (Queue) initialContext.lookup("jms/testQueue");
			factory = (ConnectionFactory) initialContext.lookup("jms/__defaultConnectionFactory");
			conn = factory.createConnection();
			Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			MessageConsumer consumer = session.createConsumer(queue);
			conn.start();
			TextMessage message = (TextMessage) consumer.receive();
			String data = message.getText();
			System.out.println(data);
		} catch (NamingException e) {
			System.out.println("naming lookup issue");
			e.printStackTrace();
		} catch (JMSException e) {
			System.out.println("jms failure");
			e.printStackTrace();
		}
	}
}
