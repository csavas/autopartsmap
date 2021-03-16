//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn Savas

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
 public static void main( String args[] ) throws IOException
 {
  //add test cases
   Scanner data = new Scanner(new File("acro.dat"));
   int num = data.nextInt();
   data.nextLine();
   Acronyms test = new Acronyms();
   for(int i=0; i < num; i++){
     test.putEntry(data.nextLine());
   }
   test.convert(data.nextLine());
 }
}