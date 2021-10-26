/*
   Ashley Timko
   10/26/21
   Description: ArrayList Demo
*/
import java.util.*;
import java.in.*;

public class ArrayListDemo{
   public static void main(String[] args) throws FileNotFoundException{
   //Declare scanner to read from file
   //Scnr = ip
   Scanner scnr = new Scanner(new File("words.txt"));
   //Declare the ArrayList to store words
   ArrayList<String> words = new ArrayList<String>();
   
   //Read from file and store elements in the ArrayList
   //while(scnr.hasNext()) File is too large and will take time
   for(int i = 0; i < 2000; i++){
      words.add(scnr.next());
   }
   // Task1: Display the ArrayList
   System.out.println(words);    //toString() of the ArrayList
   
   // Task 2: Display words in reverse order
   displayReverse(words);
   
   // Task 3: Display words ending with "s" capitalized
   displayPlurals(words);
   
   // Task 4: Remove words ending with "s"
   removePlurals(words);
   System.out.println(words);
      
   }
   // Task 5: Add "*" after each words
   addStars(words);
   System.out.println(words);
   
   /*
      Method: Display words in reverse order
      Param: ArrayList<String>
      Return: void
   */
   public static void displayReverse(ArrayList<String> list){
      //Loop through the list
      for(int i = list.size()-1; i >= 0; i--){
         System.out.print(list.get(i) + " ");   
      }
      System.out.println();
   }
   /*
      Method: Display words ending with "s" capitalized
      Param: ArrayList<String>
      Return: void
   */
   public static void displayPlurals(ArrayList<String> list){
      //Loops through the list
      for(String str:list){
         if(str.endsWith("s"))
            System.out.print(str.toUpperCase() + " ");
      }
      System.out.println();
   }
   /*
      Method: Remove words ending with "s"
      Param: ArrayList<String>
      Return: void
   */   
   public static void removePlurals(ArrayList<String> list){
      //Loop through the list
      for(i = 0; i < list.size(); i++){
         if(list.get(i).endsWith("s") || list.get(i).endsWith("S")){
            list.remove(i);
            i--;
         }   
      }
   }
      /*
      Method: Add star aftereach void
      Param: ArrayList<String>
      Return: void
   */
   public static void addStars(ArrayList<String> list){
      //Loops through the list
      for(int i = 1; i < list.size(); i+=2){
         list.add(i, "*");
      }
      System.out.println(list);
   }
}