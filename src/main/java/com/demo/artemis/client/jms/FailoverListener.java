package com.demo.artemis.client.jms;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;

import org.apache.activemq.artemis.api.core.client.FailoverEventListener;
import org.apache.activemq.artemis.api.core.client.FailoverEventType;

public class FailoverListener implements FailoverEventListener {

	private Session session;
	private Connection connection;
	public FailoverListener(Session session,Connection connection) {
		this.session=session;
		this.connection=connection;
	}
	@Override
	public void failoverEvent(FailoverEventType eventType) {
		System.out.println("Failover event triggered :" + eventType.toString());
        try {
			session=connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
