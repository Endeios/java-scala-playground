package org.endeios.bridge;

object Bridge extends App {
	var myObj:MyReciverObject = new MyReciverObject();
	println(myObj);
	var a = myObj.isInstanceOf[MyReciverObject];
	println(a);
	myObj.doSomething
	println(myObj.getClientHost)
}