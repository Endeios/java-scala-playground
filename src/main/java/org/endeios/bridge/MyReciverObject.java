package org.endeios.bridge;

public class MyReciverObject {
	private Client client ;
	public MyReciverObject() {
		client = new Client("a", 1000);
	}
	
	public void doSomething(){
		client.host_$eq("TEST");
		System.out.println(client.host());
		return;
	}
	
	public String getClientHost() {
		return client.host();
	}
	
}
