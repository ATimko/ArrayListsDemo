/*
   Ashley Timko
   10/26/21
   Description: LinkedList Demo
*/
import java.util.*;

public class LinkedListDemo{
   public static void main(String[] args){
      //Declare a LinkedList
      LinkedList<String> list = new LinkedList<String>();
      
      //Add elements to the LinkedList
      list.add("this");
      list.add("is");
      list.add("lot");
      list.add("of");
      list.add("fun");
      list.add("for");
      list.add("Java");
      list.add("coders");
      
      //Display the list
      System.out.println(list);
      
      //Method to add "*****" before word with length 4
      markLength4(list);
   }
   /*
      Method: Add "*****" before word with length 4
      Param: LinkedList<String>
      Return: void
   */
   public static void markLength4(LinkedList<String> list){
      //Loop through the list
      for(i = 0; i < list.size(); i++){
         if(list.get(i).length() == 4){
            list.add(i, "****");
            i++;
         }
      }
      System.out.println(list);
   }
}