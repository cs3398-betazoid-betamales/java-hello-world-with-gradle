package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;



   @Before

   public void setUp() throws Exception

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty()

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }



   @Test

   public void testGreeter()

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }

   @Test

   public void newtestndw30GreeterPass()

   {

      g.setName("Grader");

      assertEquals(g.getName(),"Grader");

      assertEquals(g.sayHello(),"Hello Grader!");

   }

   @Test

   public void newestndw30GreeterFail()

   {

      g.setName("Darkness");

      assertEquals(g.getName(),"My Old Friend");

      assertEquals(g.sayHello(),"Hello I've come to talk with you again!");

   }

}
