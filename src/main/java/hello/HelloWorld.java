package hello;

import java.time.LocalTime;

//import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    //LocalTime currentTime = new LocalTime();
	LocalTime currentTime = LocalTime.now();
    System.out.println("The current local time is: " + currentTime);
    
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}

//helloworld.java
