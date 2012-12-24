package org.endeios.bridge
import org.scalatest.FlatSpec
import org.scalatest.FunSuite

class MyTest extends FunSuite {

  test("client should be able to instantiate a java object") {
    val a = new MyReciverObject();
    assert(a != null);
  }

  test("instance element should be instance of the class") {
    var myObj: MyReciverObject = new MyReciverObject();
    var a = myObj.isInstanceOf[MyReciverObject];
    assert(a);
  }

  test("it should be possible to call methods from java in scala") {
    var myObj: MyReciverObject = new MyReciverObject();
    assert(myObj.getClientHost == "localhost")
    myObj.doSomething
    println(myObj.getClientHost)
    assert(myObj.getClientHost == "TEST")

  }

}