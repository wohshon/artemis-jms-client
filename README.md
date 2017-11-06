### Test JMS client for artemis

#### recv or listen (blocking)

```
java -cp /home/virtuser/workspace10/artemis.client/artemisclient.jar com.demo.artemis.client.s.JMSClient 'http-remoting://192.168.223.130:8080' jmsuser jboss.1234 jms/queue/queue1 q 'dummy' jms/RemoteConnectionFactory 0

```

#### send, loops every sec and append a counter to message

```
java -cp /home/virtuser/workspace10/artemis.client/artemisclient.jar com.demo.artemis.client.s.JMSClient 'http-remoting://192.168.223.130:8080' jmsuser jboss.1234 jms/queue/queue1 q 'test' jms/RemoteConnectionFactory 1

```

q = queue object

t = topic object
