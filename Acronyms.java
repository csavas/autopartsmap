//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn Savas

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
 private Map<String,String> acronymTable;

 public Acronyms()
 {
   acronymTable = new TreeMap<String, String>();
 }

 public void putEntry(String entry)
 {
   String[] list = entry.split(" - ");
   acronymTable.put(list[0], list[1]);
 }

 public String convert(String sent)
 {
  Scanner chop = new Scanner(sent);
  String[] list = sent.split(" ");
  String output ="";
   for(int s =0; s < list.length; s++){
     if(acronymTable.containsKey(list[s])){
       list[s] = acronymTable.get(list[s]);
     }
     output+= list[s] + " ";
  }
   /* while(chop.hasNext()){
    * String word = chop.next();
    * String noPunct=word.replaceAll("\\p{Punct}", "");
    * if(acronymTable.get(noPunct)== null){
    * output+=word + " ";
    * }
    * else if (word.compareTo(noPunct) !=0){
    * output+=acronymTable.get(noPunct)+ ".";
    * }
    * else
    * output+= acronymTable.get(word) + " ";
    * 
    */
   System.out.println(output);
  return output;
 }

 public String toString()
 {
  return "";
 }
}