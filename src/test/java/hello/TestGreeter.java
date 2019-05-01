package hello;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;





public class TestGreeter {



   private Greeter g = new Greeter();
   private Greeter nullGreeter = null;


   @Test

   @DisplayName("Test for Null")

   public void newest_ndw_WorkerPass()



   {

      assertNull(nullGreeter);

   }







   @Test

   @DisplayName("Test Sameness'")

   public void newest_ndw_WorkerFail()

   {

     g.setName("Something Something");
     String something = g.getName();
     String another_something = "Another Something";
     assertTrue(something == another_something);



   }



}
