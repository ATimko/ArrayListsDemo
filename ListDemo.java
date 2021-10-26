/*
   TCSS 143 
   Author: Ashley Timko
   10/26/21
   Description: List Demo 
*/
import java.util.*;

public class ListDemo {
   public static void main(String args[])   {
      List<Integer> list = new ArrayList<Integer>(20); // Using Polymorphism int -> Integer
      
      // Add few integers 
      list.add(123);
      list.add(20);
      list.add(400);
      list.add(98);
      System.out.println(list);   // making a call to toString() method 
      
      // Insert element in a list
      list.add(2,11);
      //list.add(10,89);          //throws exception as list.size() = 5   
      list.add(20);
      list.add(20);               // duplicate elements
      System.out.println(list);
      
      // Loop and compare list elements 
      // Step 1: for loop and using compareTo() method of the Integer class 
      for(int i = 0; i < list.size()-1; i++)   {
         System.out.println(list.get(i).compareTo(list.get(i+1)));  // using compareTo of Integer wrapper class 
      }
      
      // Step 2: for loop and using relational operators for int 
      for(int i = 0; i < list.size()-1; i++)   {
         if(list.get(i) < list.get(i+1))
            System.out.println("Less than: -1");
         else if(list.get(i) > list.get(i+1))
            System.out.println("Greater than: 1");
         else 
            System.out.println("Equal: 0");
      }
      
      // Declare another List
      List<Integer> list2 = new LinkedList<Integer>();
      
      // Add few elements 
      list.add(3);
      list.add(8);
      list.add(19);
      
      // Add elements from list to list1
      list2.addAll(list);
      System.out.println(list2);
      
     
      //Remove even numbers from the list 
      for(int i = 0; i < list2.size(); i++)  {
         if(list2.get(i) % 2 == 0)  {
            list2.remove(i);  // remove(int index)
            i--;              // elements get shifted to left 
         }
      }
      
      System.out.println(list2); 
      
      
      /* How about using for-each loop for removing 
      for(Integer num:list2)   {
         if(num % 2 == 0)
            list2.remove(num); // which remove() method are you making a call to ?       
      }
      */
      
      
      // Remove 11 from the list 
      Integer x = 11;
      list2.remove(x);  // list2.remove(11) will throw exception -> remove(int)
      System.out.println(list2);
      
   }
}